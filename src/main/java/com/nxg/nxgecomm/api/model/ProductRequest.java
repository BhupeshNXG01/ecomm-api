package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.ProductRequestProductImage;
import com.nxg.nxgecomm.api.model.ProductRequestProductVariant;
import com.nxg.nxgecomm.api.model.ProductRequestSeo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T13:10:42.607566100+05:30[Asia/Calcutta]")

public class ProductRequest   {
  @JsonProperty("categoryId")
  private Integer categoryId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("price")
  private Float price;

  @JsonProperty("cPrice")
  private Float cPrice;

  @JsonProperty("taxPercent")
  private Float taxPercent;

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

  @JsonProperty("meta")
  private String meta;

  @JsonProperty("keyword")
  private String keyword;

  @JsonProperty("seo")
  private ProductRequestSeo seo;

  @JsonProperty("productImage")
  @Valid
  private List<ProductRequestProductImage> productImage = null;

  @JsonProperty("variantOption")
  @Valid
  private List<Map<String, List<String>>> variantOption = null;

  @JsonProperty("productVariant")
  @Valid
  private List<ProductRequestProductVariant> productVariant = null;

  public ProductRequest categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public ProductRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductRequest price(Float price) {
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

  public ProductRequest cPrice(Float cPrice) {
    this.cPrice = cPrice;
    return this;
  }

  /**
   * Get cPrice
   * @return cPrice
  */
  @ApiModelProperty(value = "")


  public Float getcPrice() {
    return cPrice;
  }

  public void setcPrice(Float cPrice) {
    this.cPrice = cPrice;
  }

  public ProductRequest taxPercent(Float taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

  /**
   * Get taxPercent
   * @return taxPercent
  */
  @ApiModelProperty(value = "")


  public Float getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(Float taxPercent) {
    this.taxPercent = taxPercent;
  }

  public ProductRequest qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * Get qty
   * @return qty
  */
  @ApiModelProperty(value = "")

@Size(max=10) 
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public ProductRequest sizeType(Integer sizeType) {
    this.sizeType = sizeType;
    return this;
  }

  /**
   * Get sizeType
   * @return sizeType
  */
  @ApiModelProperty(value = "")

@Size(max=1) 
  public Integer getSizeType() {
    return sizeType;
  }

  public void setSizeType(Integer sizeType) {
    this.sizeType = sizeType;
  }

  public ProductRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductRequest skuCode(String skuCode) {
    this.skuCode = skuCode;
    return this;
  }

  /**
   * Get skuCode
   * @return skuCode
  */
  @ApiModelProperty(value = "")


  public String getSkuCode() {
    return skuCode;
  }

  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
  }

  public ProductRequest barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
  */
  @ApiModelProperty(value = "")


  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public ProductRequest isVariants(Integer isVariants) {
    this.isVariants = isVariants;
    return this;
  }

  /**
   * Get isVariants
   * @return isVariants
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getIsVariants() {
    return isVariants;
  }

  public void setIsVariants(Integer isVariants) {
    this.isVariants = isVariants;
  }

  public ProductRequest productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

  /**
   * Get productUrl
   * @return productUrl
  */
  @ApiModelProperty(value = "")


  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public ProductRequest meta(String meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(value = "")

@Size(max=170) 
  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
    this.meta = meta;
  }

  public ProductRequest keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public ProductRequest seo(ProductRequestSeo seo) {
    this.seo = seo;
    return this;
  }

  /**
   * Get seo
   * @return seo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProductRequestSeo getSeo() {
    return seo;
  }

  public void setSeo(ProductRequestSeo seo) {
    this.seo = seo;
  }

  public ProductRequest productImage(List<ProductRequestProductImage> productImage) {
    this.productImage = productImage;
    return this;
  }

  public ProductRequest addProductImageItem(ProductRequestProductImage productImageItem) {
    if (this.productImage == null) {
      this.productImage = new ArrayList<>();
    }
    this.productImage.add(productImageItem);
    return this;
  }

  /**
   * Get productImage
   * @return productImage
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductRequestProductImage> getProductImage() {
    return productImage;
  }

  public void setProductImage(List<ProductRequestProductImage> productImage) {
    this.productImage = productImage;
  }

  public ProductRequest variantOption(List<Map<String, List<String>>> variantOption) {
    this.variantOption = variantOption;
    return this;
  }

  public ProductRequest addVariantOptionItem(Map<String, List<String>> variantOptionItem) {
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

  public List<Map<String, List<String>>> getVariantOption() {
    return variantOption;
  }

  public void setVariantOption(List<Map<String, List<String>>> variantOption) {
    this.variantOption = variantOption;
  }

  public ProductRequest productVariant(List<ProductRequestProductVariant> productVariant) {
    this.productVariant = productVariant;
    return this;
  }

  public ProductRequest addProductVariantItem(ProductRequestProductVariant productVariantItem) {
    if (this.productVariant == null) {
      this.productVariant = new ArrayList<>();
    }
    this.productVariant.add(productVariantItem);
    return this;
  }

  /**
   * Get productVariant
   * @return productVariant
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductRequestProductVariant> getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(List<ProductRequestProductVariant> productVariant) {
    this.productVariant = productVariant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRequest productRequest = (ProductRequest) o;
    return Objects.equals(this.categoryId, productRequest.categoryId) &&
        Objects.equals(this.title, productRequest.title) &&
        Objects.equals(this.price, productRequest.price) &&
        Objects.equals(this.cPrice, productRequest.cPrice) &&
        Objects.equals(this.taxPercent, productRequest.taxPercent) &&
        Objects.equals(this.qty, productRequest.qty) &&
        Objects.equals(this.sizeType, productRequest.sizeType) &&
        Objects.equals(this.description, productRequest.description) &&
        Objects.equals(this.skuCode, productRequest.skuCode) &&
        Objects.equals(this.barcode, productRequest.barcode) &&
        Objects.equals(this.isVariants, productRequest.isVariants) &&
        Objects.equals(this.productUrl, productRequest.productUrl) &&
        Objects.equals(this.meta, productRequest.meta) &&
        Objects.equals(this.keyword, productRequest.keyword) &&
        Objects.equals(this.seo, productRequest.seo) &&
        Objects.equals(this.productImage, productRequest.productImage) &&
        Objects.equals(this.variantOption, productRequest.variantOption) &&
        Objects.equals(this.productVariant, productRequest.productVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, title, price, cPrice, taxPercent, qty, sizeType, description, skuCode, barcode, isVariants, productUrl, meta, keyword, seo, productImage, variantOption, productVariant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequest {\n");
    
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
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    seo: ").append(toIndentedString(seo)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    variantOption: ").append(toIndentedString(variantOption)).append("\n");
    sb.append("    productVariant: ").append(toIndentedString(productVariant)).append("\n");
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

