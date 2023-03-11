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
 * ProductVariant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-11T18:40:56.382042300+05:30[Asia/Calcutta]")

public class ProductVariant   {
  @JsonProperty("productVariantId")
  private Integer productVariantId;

  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("variantOptionValueId1")
  private Integer variantOptionValueId1;

  @JsonProperty("variantOptionValueId2")
  private Integer variantOptionValueId2;

  @JsonProperty("variantCombinationName")
  private String variantCombinationName;

  @JsonProperty("price")
  private Float price;

  @JsonProperty("sku")
  private String sku;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("barcode")
  private String barcode;

  @JsonProperty("isDefault")
  private Boolean isDefault;

  @JsonProperty("userId")
  private Integer userId;

  public ProductVariant productVariantId(Integer productVariantId) {
    this.productVariantId = productVariantId;
    return this;
  }

  /**
   * Get productVariantId
   * @return productVariantId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(Integer productVariantId) {
    this.productVariantId = productVariantId;
  }

  public ProductVariant productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public ProductVariant variantOptionValueId1(Integer variantOptionValueId1) {
    this.variantOptionValueId1 = variantOptionValueId1;
    return this;
  }

  /**
   * Get variantOptionValueId1
   * @return variantOptionValueId1
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getVariantOptionValueId1() {
    return variantOptionValueId1;
  }

  public void setVariantOptionValueId1(Integer variantOptionValueId1) {
    this.variantOptionValueId1 = variantOptionValueId1;
  }

  public ProductVariant variantOptionValueId2(Integer variantOptionValueId2) {
    this.variantOptionValueId2 = variantOptionValueId2;
    return this;
  }

  /**
   * Get variantOptionValueId2
   * @return variantOptionValueId2
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getVariantOptionValueId2() {
    return variantOptionValueId2;
  }

  public void setVariantOptionValueId2(Integer variantOptionValueId2) {
    this.variantOptionValueId2 = variantOptionValueId2;
  }

  public ProductVariant variantCombinationName(String variantCombinationName) {
    this.variantCombinationName = variantCombinationName;
    return this;
  }

  /**
   * Get variantCombinationName
   * @return variantCombinationName
  */
  @ApiModelProperty(value = "")

@Size(max=120) 
  public String getVariantCombinationName() {
    return variantCombinationName;
  }

  public void setVariantCombinationName(String variantCombinationName) {
    this.variantCombinationName = variantCombinationName;
  }

  public ProductVariant price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")


  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public ProductVariant sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
  */
  @ApiModelProperty(value = "")

@Size(max=60) 
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ProductVariant quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ProductVariant barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
  */
  @ApiModelProperty(value = "")

@Size(max=120) 
  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public ProductVariant isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
  */
  @ApiModelProperty(value = "")


  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public ProductVariant userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariant productVariant = (ProductVariant) o;
    return Objects.equals(this.productVariantId, productVariant.productVariantId) &&
        Objects.equals(this.productId, productVariant.productId) &&
        Objects.equals(this.variantOptionValueId1, productVariant.variantOptionValueId1) &&
        Objects.equals(this.variantOptionValueId2, productVariant.variantOptionValueId2) &&
        Objects.equals(this.variantCombinationName, productVariant.variantCombinationName) &&
        Objects.equals(this.price, productVariant.price) &&
        Objects.equals(this.sku, productVariant.sku) &&
        Objects.equals(this.quantity, productVariant.quantity) &&
        Objects.equals(this.barcode, productVariant.barcode) &&
        Objects.equals(this.isDefault, productVariant.isDefault) &&
        Objects.equals(this.userId, productVariant.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, productId, variantOptionValueId1, variantOptionValueId2, variantCombinationName, price, sku, quantity, barcode, isDefault, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariant {\n");
    
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    variantOptionValueId1: ").append(toIndentedString(variantOptionValueId1)).append("\n");
    sb.append("    variantOptionValueId2: ").append(toIndentedString(variantOptionValueId2)).append("\n");
    sb.append("    variantCombinationName: ").append(toIndentedString(variantCombinationName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

