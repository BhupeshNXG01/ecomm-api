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
 * ProductRequestProductImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T13:10:42.607566100+05:30[Asia/Calcutta]")

public class ProductRequestProductImage   {
  @JsonProperty("imageName")
  private String imageName;

  @JsonProperty("url")
  private String url;

  @JsonProperty("isPrimary")
  private Integer isPrimary;

  public ProductRequestProductImage imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * Get imageName
   * @return imageName
  */
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public ProductRequestProductImage url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ProductRequestProductImage isPrimary(Integer isPrimary) {
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
    ProductRequestProductImage productRequestProductImage = (ProductRequestProductImage) o;
    return Objects.equals(this.imageName, productRequestProductImage.imageName) &&
        Objects.equals(this.url, productRequestProductImage.url) &&
        Objects.equals(this.isPrimary, productRequestProductImage.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageName, url, isPrimary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequestProductImage {\n");
    
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

