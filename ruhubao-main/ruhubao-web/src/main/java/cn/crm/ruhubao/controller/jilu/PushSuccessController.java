package cn.crm.ruhubao.controller.jilu;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.crm.ruhubao.jilu.PushSuccessService;
import cn.crm.ruhubao.pojo.jilu.PushSuccess;

@Controller
@RequestMapping("/pushSuccess")
public class PushSuccessController {

	private Map<String, Object> map =new HashMap<String, Object>();
	@Autowired
	private PushSuccessService pushSuccessService;
	
	
	@CrossOrigin(origins = "*", allowedHeaders="*")
	@RequestMapping("/savaPushSuccess")
	public ResponseEntity<Map<String,Object>> savaPushSuccess(PushSuccess pushSuccess){
		try {
			/*
			 * String psName = new
			 * String(pushSuccess.getPsName().getBytes("iso8859-1"),"UTF-8");
				pushSuccess.setPsName(psName);
			 */
		
			pushSuccessService.saveSelective(pushSuccess);
			map.put("code", "200");
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		
	}
	
}
