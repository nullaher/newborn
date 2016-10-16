/**
 * 
 */
package cn.nullah.newborn.service.base;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.nullah.newborn.model.base.User;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Simon
 * 
 */

public class UserServiceTest extends TestBase {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	private UserService userService = null;

	@Test
	public void testTrans() {
		User user = new User();// getUserById(id);
		user.setUserName("xxx");
		// user.setUserId(user.getUserId()+1);
		user.setUserId(2l);
		userService.add(user);
		logger.info("添加了1行记录");
		// int i=1/0;
		user.setUserName("1234567890");
		userService.upt(user);
		logger.info("更新了{}行记", 1);
		// userService.gen(Long.valueOf(1));
	}

	@Test
	public void testTrans2() {
		userService.gen(Long.valueOf(1));
	}

	@Test
	public void testGetUserById() {
		User user = userService.getUserById(Long.valueOf(1));
		logger.info("data:{}", JSONObject.toJSON(user));
	}

}
