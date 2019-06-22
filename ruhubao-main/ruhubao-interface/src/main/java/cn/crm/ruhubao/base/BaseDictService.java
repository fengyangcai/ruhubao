package cn.crm.ruhubao.base;

import java.util.List;

import cn.crm.ruhubao.pojo.base.BaseDict;

public interface BaseDictService  {
	
	public void insert(BaseDict baseDict);
	
	public void delete(Integer baseDictId);
	
	public void update(BaseDict baseDict);
	
	public BaseDict selectByBaseDictId(Integer baseDictid);
	//根据类别代码查询
	public List<BaseDict> selectByTypeCode(String typeCode);
	
	//根据类别名称查询 
	public  List<BaseDict> selectByTypeName(String typeName);
	
	//根据字典名称查询
	public BaseDict selectByItemName(String itemName);
	//根据字典类查询
	//public List<BaseDict> selectByBaseDict(BaseDict baseDict);
	
	
}
