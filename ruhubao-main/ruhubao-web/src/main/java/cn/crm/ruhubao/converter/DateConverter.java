package cn.crm.ruhubao.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

	//Converter<S, T> 
	//S,Source，源，转换之前的数据，这里是字符串类型的商品生产日期
	//T,Targert,目标，转换之后的数据，这里是Date类型的日期
	public class DateConverter implements Converter<String, Date> {

		/* (non-Javadoc)
		 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
		 */
		@Override
		// 实现转换逻辑
		public Date convert(String source) {
			// TODO Auto-generated method stub
			// 1.日期格式对象
			// 2016-02-03 13:22:53
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			try {
				// 转换成功，直接返回
				return format.parse(source);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 转换失败，返回null
			return null;
		}
}
