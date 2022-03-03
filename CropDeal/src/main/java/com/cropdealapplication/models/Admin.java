package com.cropdealapplication.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Admins")
public class Admin {
	@Id
	private int adminid;
	private String emaild;
	
	private String password;

	
	
	public Admin(int adminid, String emaild, String password) {
		super();
		this.adminid = adminid;
		this.emaild = emaild;
		this.password = password;
	}

	public int getAdminid() {
		return adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getEmaild() {
		return emaild;
	}

	public void setEmaild(String emaild) {
		this.emaild = emaild;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
}