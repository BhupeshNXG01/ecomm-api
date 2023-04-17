package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Products
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-27T12:43:57.666217800+05:30[Asia/Calcutta]")

public class Products   {
  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("categoryId")
  private Integer categoryId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("price")
  private Integer price;

  @JsonProperty("cPrice")
  private Integer cPrice;

  @JsonProperty("taxPercent")
  private Integer taxPercent;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("sizeType")
  private Integer sizeType;

  @JsonProperty("isVariants")
  private Integer isVariants;

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

@Size(max=10) 
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

@Size(max=50) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Products price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Products cPrice(Integer cPrice) {
    this.cPrice = cPrice;
    return this;
  }

  /**
   * Get cPrice
   * @return cPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getcPrice() {
    return cPrice;
  }

  public void setcPrice(Integer cPrice) {
    this.cPrice = cPrice;
  }

  public Products taxPercent(Integer taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

  /**
   * Get taxPercent
   * @return taxPercent
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(Integer taxPercent) {
    this.taxPercent = taxPercent;
  }

  public Products quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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

@Size(max=10) 
  public Integer getSizeType() {
    return sizeType;
  }

  public void setSizeType(Integer sizeType) {
    this.sizeType = sizeType;
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

@Size(max=100) 
  public Integer getIsVariants() {
    return isVariants;
  }

  public void setIsVariants(Integer isVariants) {
    this.isVariants = isVariants;
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
        Objects.equals(this.quantity, products.quantity) &&
        Objects.equals(this.sizeType, products.sizeType) &&
        Objects.equals(this.isVariants, products.isVariants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId, title, price, cPrice, taxPercent, quantity, sizeType, isVariants);
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
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
    sb.append("    isVariants: ").append(toIndentedString(isVariants)).append("\n");
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

