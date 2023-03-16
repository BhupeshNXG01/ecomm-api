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
 * ProductRequestProductVariantImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T13:10:42.607566100+05:30[Asia/Calcutta]")

public class ProductRequestProductVariantImage   {
  @JsonProperty("imgUrl")
  private String imgUrl;

  @JsonProperty("isPrimary")
  private Integer isPrimary;

  public ProductRequestProductVariantImage imgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

  /**
   * Get imgUrl
   * @return imgUrl
  */
  @ApiModelProperty(value = "")

@Size(max=500) 
  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public ProductRequestProductVariantImage isPrimary(Integer isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * Get isPrimary
   * @return isPrimary
  */
  @ApiModelProperty(value = "")

@Size(max=1) 
  public Integer getIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Integer isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRequestProductVariantImage productRequestProductVariantImage = (ProductRequestProductVariantImage) o;
    return Objects.equals(this.imgUrl, productRequestProductVariantImage.imgUrl) &&
        Objects.equals(this.isPrimary, productRequestProductVariantImage.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imgUrl, isPrimary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequestProductVariantImage {\n");
    
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

