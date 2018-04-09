package com.attendancemgmt.app.web.formbeans;

import javax.validation.constraints.NotBlank;

public class LoginFormBean {

	@NotBlank
	private String userName;

	@NotBlank
	private String password;

	public LoginFormBean() {
	}

	public LoginFormBean(String userName, String password) {
		this.userName = userName;
		this.password = password;
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

	public void setPassword(String password) {
		this.password = password;
	}

}
