package com.cg.aps.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_aps")
public class UserEntity extends BaseEntity {
	@Id
	private String loginId;
	private String firstName;
	private String lastName;
	private String password;
	private String mobileNo;
	private String emailId;
	private long roleId;

	
	public String getLoginId() {
		return loginId;
	}


	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public long getRoleId() {
		return roleId;
	}


	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	

	public UserEntity() {
		super();
	}


	public UserEntity(String loginId, String firstName, String lastName, String password, String mobileNo,
			String emailId, long roleId) {
		super();
		this.loginId = loginId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.roleId = roleId;
	}
}