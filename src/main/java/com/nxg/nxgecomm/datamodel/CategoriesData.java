package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoriesData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "position")
	private int position;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "category_handel")
	private String categoryHandle;
	
	@Column(name = "status")
	private int status;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategoryHandle() {
		return categoryHandle;
	}

	public void setCategoryHandle(String categoryHandle) {
		this.categoryHandle = categoryHandle;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	
	
}
