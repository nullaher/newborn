package cn.nullah.newborn.web.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.nullah.newborn.model.http.OpenSvcReqText;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("svc")
public class OpenServiceController {
	Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("{svcId}")
	@ResponseBody
	public void doService(@PathVariable int svcId,@Valid  @RequestBody OpenSvcReqText reqText) {
		logger.info(JSONObject.toJSONString(reqText));
		reqText.setSvcId(svcId);
	}

	@RequestMapping("test")
	public String toTest() {
		return "svcTest";
	}
}
