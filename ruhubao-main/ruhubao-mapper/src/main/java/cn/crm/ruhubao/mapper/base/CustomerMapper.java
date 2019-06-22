package cn.crm.ruhubao.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.crm.ruhubao.pojo.base.Customer;
import cn.crm.ruhubao.pojo.base.CustomerExample;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    //查询所有的用户
    List<Customer> selectAllCustomers();
}