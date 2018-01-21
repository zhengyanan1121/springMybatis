package com.mftcc.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.mftcc.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserById(int id) {
		//继承SqlSessionDaoSupport 类，通过 getSqlSession 获取sqlSession
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById",id);
		return user;
	}

}
