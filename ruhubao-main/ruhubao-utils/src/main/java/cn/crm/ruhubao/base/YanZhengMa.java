package cn.crm.ruhubao.base;

import java.util.Random;

public class YanZhengMa {
	
	final static Random d =new Random();
	//4位
	public  static String  getCode4() {
			
		
		
		
		String code = "";	
		int count=4;
		while (count>0) {
			
			int num =d.nextInt(10);
			if (count==4&&num==0) {
				System.out.println("num为0了");
				num=d.nextInt(10);
				continue;
			}
			code +=num+"";
			count--;
			
		}
			return code;
	}
	
	
	/*
	 * public static void main(String[] args) { for (int i = 0; i < 1000; i++) {
	 * 
	 * System.out.println(getCode4()); } }
	 */

}
