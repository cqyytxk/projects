package com.txk.java.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.txk.java.entity.Role;

public interface RoleDao {
	//�����ļ�sql
	public int save (Role role);
	public Role getRole(int id);
	//ʹ��ע��
	@Select("select role_id,role_name,description,remark from role where role_id = #{id}")
	public Role getRoleByAnnotation(int id);
	
	public List<Map<String,Object>> getRoleByName(String role_name);
}
