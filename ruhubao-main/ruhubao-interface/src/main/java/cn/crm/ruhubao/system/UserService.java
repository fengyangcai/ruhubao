package cn.crm.ruhubao.system;

import java.util.List;

import cn.crm.ruhubao.base.BaseService;
import cn.crm.ruhubao.pojo.User;

public interface UserService extends BaseService<User> {
	//测试一次
	List<String> selectResourceKey(Integer id);

	
	
}
