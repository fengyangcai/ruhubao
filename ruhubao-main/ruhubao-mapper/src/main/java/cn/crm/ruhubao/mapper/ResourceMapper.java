package cn.crm.ruhubao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.crm.ruhubao.pojo.Resource;
import cn.crm.ruhubao.pojo.ResourceExample;

public interface ResourceMapper {
    int countByExample(ResourceExample example);

    int deleteByExample(ResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resource record);

    int insertSelective(Resource record);

    List<Resource> selectByExample(ResourceExample example);

    Resource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
    
    //根据用户的id查询权限
    List<Resource> selectByUserId(Integer userId);  
    //根据角色的id查询
    List<Resource> selectByRoleId(Integer roleId);
}