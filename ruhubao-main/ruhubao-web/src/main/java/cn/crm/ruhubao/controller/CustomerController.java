package cn.crm.ruhubao.controller;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import cn.crm.ruhubao.base.CustomerService;
import cn.crm.ruhubao.pojo.base.Customer;
import cn.crm.ruhubao.utils.ImportExcelUtil;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	private static Logger log = Logger.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;
	private static Map<String, Object> map = new HashMap<String, Object>();
	@CrossOrigin(origins = "*", allowedHeaders="*")
	@RequestMapping("/getCustomers")
	public ResponseEntity<List<Customer>> getCustomers() {

		try {
			List<Customer> list = customerService.queryAll();

			return ResponseEntity.ok(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	}

	// 根据用户的区域查询客户
	@RequestMapping("/getCustomerByAreaId/{area}")
	public ResponseEntity<List<Customer>> getCustomerByAreaId(@PathVariable("area") String area) {

		try {
			Customer customer = new Customer();
			customer.setArea(area);
			List<Customer> list = customerService.queryListByWhere(customer);
			return ResponseEntity.ok(list);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

	}

	@CrossOrigin(origins = "*", allowedHeaders="*")
	@RequestMapping("/addCustomer")
	public ResponseEntity<Map<String, Object>> addCustomer(Customer cst) {
		try {
			
			customerService.saveSelective(cst);
			map.put("code", "success");
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug("添加用户异常");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

	@RequestMapping("/delCustomerById")
	public ResponseEntity delCustomer(@RequestParam("customerId") Integer customerId) {

		try {
			customerService.deleteById(customerId);
			return ResponseEntity.ok(null);
		} catch (Exception e) {

			e.printStackTrace();
			log.debug("删除异常");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

	@RequestMapping("/updateCustomer")
	public ResponseEntity updateCustomer(Customer cust) {
		try {
			customerService.updateSelective(cust);
			return ResponseEntity.ok(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug("更新异常");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
	
	
	
	//Excel表格式文件导入功能
	@RequestMapping("uploadExcel")
	public ResponseEntity<Map<String,Object>> uploadExcel(HttpServletRequest request) throws Exception{
		log.info("执行excel的导入");
		
		MultipartHttpServletRequest multipartRequest =(MultipartHttpServletRequest)request;
		
		InputStream in =null;
		List<List<Object>> listob =null;
		MultipartFile file = multipartRequest.getFile("upfile");
		if (file.isEmpty()) {
			throw new Exception("文件不存在");
		}
		
		in =file.getInputStream();
		
		listob=new  ImportExcelUtil().getBankListByExcel(in, file.getOriginalFilename());
		in.close();
		//该处可调用service相应方法进行数据保存到数据库中，现只对数据输出 
		
		/*for (int i = 0; i < listob.size(); i++) {  
	         List<Object> lo = listob.get(i);  
			
			 * Family family = new Family(); family.setJtbh(String.valueOf(lo.get(0)));
			 * family.setXm(String.valueOf(lo.get(1)));
			 * family.setHy(String.valueOf(lo.get(2)));
			 * family.setBz(String.valueOf(lo.get(3)));
	         *System.out.println("打印信息-->"+family.toString());        
	     }   */
		 for (int i = 0; i < listob.size(); i++) {
			List<Object> lo = listob.get(i);
			Customer customer = new Customer();
			customer.setName(String.valueOf(lo.get(1)));
			customer.setAgeGroups(String.valueOf(lo.get(2)));
			customer.setTelPhone(String.valueOf(lo.get(3)));
			customer.setEducation(String.valueOf(lo.get(4)));
			//weinxin/qq
			customer.setRuhuReason(String.valueOf(lo.get(5)));
			//社保年限
			customer.setYearsSocial(String.valueOf(lo.get(6)));			
			//来源
			customer.setSourceLink(String.valueOf(lo.get(7)));
			
			customerService.saveSelective(customer);
		}
		return null;
		
	}
	@RequestMapping(value="/ajax")  
	public  void  ajaxUploadExcel(HttpServletRequest request,HttpServletResponse response) throws Exception {  
	    MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;    
	      
	      
	    InputStream in =null;  
	    List<List<Object>> listob = null;  
	    MultipartFile file = multipartRequest.getFile("upfile");  
	    if(file.isEmpty()){  
	        throw new Exception("文件不存在！");  
	    }  
	      
	    in = file.getInputStream();  
	    listob = new ImportExcelUtil().getBankListByExcel(in,file.getOriginalFilename());  
	      
	  //该处可调用service相应方法进行数据保存到数据库中，现只对数据输出  
	    for (int i = 0; i < listob.size(); i++) {
			List<Object> lo = listob.get(i);
			Customer customer = new Customer();
			customer.setName(String.valueOf(lo.get(1)));
			customer.setAgeGroups(String.valueOf(lo.get(2)));
			customer.setTelPhone(String.valueOf(lo.get(3)));
			customer.setEducation(String.valueOf(lo.get(4)));
			//weinxin/qq
			customer.setRuhuReason(String.valueOf(lo.get(5)));
			//社保年限
			customer.setYearsSocial(String.valueOf(lo.get(6)));			
			//来源
			customer.setSourceLink(String.valueOf(lo.get(7)));
			
			customerService.saveSelective(customer);
		}
	      
	    PrintWriter out = null;  
	    response.setCharacterEncoding("utf-8");  //防止ajax接受到的中文信息乱码  
	    out = response.getWriter();  
	    out.print("文件导入成功！");  
	    out.flush();  
	    out.close();  
	} 

	
	

}
