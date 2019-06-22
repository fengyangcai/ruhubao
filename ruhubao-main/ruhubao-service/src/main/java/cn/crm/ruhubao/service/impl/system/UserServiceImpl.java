package cn.crm.ruhubao.service.impl.system;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.crm.ruhubao.mapper.UserMapper;
import cn.crm.ruhubao.pojo.User;
import cn.crm.ruhubao.system.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryById(Serializable id) {
		
		 
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectByExample() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer queryCountByWhere(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> queryListByWhere(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> queryListByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSelective(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSelective(User t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByIds(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> selectResourceKey(Integer id) {
		
		return userMapper.selectResourceKey(id);
	}

}
