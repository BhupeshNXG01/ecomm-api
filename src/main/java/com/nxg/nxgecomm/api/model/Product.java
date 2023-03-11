package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.ProductImage;
import com.nxg.nxgecomm.api.model.ProductVariant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-11T18:40:56.382042300+05:30[Asia/Calcutta]")

public class Product   {
  @JsonProperty("productId")
  private Integer productId;

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

  @JsonProperty("searchTerms")
  private String searchTerms;

  @JsonProperty("seoTitle")
  private String seoTitle;

  @JsonProperty("meta")
  private String meta;

  @JsonProperty("keyword")
  private String keyword;

  @JsonProperty("productImage")
  @Valid
  private List<ProductImage> productImage = null;

  @JsonProperty("productVariant")
  @Valid
  private List<ProductVariant> productVariant = null;

  public Product productId(Integer productId) {
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

  public Product categoryId(Integer categoryId) {
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

  public Product title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Product price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Product cPrice(Float cPrice) {
    this.cPrice = cPrice;
    return this;
  }

  /**
   * Get cPrice
   * @return cPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Float getcPrice() {
    return cPrice;
  }

  public void setcPrice(Float cPrice) {
    this.cPrice = cPrice;
  }

  public Product taxPercent(Float taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

  /**
   * Get taxPercent
   * @return taxPercent
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Float getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(Float taxPercent) {
    this.taxPercent = taxPercent;
  }

  public Product qty(Integer qty) {
    this.qty = qty;
    return this;
  }

  /**
   * Get qty
   * @return qty
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public Product sizeType(Integer sizeType) {
    this.sizeType = sizeType;
    return this;
  }

  /**
   * Get sizeType
   * @return sizeType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getSizeType() {
    return sizeType;
  }

  public void setSizeType(Integer sizeType) {
    this.sizeType = sizeType;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product skuCode(String skuCode) {
    this.skuCode = skuCode;
    return this;
  }

  /**
   * Get skuCode
   * @return skuCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSkuCode() {
    return skuCode;
  }

  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode;
  }

  public Product barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public Product isVariants(Integer isVariants) {
    this.isVariants = isVariants;
    return this;
  }

  /**
   * Get isVariants
   * @return isVariants
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getIsVariants() {
    return isVariants;
  }

  public void setIsVariants(Integer isVariants) {
    this.isVariants = isVariants;
  }

  public Product productUrl(String productUrl) {
    this.productUrl = productUrl;
    return this;
  }

  /**
   * Get productUrl
   * @return productUrl
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getProductUrl() {
    return productUrl;
  }

  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }

  public Product searchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }

  /**
   * Get searchTerms
   * @return searchTerms
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSearchTerms() {
    return searchTerms;
  }

  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }

  public Product seoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
    return this;
  }

  /**
   * Get seoTitle
   * @return seoTitle
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=250) 
  public String getSeoTitle() {
    return seoTitle;
  }

  public void setSeoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
  }

  public Product meta(String meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=170) 
  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
    this.meta = meta;
  }

  public Product keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public Product productImage(List<ProductImage> productImage) {
    this.productImage = productImage;
    return this;
  }

  public Product addProductImageItem(ProductImage productImageItem) {
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

  public List<ProductImage> getProductImage() {
    return productImage;
  }

  public void setProductImage(List<ProductImage> productImage) {
    this.productImage = productImage;
  }

  public Product productVariant(List<ProductVariant> productVariant) {
    this.productVariant = productVariant;
    return this;
  }

  public Product addProductVariantItem(ProductVariant productVariantItem) {
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

  public List<ProductVariant> getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(List<ProductVariant> productVariant) {
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
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.categoryId, product.categoryId) &&
        Objects.equals(this.title, product.title) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.cPrice, product.cPrice) &&
        Objects.equals(this.taxPercent, product.taxPercent) &&
        Objects.equals(this.qty, product.qty) &&
        Objects.equals(this.sizeType, product.sizeType) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.skuCode, product.skuCode) &&
        Objects.equals(this.barcode, product.barcode) &&
        Objects.equals(this.isVariants, product.isVariants) &&
        Objects.equals(this.productUrl, product.productUrl) &&
        Objects.equals(this.searchTerms, product.searchTerms) &&
        Objects.equals(this.seoTitle, product.seoTitle) &&
        Objects.equals(this.meta, product.meta) &&
        Objects.equals(this.keyword, product.keyword) &&
        Objects.equals(this.productImage, product.productImage) &&
        Objects.equals(this.productVariant, product.productVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId, title, price, cPrice, taxPercent, qty, sizeType, description, skuCode, barcode, isVariants, productUrl, searchTerms, seoTitle, meta, keyword, productImage, productVariant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    seoTitle: ").append(toIndentedString(seoTitle)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
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

