package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.ProductRequestProductVariantImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductRequestProductVariant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T13:10:42.607566100+05:30[Asia/Calcutta]")

public class ProductRequestProductVariant   {
  @JsonProperty("price")
  private Float price;

  @JsonProperty("sku")
  private String sku;

  @JsonProperty("barcode")
  private String barcode;

  @JsonProperty("variantCombinationName")
  private String variantCombinationName;

  @JsonProperty("isDefault")
  private Boolean isDefault;

  @JsonProperty("createdBy")
  private Integer createdBy;

  @JsonProperty("productVariantImage")
  @Valid
  private List<ProductRequestProductVariantImage> productVariantImage = null;

  @JsonProperty("variantOptionValue")
  @Valid
  private List<String> variantOptionValue = null;

  public ProductRequestProductVariant price(Float price) {
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

  public ProductRequestProductVariant sku(String sku) {
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

  public ProductRequestProductVariant barcode(String barcode) {
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

  public ProductRequestProductVariant variantCombinationName(String variantCombinationName) {
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

  public ProductRequestProductVariant isDefault(Boolean isDefault) {
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

  public ProductRequestProductVariant createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public ProductRequestProductVariant productVariantImage(List<ProductRequestProductVariantImage> productVariantImage) {
    this.productVariantImage = productVariantImage;
    return this;
  }

  public ProductRequestProductVariant addProductVariantImageItem(ProductRequestProductVariantImage productVariantImageItem) {
    if (this.productVariantImage == null) {
      this.productVariantImage = new ArrayList<>();
    }
    this.productVariantImage.add(productVariantImageItem);
    return this;
  }

  /**
   * Get productVariantImage
   * @return productVariantImage
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductRequestProductVariantImage> getProductVariantImage() {
    return productVariantImage;
  }

  public void setProductVariantImage(List<ProductRequestProductVariantImage> productVariantImage) {
    this.productVariantImage = productVariantImage;
  }

  public ProductRequestProductVariant variantOptionValue(List<String> variantOptionValue) {
    this.variantOptionValue = variantOptionValue;
    return this;
  }

  public ProductRequestProductVariant addVariantOptionValueItem(String variantOptionValueItem) {
    if (this.variantOptionValue == null) {
      this.variantOptionValue = new ArrayList<>();
    }
    this.variantOptionValue.add(variantOptionValueItem);
    return this;
  }

  /**
   * Get variantOptionValue
   * @return variantOptionValue
  */
  @ApiModelProperty(value = "")


  public List<String> getVariantOptionValue() {
    return variantOptionValue;
  }

  public void setVariantOptionValue(List<String> variantOptionValue) {
    this.variantOptionValue = variantOptionValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRequestProductVariant productRequestProductVariant = (ProductRequestProductVariant) o;
    return Objects.equals(this.price, productRequestProductVariant.price) &&
        Objects.equals(this.sku, productRequestProductVariant.sku) &&
        Objects.equals(this.barcode, productRequestProductVariant.barcode) &&
        Objects.equals(this.variantCombinationName, productRequestProductVariant.variantCombinationName) &&
        Objects.equals(this.isDefault, productRequestProductVariant.isDefault) &&
        Objects.equals(this.createdBy, productRequestProductVariant.createdBy) &&
        Objects.equals(this.productVariantImage, productRequestProductVariant.productVariantImage) &&
        Objects.equals(this.variantOptionValue, productRequestProductVariant.variantOptionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, sku, barcode, variantCombinationName, isDefault, createdBy, productVariantImage, variantOptionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequestProductVariant {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    variantCombinationName: ").append(toIndentedString(variantCombinationName)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    productVariantImage: ").append(toIndentedString(productVariantImage)).append("\n");
    sb.append("    variantOptionValue: ").append(toIndentedString(variantOptionValue)).append("\n");
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

