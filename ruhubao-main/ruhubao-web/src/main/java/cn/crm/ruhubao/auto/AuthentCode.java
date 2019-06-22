package cn.crm.ruhubao.auto;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.crm.ruhubao.base.RedisService;
import cn.crm.ruhubao.base.RedisString;
import cn.crm.ruhubao.base.SendSmsByaliUtils;
import cn.crm.ruhubao.base.YanZhengMa;

@Controller
@RequestMapping("/autoCode")
public class AuthentCode {

	@Autowired
	private RedisService redisService;

	final static HashMap<String, Object> map = new HashMap<String, Object>();
	static String code4 = null;

	@RequestMapping(value = "/getCode", method = RequestMethod.POST)
	public ResponseEntity<HashMap<String,Object>> getCode(@RequestParam(value = "customerPhone", required = true) String customerPhone) {

		try {
			// 查一下有没有存在的了
			code4 = redisService.get(RedisString.CODE+ customerPhone);
			if (code4 != null) {
				redisService.del(code4);
			}

			// 调用短信平台發送短信,发送给阿里云短信平台的00开始短信平台会自动去掉所以生成的验证码开头没有00.
			// 所以这个工具类的开头不为0
			code4 = YanZhengMa.getCode4();

			SendSmsByaliUtils.sendSms(customerPhone, code4);

			//
			redisService.setex(RedisString.CODE + customerPhone, 5 * 60, code4);

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


}
