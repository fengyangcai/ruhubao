package cn.crm.ruhubao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.crm.ruhubao.base.BaseDictService;
import cn.crm.ruhubao.mapper.base.BaseDictMapper;
import cn.crm.ruhubao.pojo.base.BaseDict;
import cn.crm.ruhubao.pojo.base.BaseDictExample;
import cn.crm.ruhubao.pojo.base.BaseDictExample.Criteria;

@Service
public class BaseDictServiceImpl implements BaseDictService{
	
	@Autowired
	private BaseDictMapper baseDictMapper;

	@Override
	public void insert(BaseDict baseDict) {
		baseDictMapper.insertSelective(baseDict);
		
	}

	@Override
	public void delete(Integer baseDictId) {
		baseDictMapper.deleteByPrimaryKey(baseDictId);
		
	}

	@Override
	public void update(BaseDict baseDict) {
		// TODO Auto-generated method stub
		baseDictMapper.updateByPrimaryKeySelective(baseDict);
	}

	@Override
	public BaseDict selectByBaseDictId(Integer baseDictid) {
		
		return baseDictMapper.selectByPrimaryKey(baseDictid);
	}

	

	@Override
	public List<BaseDict> selectByTypeCode(String typeCode) {
		// TODO Auto-generated method stub
		BaseDictExample example = new BaseDictExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictTypeCodeEqualTo(typeCode);
		List<BaseDict> list = baseDictMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<BaseDict> selectByTypeName(String typeName) {
		
		BaseDictExample example = new BaseDictExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictTypeNameEqualTo(typeName);
		List<BaseDict> list = baseDictMapper.selectByExample(example);
		return list;
	}

	@Override
	public BaseDict selectByItemName(String itemName) {
		BaseDictExample example = new BaseDictExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictItemNameEqualTo(itemName);
		List<BaseDict> list = baseDictMapper.selectByExample(example);
		return list.get(0);
	}

	
	
}
