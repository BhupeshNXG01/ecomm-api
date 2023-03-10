package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class ProductsData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "c_price")
	private double cPrice;
	
	@Column(name = "tax_percent")
	private double taxPercent;
	
	@Column(name = "qty")
	private int qty;
	
	@Column(name = "size_type")
	private int sizeType;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "sku_code")
	private String skuCode;
	
	@Column(name = "barcode")
	private String barcode;
	
	@Column(name = "is_variants")
	private int isVariants;
	
	@Column(name = "product_url")
	private String productUrl;

	@Column(name = "search_terms")
	private String searchTerms;
	
	@Column(name = "seo_title")
	private String seoTitle;

	@Column(name = "meta")
	private String meta;
	
	@Column(name = "keyword")
	private String keyword;
	
	@Column(name = "status")
	private int status;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getcPrice() {
		return cPrice;
	}

	public void setcPrice(double cPrice) {
		this.cPrice = cPrice;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getSizeType() {
		return sizeType;
	}

	public void setSizeType(int sizeType) {
		this.sizeType = sizeType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public int getIsVariants() {
		return isVariants;
	}

	public void setIsVariants(int isVariants) {
		this.isVariants = isVariants;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getSearchTerms() {
		return searchTerms;
	}

	public void setSearchTerms(String searchTerms) {
		this.searchTerms = searchTerms;
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getStatus() {
		return status;
}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
