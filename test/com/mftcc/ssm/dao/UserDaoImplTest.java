package com.mftcc.ssm.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mftcc.ssm.po.User;

public class UserDaoImplTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() {
		applicationContext =new  ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	@Test
	public void testGetUserById() {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.getUserById(1);
		System.out.println(user);
	}

}
