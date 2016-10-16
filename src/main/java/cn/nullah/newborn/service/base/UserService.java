package cn.nullah.newborn.service.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.nullah.newborn.mapper.base.UserMapper;
import cn.nullah.newborn.model.base.User;

@Service("userService")
@Transactional
public class UserService {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	UserMapper userMapper;

	public User getUserById(Long userId) {
		return userMapper.selectByPrimaryKey(userId);
	}
	
	
	public void gen(Long id) {
		User user =new User();// getUserById(id);
		user.setUserName("xxx");
//		user.setUserId(user.getUserId()+1);
		user.setUserId(2l);
		add(user);
		logger.info("添加了1行记录"); 
//		int i=1/0;
		user.setUserName("123456789");
		logger.info("更新了{}行记", upt(user));
	}

	public int add(User user) {
		return userMapper.insert(user);
	}

	public int upt(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

}
