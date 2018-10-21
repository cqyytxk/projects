package com.txk.java.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
	private final static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;
	private static SqlSessionFactory sqlSessionFactory = null;
	
	public static SqlSessionFactory getSqlSessionFactory() {
		synchronized (LOCK) {
			if(sqlSessionFactory !=null){
				return sqlSessionFactory;
			}
			InputStream input;
			String resource = "config/mybatis-config.xml";
			try {
				input = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return sqlSessionFactory;
		}
	}
	public static SqlSession getSqlSession() {
		if(sqlSessionFactory ==null){
			getSqlSessionFactory();
		}
		return sqlSessionFactory.openSession();
	}
}
