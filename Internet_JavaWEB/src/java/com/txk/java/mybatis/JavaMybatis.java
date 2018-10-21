package com.txk.java.mybatis;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.txk.java.entity.Role;
//����java���봴��sqlsessionFactory
//org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@6a70122
public class JavaMybatis {
	public static void main(String[] args) {
		System.err.println( javaMybatis());
	}
	public static SqlSessionFactory javaMybatis(){
		PooledDataSource dataSource = new PooledDataSource();
		dataSource.setDriver("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssm");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setDefaultAutoCommit(false);
		//����mybatis��jdbc�������
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		//����configuration����
		Configuration configuration = new Configuration(environment);
		configuration.addMappers("mapper/RoleMapper.xml");
		configuration.getTypeAliasRegistry().registerAlias("role",Role.class);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		return sqlSessionFactory;
	}
}
