package com.meetstone.project.dao.entity;

public class AcountEntity {
	private String acount_id;
	private String acount_name;
	private String acount_passwrod;
	private String acount_role;
	public String getAcount_id() {
		return acount_id;
	}
	public void setAcount_id(String acount_id) {
		this.acount_id = acount_id;
	}
	public String getAcount_name() {
		return acount_name;
	}
	public void setAcount_name(String acount_name) {
		this.acount_name = acount_name;
	}
	public String getAcount_passwrod() {
		return acount_passwrod;
	}
	public void setAcount_passwrod(String acount_passwrod) {
		this.acount_passwrod = acount_passwrod;
	}
	public String getAcount_role() {
		return acount_role;
	}
	public void setAcount_role(String acount_role) {
		this.acount_role = acount_role;
	}
	public AcountEntity(String id,String name,String password,String role) {
		acount_id = id;
		acount_name = name;
		acount_passwrod = password;
		acount_role = role;
		
	}
	
}
