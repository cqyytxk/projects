package com.txk.java.mybatis;

import java.io.IOException;
import java.io.InputStream;





import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//基于mybatis xml配置实现
//org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@76c39d7f
public class XmlMybatis {
	static SqlSessionFactory sqlSessionFactory = null;

	public static void main(String[] args) {
		InputStream input;
		String resource = "config/mybatis-config.xml";
		try {
			input = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
			System.out.println(sqlSessionFactory);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
