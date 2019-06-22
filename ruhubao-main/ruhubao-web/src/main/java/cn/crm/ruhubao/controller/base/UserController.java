package cn.crm.ruhubao.controller.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.crm.ruhubao.system.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	//提交测试一下啊
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public void userLogin() {
		
		
		
	}
	
}
