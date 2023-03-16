package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_variant")
public class ProductVariantData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_variant_id")
	private int productVariantId;
	
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "variant_option_value_id1")
	private int variantOptionValueId1;
	
	@Column(name = "variant_option_value_id2")
	private int variantOptionValueId2;
	
	@Column(name = "variant_combination_name")
	private String variantCombinationName;
	
	@Column(name = "price")
	private float price;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "barcode")
	private String barcode;
	
	@Column(name = "is_default")
	private boolean isDefault;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "status")
	private int status;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ProductVariantData", cascade = CascadeType.ALL)
	private List<ProductVariantImageData> productVariantImageDataList;

	
	
	public List<ProductVariantImageData> getProductVariantImageDataList() {
		return productVariantImageDataList;
	}

	public void setProductVariantImageDataList(List<ProductVariantImageData> productVariantImageDataList) {
		this.productVariantImageDataList = productVariantImageDataList;
	}

	public int getProductVariantId() {
		return productVariantId;
	}

	public void setProductVariantId(int productVariantId) {
		this.productVariantId = productVariantId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getVariantOptionValueId1() {
		return variantOptionValueId1;
	}

	public void setVariantOptionValueId1(int variantOptionValueId1) {
		this.variantOptionValueId1 = variantOptionValueId1;
	}

	public int getVariantOptionValueId2() {
		return variantOptionValueId2;
	}

	public void setVariantOptionValueId2(int variantOptionValueId2) {
		this.variantOptionValueId2 = variantOptionValueId2;
	}

	public String getVariantCombinationName() {
		return variantCombinationName;
	}

	public void setVariantCombinationName(String variantCombinationName) {
		this.variantCombinationName = variantCombinationName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
