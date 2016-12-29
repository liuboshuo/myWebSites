package com.liushuo.myDemo.pojo;

public class User1 {
	private int id;
	private String userName;
	private String password;
	public User1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User1(int id, String userName, String passwordd) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = passwordd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String passwordd) {
		this.password = passwordd;
	}
	
	
}
