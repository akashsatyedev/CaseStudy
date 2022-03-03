package com.cropdealapplication.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Dealers")
public class Dealer {
	@Id
	   private int dealerid;
	   private String name;
	   private String password;
	   
	   private String email;
	   private long mobileNo;
	   private String area;
	   private String city;
	   private String state;
	   private int pincode;
	   
	   
	public Dealer(int dealerid, String name, String password, String email, long mobileNo, String area, String city,
			String state, int pincode) {
		super();
		this.dealerid = dealerid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobileNo = mobileNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getDealerid() {
		return dealerid;
	}
	public void setDealerid(int dealerid) {
		this.dealerid = dealerid;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	   
	   
}
