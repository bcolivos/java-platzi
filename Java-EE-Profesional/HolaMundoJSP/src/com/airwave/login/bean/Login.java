package com.airwave.login.bean;

import java.io.Serializable;

public class Login implements Serializable {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean autenticacion() {
		return (password.equals("123456"))?true:false;
	}

}
