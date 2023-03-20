package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;
import jakarta.persistence.*;
@Entity
@Table(name = "add_user")

public class UserData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "seller_id")
	private int sellerId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "mobile")
	private int mobile;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "seller_password")
	private String sellerPassword;
	
	
	@Column(name = "status")
	private int status;


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getSeller_id() {
		return sellerId;
	}


	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSellerPassword() {
		return sellerPassword;
	}


	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	
	
	
	
}