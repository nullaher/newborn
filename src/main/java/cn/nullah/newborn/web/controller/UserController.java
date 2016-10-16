package cn.nullah.newborn.web.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.nullah.newborn.model.base.User;
import cn.nullah.newborn.service.base.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	UserService userService;

	@ResponseBody
	@RequestMapping("detail/{id}")
	public User getById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	// 文件上传、
	@RequestMapping(value = "/upload")
	public String showUploadPage() {
		return "userUpload";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public String batchUpload(@RequestParam("file") MultipartFile[] fileList) throws IOException{
		for (MultipartFile file : fileList) {
			if (!file.isEmpty()) {
				logger.info("Process file:{}", file.getOriginalFilename());
			}
			File destination = new File("E:\\", System.currentTimeMillis()+"-"+ file.getOriginalFilename());
			FileUtils.copyInputStreamToFile(file.getInputStream(), destination);
		}
		return "上传成功";
	}

	@RequestMapping("gen")
	public void gen() {
		userService.gen(Long.valueOf(1));
		logger.info("ok-------------");
	}
}
