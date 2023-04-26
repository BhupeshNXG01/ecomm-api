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
 * ProductImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

public class ProductImage   {
  @JsonProperty("productImageId")
  private Integer productImageId;

  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("imageName")
  private String imageName;

  @JsonProperty("url")
  private String url;

  @JsonProperty("isPrimary")
  private Integer isPrimary;

  @JsonProperty("status")
  private String status;

  public ProductImage productImageId(Integer productImageId) {
    this.productImageId = productImageId;
    return this;
  }

  /**
   * Get productImageId
   * @return productImageId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getProductImageId() {
    return productImageId;
  }

  public void setProductImageId(Integer productImageId) {
    this.productImageId = productImageId;
  }

  public ProductImage productId(Integer productId) {
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

  public ProductImage imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * Get imageName
   * @return imageName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public ProductImage url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ProductImage isPrimary(Integer isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * Get isPrimary
   * @return isPrimary
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Integer isPrimary) {
    this.isPrimary = isPrimary;
  }

  public ProductImage status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=8) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductImage productImage = (ProductImage) o;
    return Objects.equals(this.productImageId, productImage.productImageId) &&
        Objects.equals(this.productId, productImage.productId) &&
        Objects.equals(this.imageName, productImage.imageName) &&
        Objects.equals(this.url, productImage.url) &&
        Objects.equals(this.isPrimary, productImage.isPrimary) &&
        Objects.equals(this.status, productImage.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productImageId, productId, imageName, url, isPrimary, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductImage {\n");
    
    sb.append("    productImageId: ").append(toIndentedString(productImageId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

