package com.txk.java.mybatis;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.txk.java.dao.RoleDao;
import com.txk.java.entity.Role;
import com.txk.java.utils.SqlSessionFactoryUtils;

public class MybatisTest {

	public static void main(String[] args) {
//		SqlSessionFactory sqlSessionFactory = XmlMybatis.getSessionFactory();
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSession();
		//查询
//		getResult(sqlSessionFactory,1);
		//保存
		Role role = new Role();
		role.setRole_name("运营");
		role.setDescription("一切运营相关事情");
		role.setRemark("扩展性");
//		saveRole(sqlSessionFactory,role);
		saveRole1(sqlSession,role);
	}
	public  static  void getResult(SqlSessionFactory sqlSessionFactory,int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Role role3 = sqlSession.selectOne("getRole", 1);//(1)直接发送sql
		RoleDao dao = sqlSession.getMapper(RoleDao.class);//(2)获取mapper接口再发送sql
		Role role1 = dao.getRole(id);//采用接口
		Role role2 = dao.getRoleByAnnotation(id);//采用注解
		sqlSession.commit();
		if(sqlSession!=null){
			sqlSession.close()	;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}
		System.err.println(role1);
		System.err.println(role2);
		System.err.println(role3);
	}
	public  static  void saveRole(SqlSessionFactory sqlSessionFactory,Role role) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		int result = dao.save(role);//采用接口
		sqlSession.commit();
		if(sqlSession!=null){
			sqlSession.close()	;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}
		System.err.println(result);
	}
	public  static  void saveRole1(SqlSession sqlSession,Role role) {
		Logger logger = Logger.getLogger(MybatisTest.class);
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		int result = dao.save(role);//采用接口
		logger.info(result);
		sqlSession.commit();
		if(sqlSession!=null){
			sqlSession.close()	;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}
		System.err.println(result);
	}
}
