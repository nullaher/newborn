package cn.nullah.newborn.service.base;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-app.xml" })
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class TestBase {
	Logger logger = LoggerFactory.getLogger(getClass());
	// public static void main(String[] args) {
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("spring/spring-app.xml");
	// IUserService userService = (IUserService)context.getBean("userService");
	// userService.gen(1l);
	// }
}
