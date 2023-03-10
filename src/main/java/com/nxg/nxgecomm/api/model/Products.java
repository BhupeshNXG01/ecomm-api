package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Products
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-10T13:58:41.564107300+05:30[Asia/Calcutta]")

public class Products   {
  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("categoryId")
  private Integer categoryId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("cPrice")
  private BigDecimal cPrice;

  @JsonProperty("taxPercent")
  private BigDecimal taxPercent;

  @JsonProperty("qty")
  private Integer qty;

  @JsonProperty("sizeType")
  private Integer sizeType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("skuCode")
  private String skuCode;

  @JsonProperty("barcode")
  private String barcode;

  @JsonProperty("isVariants")
  private Integer isVariants;

  @JsonProperty("productUrl")
  private String productUrl;

  @JsonProperty("searchTerms")
  private String searchTerms;

  @JsonProperty("seoTitle")
  private String seoTitle;

  @JsonProperty("meta")
  private String meta;

  @JsonProperty("keyword")
  private String keyword;

  public Products productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public Products categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Products title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Products price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Products cPrice(BigDecimal cPrice) {
    this.cPrice = cPrice;
    return this;
  }

  /**
   * Get cPrice
   * @return cPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getcPrice() {
    return cPrice;
  }

  public void setcPrice(BigDecimal cPrice) {
    this.cPrice = cPrice;
  }

  public Products taxPercent(BigDecimal taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

  /**
   * Get taxPercent
   * @return taxPercent
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(BigDecimal taxPercent) {
    this.taxPercent = taxPercent;
  }

  public Products qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * Get qty
   * @return qty
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public Products sizeType(Integer sizeType) {
    this.sizeType = sizeType;
    return this;
  }

  /**
   * Get sizeType
   * @return sizeType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getSizeType() {
    return sizeType;
  }

  public void setSizeType(Integer sizeType) {
    this.sizeType = sizeType;
  }

  public Products description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Products skuCode(String skuCode) {
    this.skuCode = skuCode;
    return this;
  }

  /**
   * Get skuCode
   * @return skuCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSkuCode() {
    return skuCode;
  }

  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
  }

  public Products barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public Products isVariants(Integer isVariants) {
    this.isVariants = isVariants;
    return this;
  }

  /**
   * Get isVariants
   * @return isVariants
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getIsVariants() {
    return isVariants;
  }

  public void setIsVariants(Integer isVariants) {
    this.isVariants = isVariants;
  }

  public Products productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

  /**
   * Get productUrl
   * @return productUrl
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public Products searchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }

  /**
   * Get searchTerms
   * @return searchTerms
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSearchTerms() {
    return searchTerms;
  }

  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }

  public Products seoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
    return this;
  }

  /**
   * Get seoTitle
   * @return seoTitle
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=250) 
  public String getSeoTitle() {
    return seoTitle;
  }

  public void setSeoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
  }

  public Products meta(String meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=170) 
  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
    this.meta = meta;
  }

  public Products keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Products products = (Products) o;
    return Objects.equals(this.productId, products.productId) &&
        Objects.equals(this.categoryId, products.categoryId) &&
        Objects.equals(this.title, products.title) &&
        Objects.equals(this.price, products.price) &&
        Objects.equals(this.cPrice, products.cPrice) &&
        Objects.equals(this.taxPercent, products.taxPercent) &&
        Objects.equals(this.qty, products.qty) &&
        Objects.equals(this.sizeType, products.sizeType) &&
        Objects.equals(this.description, products.description) &&
        Objects.equals(this.skuCode, products.skuCode) &&
        Objects.equals(this.barcode, products.barcode) &&
        Objects.equals(this.isVariants, products.isVariants) &&
        Objects.equals(this.productUrl, products.productUrl) &&
        Objects.equals(this.searchTerms, products.searchTerms) &&
        Objects.equals(this.seoTitle, products.seoTitle) &&
        Objects.equals(this.meta, products.meta) &&
        Objects.equals(this.keyword, products.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId, title, price, cPrice, taxPercent, qty, sizeType, description, skuCode, barcode, isVariants, productUrl, searchTerms, seoTitle, meta, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Products {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    cPrice: ").append(toIndentedString(cPrice)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    isVariants: ").append(toIndentedString(isVariants)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    seoTitle: ").append(toIndentedString(seoTitle)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

