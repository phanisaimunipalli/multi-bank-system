package com.mbs.request.model;

public class UserLogin {

	private String user_email;
	private String user_pwd;
	
	//Constructors
	public UserLogin() {
		
	}
	
	public UserLogin(String user_email, String user_pwd) {

		this.user_email = user_email;
		this.user_pwd = user_pwd;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	
	
	
}
