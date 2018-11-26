package com.txk.java.entity;


public class Role {
	private int role_id;
	private String role_name;
	private String description;
	private String remark;
	private int role_sex;
	public int getRole_sex() {
		return role_sex;
	}
	public void setRole_sex(int role_sex) {
		this.role_sex = role_sex;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_name=" + role_name
				+ ", description=" + description + ", remark=" + remark
				+ ", role_sex=" + role_sex + "]";
	}

	
}
