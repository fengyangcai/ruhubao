package cn.crm.ruhubao.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class SendSmsByaliUtils {
	
	public static Boolean sendSms(String phoneNum,String code) {
		DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIVCEmzeftUONi", "N8Jw7pqL6V53qh3yOwokWGk2HfRF6n");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNum);
        request.putQueryParameter("SignName", "博霖教育");
        request.putQueryParameter("TemplateCode", "SMS_166145023");
        request.putQueryParameter("TemplateParam", "{\"code\":"+code+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            String data = response.getData();
            System.out.println(data);
            JSONObject dataObeject = JSON.parseObject(data);
            
            System.out.println(dataObeject);
            if ( dataObeject.getString("Code")!=null&& dataObeject.getString("Code").equals("OK")) {
				return true;
			}
            System.out.println(data);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        
        return false;
    }
		
	

	
}
