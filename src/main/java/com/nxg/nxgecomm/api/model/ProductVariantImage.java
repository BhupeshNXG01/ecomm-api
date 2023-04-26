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
 * ProductVariantImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

public class ProductVariantImage   {
  @JsonProperty("variantImageId")
  private Integer variantImageId;

  @JsonProperty("productVariantId")
  private Integer productVariantId;

  @JsonProperty("imgUrl")
  private String imgUrl;

  @JsonProperty("isPrimary")
  private Integer isPrimary;

  @JsonProperty("status")
  private String status;

  public ProductVariantImage variantImageId(Integer variantImageId) {
    this.variantImageId = variantImageId;
    return this;
  }

  /**
   * Get variantImageId
   * @return variantImageId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getVariantImageId() {
    return variantImageId;
  }

  public void setVariantImageId(Integer variantImageId) {
    this.variantImageId = variantImageId;
  }

  public ProductVariantImage productVariantId(Integer productVariantId) {
    this.productVariantId = productVariantId;
    return this;
  }

  /**
   * Get productVariantId
   * @return productVariantId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(Integer productVariantId) {
    this.productVariantId = productVariantId;
  }

  public ProductVariantImage imgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

  /**
   * Get imgUrl
   * @return imgUrl
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public ProductVariantImage isPrimary(Integer isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * Get isPrimary
   * @return isPrimary
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Integer isPrimary) {
    this.isPrimary = isPrimary;
  }

  public ProductVariantImage status(String status) {
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
    ProductVariantImage productVariantImage = (ProductVariantImage) o;
    return Objects.equals(this.variantImageId, productVariantImage.variantImageId) &&
        Objects.equals(this.productVariantId, productVariantImage.productVariantId) &&
        Objects.equals(this.imgUrl, productVariantImage.imgUrl) &&
        Objects.equals(this.isPrimary, productVariantImage.isPrimary) &&
        Objects.equals(this.status, productVariantImage.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantImageId, productVariantId, imgUrl, isPrimary, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantImage {\n");
    
    sb.append("    variantImageId: ").append(toIndentedString(variantImageId)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
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

