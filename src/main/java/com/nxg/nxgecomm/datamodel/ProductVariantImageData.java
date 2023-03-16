package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_variant")
public class ProductVariantImageData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "product_variant_id")
	private int productVariantId;
	
	@Column(name = "img_url")
	private String imgUrl;
	
	@Column(name = "is_primary")
	private int isPrimary;
	
	@Column(name = "status")
	private int status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_variant_id")
	private ProductVariantData productVariantData;

	

	public ProductVariantData getProductVariantData() {
		return productVariantData;
	}

	public void setProductVariantData(ProductVariantData productVariantData) {
		this.productVariantData = productVariantData;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductVariantId() {
		return productVariantId;
	}

	public void setProductVariantId(int productVariantId) {
		this.productVariantId = productVariantId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getIsPrimary() {
		return isPrimary;
	}

	public void setIsPrimary(int isPrimary) {
		this.isPrimary = isPrimary;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
