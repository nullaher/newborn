package cn.nullah.newborn.web;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @author Simon 标准请求报文解析器
 */
public class SecureHttpTextConverter extends FastJsonHttpMessageConverter {
	@Resource
	Md5PasswordEncoder md5Encoder;

	@Override
	protected Object readInternal(Class<? extends Object> clazz,
			HttpInputMessage inputMessage) throws IOException,
			HttpMessageNotReadableException {
		// if (clazz.getName().equals(OpenSvcReqText.class.getName())) {
		// OpenSvcReqText jsonObject = OpenSvcReqText super.readInternal(clazz,
		// inputMessage);
		// return jsonObject;
		// }else{
		return super.readInternal(clazz, inputMessage);
		// }
	}

	@Override
	protected void writeInternal(Object obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		super.writeInternal(obj, outputMessage);
	}
}
