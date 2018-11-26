package com.txk.java.mybatis;


import java.util.List;
import java.util.Map;

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
		//��ѯ
//		getResult(sqlSessionFactory,1);
		//����
//		Role role = new Role();
//		role.setRole_name("��Ӫ1");
//		role.setDescription("һ����Ӫ�������");
//		role.setRemark("��չ��");
////		saveRole(sqlSessionFactory,role);
//		saveRole1(sqlSession,role);
		
//		��ѯtypeHandler
		getResult(sqlSession,"��Ӫ");
	}
	public  static  void getResult(SqlSessionFactory sqlSessionFactory,int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Role role3 = sqlSession.selectOne("getRole", 1);//(1)ֱ�ӷ���sql
		RoleDao dao = sqlSession.getMapper(RoleDao.class);//(2)��ȡmapper�ӿ��ٷ���sql
		Role role1 = dao.getRole(id);//���ýӿ�
		Role role2 = dao.getRoleByAnnotation(id);//����ע��
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
		int result = dao.save(role);//���ýӿ�
		sqlSession.commit();
		if(sqlSession!=null){
			sqlSession.close()	;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}
		System.err.println(result);
	}
	public  static  void saveRole1(SqlSession sqlSession,Role role) {
		Logger logger = Logger.getLogger(MybatisTest.class);
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		int result = dao.save(role);//���ýӿ�
		logger.info(result);
		sqlSession.commit();
		if(sqlSession!=null){
			sqlSession.close()	;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}
		System.err.println(result);
	}
	
	public  static  void getResult(SqlSession sqlSession,String para) {
	
		RoleDao dao = sqlSession.getMapper(RoleDao.class);
		List<Map<String,Object>> list = dao.getRoleByName(para);//���ýӿ�
		sqlSession.commit();
		if(sqlSession!=null){
			sqlSession.close()	;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());	
		}
		
	}
}
