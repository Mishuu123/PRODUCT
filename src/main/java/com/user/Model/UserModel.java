package com.user.Model;

import java.util.List;

import com.user.Entity.Address;
import com.user.Entity.Feedback;
import com.user.Helper.UserType;

public class UserModel {

	private String email;

	private String name;

	private Integer phoneNo;
	private UserType userType;
	private Address address;
	

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
