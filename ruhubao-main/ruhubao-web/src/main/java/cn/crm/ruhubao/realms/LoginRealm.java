package cn.crm.ruhubao.realms;

import java.util.List;

import javax.sound.midi.MidiDevice.Info;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import cn.crm.ruhubao.pojo.User;
import cn.crm.ruhubao.system.UserService;

public class LoginRealm extends AuthorizingRealm{
	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//执行授权
		System.out.println("执行授权的操作");
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		
		Subject subject = SecurityUtils.getSubject();
		User loginUser =(User) subject.getPrincipal();
		
		//获取当前登录用户的所有授权码
		List<String> permsList=userService.selectResourceKey(loginUser.getId());
		
		for (String perms : permsList) {
			if (perms!=null&&!perms.trim().equals("")) {
				info.addStringPermission(perms);
			}
		}
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//执行认证操作
		System.out.println("执行认证操作");
		//取出用户的数输入的数据
	UsernamePasswordToken userToken =(UsernamePasswordToken) token;
	//判断该用户是否存在
	User user =new User();
	user.setUserName(userToken.getUsername());
	List<User> users = userService.queryListByWhere(user);
	if (users.size()<1) {
		return null;
	}
	for (User user2 : users) {
		user.setPassword(user2.getPassword());
		break;
	}
	
	// 返回数据库的密码给shiro
	//pricipals：登录成功后，需要返回给login方法的信息
		return new SimpleAuthenticationInfo(user, user.getPassword(), user.getUserName());
	}

}
