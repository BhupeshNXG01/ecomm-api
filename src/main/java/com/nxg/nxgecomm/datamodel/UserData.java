package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;
import jakarta.persistence.*;
@Entity
@Table(name = "add_user")

public class UserData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "seller_id")
	private int seller_id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "mobile")
	private int mobile;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "seller_password")
	private String seller_password;
	
	
	@Column(name = "status")
	private int status;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSeller_id() {
		return seller_id;
	}


	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
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


	public String getSeller_password() {
		return seller_password;
	}


	public void setSeller_password(String seller_password) {
		this.seller_password = seller_password;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	
	
	
	
}
