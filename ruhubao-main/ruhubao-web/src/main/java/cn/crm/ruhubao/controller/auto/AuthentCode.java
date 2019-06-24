package cn.crm.ruhubao.controller.auto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.crm.ruhubao.base.RedisService;
import cn.crm.ruhubao.base.RedisString;
import cn.crm.ruhubao.base.SendSmsByaliUtils;
import cn.crm.ruhubao.base.YanZhengMa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
/**  

* <p>Title: AuthentCode</p>  

* <p>Description: </p>  

* @author fyc 

* @date 2019年6月24日  

*/  
@Api(value = "AuthentCode|验证码控制类")
@Controller
@RequestMapping("/authCode")
public class AuthentCode {

	@Autowired
	private RedisService redisService;

	final static HashMap<String, Object> map = new HashMap<String, Object>();
	static String code4 = null;
	
	
	/**
     * 获取验证码的接口
     * @param cstTelPhone 客户的手机号码
     * @return json：返回{ma:验证码的值}
     */
	@ApiOperation(value = "获取验证码",notes ="获取方式可以是哦get和post,参数一定要有" )
	@ApiImplicitParam(paramType="String", name = "cstTelPhone", value = "用户号码", required = true, dataType = "String")
	@CrossOrigin(origins = "*", allowedHeaders="*")
	@RequestMapping(value = "/getCode")
	public ResponseEntity<HashMap<String,Object>> getCode(@RequestParam(value = "telPhone", required = true) String telPhone) {
			
		try {
			// 查一下有没有存在的了
			code4 = redisService.get(RedisString.CODE+ telPhone);
			if (code4 != null) {
				redisService.del(code4);
			}

			// 调用短信平台發送短信,发送给阿里云短信平台的00开始短信平台会自动去掉所以生成的验证码开头没有00.
			// 所以这个工具类的开头不为0
			code4 = YanZhengMa.getCode4();

			SendSmsByaliUtils.sendSms(telPhone, code4);

			//
			redisService.setex(RedisString.CODE + telPhone, 5 * 60, code4);

			// Map map =new HashMap<String,String>();
			map.put("ma", code4);

			// 测试
			// map.put("ceshicode","0015");
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 返回500
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	}
	
	//填表单的人数的增加yi
	@CrossOrigin(origins = "*", allowedHeaders="*")
	@RequestMapping("/addCountNumber")
	public ResponseEntity<Map<String,Object>> addCountNumber() {
		
		try {
			String fangwenCountNumber = redisService.get(RedisString.FANGWENCONTNUMBER);
			if (fangwenCountNumber==null) {
				redisService.set(RedisString.FANGWENCONTNUMBER, "5589");
			}
			Integer temp = new Integer(fangwenCountNumber);
			
			temp+=1;
			redisService.set(RedisString.FANGWENCONTNUMBER, temp+"");
			map.put("code", "200");
			
			return ResponseEntity.ok(map);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	@CrossOrigin(origins = "*", allowedHeaders="*")
	@RequestMapping("/getCountNumber")
	public ResponseEntity<HashMap<String,Object>> getCountNumber(){
		try {
			String fangwenCountNumber = redisService.get(RedisString.FANGWENCONTNUMBER);
			if (fangwenCountNumber==null) {
				fangwenCountNumber=redisService.set(RedisString.FANGWENCONTNUMBER, "5589");
			}
			map.put("countNumber", fangwenCountNumber);
			
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}


}
