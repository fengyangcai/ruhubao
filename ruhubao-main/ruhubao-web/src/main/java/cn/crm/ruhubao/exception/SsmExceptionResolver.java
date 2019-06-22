package cn.crm.ruhubao.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SsmExceptionResolver implements HandlerExceptionResolver {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerExceptionResolver#resolveException(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		// 包装异常
		// 定义系统异常
		SsmException sse = null;
		
		// 判断是否是系统异常
		if(ex instanceof SsmException){
			sse = (SsmException) ex;
		}else{
			// 创建一个未知异常
			sse = new SsmException("未知异常!");
		}
		
		// 创建ModelAndView对象
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", sse.getMessage());
		
		mav.setViewName("error/error");
		
		return mav;
	}

}
