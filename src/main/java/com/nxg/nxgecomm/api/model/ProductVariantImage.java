package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.VariantOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductVariantImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-11T18:40:56.382042300+05:30[Asia/Calcutta]")

public class ProductVariantImage   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("productVariantId")
  private Integer productVariantId;

  @JsonProperty("imgUrl")
  private String imgUrl;

  @JsonProperty("isPrimary")
  private Integer isPrimary;

  @JsonProperty("variantOption")
  @Valid
  private List<VariantOption> variantOption = null;

  public ProductVariantImage id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ProductVariantImage productVariantId(Integer productVariantId) {
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

  public ProductVariantImage imgUrl(String imgUrl) {
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

  public ProductVariantImage isPrimary(Integer isPrimary) {
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

  public ProductVariantImage variantOption(List<VariantOption> variantOption) {
    this.variantOption = variantOption;
    return this;
  }

  public ProductVariantImage addVariantOptionItem(VariantOption variantOptionItem) {
    if (this.variantOption == null) {
      this.variantOption = new ArrayList<>();
    }
    this.variantOption.add(variantOptionItem);
    return this;
  }

  /**
   * Get variantOption
   * @return variantOption
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VariantOption> getVariantOption() {
    return variantOption;
  }

  public void setVariantOption(List<VariantOption> variantOption) {
    this.variantOption = variantOption;
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
    return Objects.equals(this.id, productVariantImage.id) &&
        Objects.equals(this.productVariantId, productVariantImage.productVariantId) &&
        Objects.equals(this.imgUrl, productVariantImage.imgUrl) &&
        Objects.equals(this.isPrimary, productVariantImage.isPrimary) &&
        Objects.equals(this.variantOption, productVariantImage.variantOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productVariantId, imgUrl, isPrimary, variantOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantImage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    variantOption: ").append(toIndentedString(variantOption)).append("\n");
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

