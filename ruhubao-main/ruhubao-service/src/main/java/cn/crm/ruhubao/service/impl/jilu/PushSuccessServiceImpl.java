package cn.crm.ruhubao.service.impl.jilu;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.crm.ruhubao.jilu.PushSuccessService;
import cn.crm.ruhubao.mapper.jilu.PushSuccessMapper;
import cn.crm.ruhubao.pojo.jilu.PushSuccess;

@Service
public class PushSuccessServiceImpl implements PushSuccessService{
	
	@Autowired
	private PushSuccessMapper pushSuccessMapper;

	@Override
	public PushSuccess queryById(Serializable id) {
		PushSuccess pushSuccess = pushSuccessMapper.selectByPrimaryKey((Integer) id);
		return pushSuccess;
	}

	@Override
	public List<PushSuccess> selectByExample() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PushSuccess> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer queryCountByWhere(PushSuccess t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PushSuccess> queryListByWhere(PushSuccess t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PushSuccess> queryListByPage(Integer page, Integer rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSelective(PushSuccess t) {
		pushSuccessMapper.insertSelective(t);
		
	}

	@Override
	public void updateSelective(PushSuccess t) {
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

}
