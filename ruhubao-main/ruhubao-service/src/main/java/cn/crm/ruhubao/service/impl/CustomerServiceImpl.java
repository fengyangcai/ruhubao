package cn.crm.ruhubao.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.crm.ruhubao.base.CustomerService;
import cn.crm.ruhubao.mapper.base.CustomerMapper;
import cn.crm.ruhubao.pojo.base.Customer;

@Service
public class CustomerServiceImpl  implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Customer queryById(Serializable id) {
		Customer customer = customerMapper.selectByPrimaryKey((Integer) id);
		return customer;
	}

	@Override
	public List<Customer> selectByExample() {
		
		return null;
	}

	@Override
	public List<Customer> queryAll() {
		List<Customer> list = customerMapper.selectAllCustomers();
		return list;
	}

	@Override
	public Integer queryCountByWhere(Customer t) {
		
		return null;
	}

	@Override
	public List<Customer> queryListByWhere(Customer t) {
		
		return null;
	}

	@Override
	public List<Customer> queryListByPage(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
		List<Customer> customers = customerMapper.selectAllCustomers();
		
		return customers;
	}

	@Override
	public void saveSelective(Customer t) {
		
		
		t.setStatus(1);
		t.setCreateTime(new Date());
		t.setUpdateTime(new Date());
		customerMapper.insert(t);
		
	}

	@Override
	public void updateSelective(Customer t) {
		
		t.setUpdateTime(new Date());
		customerMapper.updateByPrimaryKeySelective(t);
		
	}

	@Override
	public void deleteById(Serializable id) {
		customerMapper.deleteByPrimaryKey((Integer)id);
		
	}

	@Override
	public void deleteByIds(Serializable[] ids) {
		
		for (Serializable id : ids) {
			
			customerMapper.deleteByPrimaryKey((Integer)id);
		}
		
	}

	
	
}
