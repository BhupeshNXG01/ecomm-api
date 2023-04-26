package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.ProductVariantImage;
import com.nxg.nxgecomm.api.model.VariantOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductVariant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

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

  @JsonProperty("barcode")
  private String barcode;

  @JsonProperty("isDefault")
  private Boolean isDefault;

  @JsonProperty("status")
  private String status;

  @JsonProperty("productVariantImage")
  @Valid
  private List<ProductVariantImage> productVariantImage = null;

  @JsonProperty("variantOption")
  @Valid
  private List<VariantOption> variantOption = null;

  public ProductVariant productVariantId(Integer productVariantId) {
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

  public ProductVariant productId(Integer productId) {
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

  public ProductVariant variantOptionValueId1(Integer variantOptionValueId1) {
    this.variantOptionValueId1 = variantOptionValueId1;
    return this;
  }

  /**
   * Get variantOptionValueId1
   * @return variantOptionValueId1
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=120) 
  public String getVariantCombinationName() {
    return variantCombinationName;
  }

  public void setVariantCombinationName(String variantCombinationName) {
    this.variantCombinationName = variantCombinationName;
  }

  public ProductVariant barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

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
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public ProductVariant status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProductVariant productVariantImage(List<ProductVariantImage> productVariantImage) {
    this.productVariantImage = productVariantImage;
    return this;
  }

  public ProductVariant addProductVariantImageItem(ProductVariantImage productVariantImageItem) {
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

  public List<ProductVariantImage> getProductVariantImage() {
    return productVariantImage;
  }

  public void setProductVariantImage(List<ProductVariantImage> productVariantImage) {
    this.productVariantImage = productVariantImage;
  }

  public ProductVariant variantOption(List<VariantOption> variantOption) {
    this.variantOption = variantOption;
    return this;
  }

  public ProductVariant addVariantOptionItem(VariantOption variantOptionItem) {
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
    ProductVariant productVariant = (ProductVariant) o;
    return Objects.equals(this.productVariantId, productVariant.productVariantId) &&
        Objects.equals(this.productId, productVariant.productId) &&
        Objects.equals(this.variantOptionValueId1, productVariant.variantOptionValueId1) &&
        Objects.equals(this.variantOptionValueId2, productVariant.variantOptionValueId2) &&
        Objects.equals(this.variantCombinationName, productVariant.variantCombinationName) &&
        Objects.equals(this.barcode, productVariant.barcode) &&
        Objects.equals(this.isDefault, productVariant.isDefault) &&
        Objects.equals(this.status, productVariant.status) &&
        Objects.equals(this.productVariantImage, productVariant.productVariantImage) &&
        Objects.equals(this.variantOption, productVariant.variantOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, productId, variantOptionValueId1, variantOptionValueId2, variantCombinationName, barcode, isDefault, status, productVariantImage, variantOption);
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
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    productVariantImage: ").append(toIndentedString(productVariantImage)).append("\n");
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

