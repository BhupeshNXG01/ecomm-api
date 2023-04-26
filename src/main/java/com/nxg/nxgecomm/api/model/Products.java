package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.Price;
import com.nxg.nxgecomm.api.model.ProductImage;
import com.nxg.nxgecomm.api.model.ProductVariant;
import com.nxg.nxgecomm.api.model.Seo;
import com.nxg.nxgecomm.api.model.Stock;
import com.nxg.nxgecomm.api.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Products
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

public class Products   {
  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("categoryId")
  private Integer categoryId;

  @JsonProperty("tax_id")
  private Integer taxId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("sizeType")
  private Integer sizeType;

  @JsonProperty("description")
  private String description;

  @JsonProperty("barcode")
  private String barcode;

  @JsonProperty("isVariants")
  private Integer isVariants;

  @JsonProperty("productUrl")
  private String productUrl;

  @JsonProperty("metaDescription")
  private String metaDescription;

  @JsonProperty("keyword")
  private String keyword;

  @JsonProperty("seo")
  private Seo seo;

  @JsonProperty("tax")
  private Tax tax;

  @JsonProperty("stock")
  @Valid
  private List<Stock> stock = null;

  @JsonProperty("price")
  @Valid
  private List<Price> price = null;

  @JsonProperty("productImage")
  @Valid
  private List<ProductImage> productImage = null;

  @JsonProperty("productVariant")
  @Valid
  private List<ProductVariant> productVariant = null;

  public Products productId(Integer productId) {
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

  public Products categoryId(Integer categoryId) {
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

  public Products taxId(Integer taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getTaxId() {
    return taxId;
  }

  public void setTaxId(Integer taxId) {
    this.taxId = taxId;
  }

  public Products title(String title) {
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

  public Products sizeType(Integer sizeType) {
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

  public Products description(String description) {
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

  public Products barcode(String barcode) {
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

  public Products isVariants(Integer isVariants) {
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

  public Products productUrl(String productUrl) {
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

  public Products metaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

  /**
   * Get metaDescription
   * @return metaDescription
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=170) 
  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public Products keyword(String keyword) {
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

  public Products seo(Seo seo) {
    this.seo = seo;
    return this;
  }

  /**
   * Get seo
   * @return seo
  */
  @ApiModelProperty(value = "")

  @Valid

  public Seo getSeo() {
    return seo;
  }

  public void setSeo(Seo seo) {
    this.seo = seo;
  }

  public Products tax(Tax tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  */
  @ApiModelProperty(value = "")

  @Valid

  public Tax getTax() {
    return tax;
  }

  public void setTax(Tax tax) {
    this.tax = tax;
  }

  public Products stock(List<Stock> stock) {
    this.stock = stock;
    return this;
  }

  public Products addStockItem(Stock stockItem) {
    if (this.stock == null) {
      this.stock = new ArrayList<>();
    }
    this.stock.add(stockItem);
    return this;
  }

  /**
   * Get stock
   * @return stock
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Stock> getStock() {
    return stock;
  }

  public void setStock(List<Stock> stock) {
    this.stock = stock;
  }

  public Products price(List<Price> price) {
    this.price = price;
    return this;
  }

  public Products addPriceItem(Price priceItem) {
    if (this.price == null) {
      this.price = new ArrayList<>();
    }
    this.price.add(priceItem);
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Price> getPrice() {
    return price;
  }

  public void setPrice(List<Price> price) {
    this.price = price;
  }

  public Products productImage(List<ProductImage> productImage) {
    this.productImage = productImage;
    return this;
  }

  public Products addProductImageItem(ProductImage productImageItem) {
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

  public Products productVariant(List<ProductVariant> productVariant) {
    this.productVariant = productVariant;
    return this;
  }

  public Products addProductVariantItem(ProductVariant productVariantItem) {
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
    Products products = (Products) o;
    return Objects.equals(this.productId, products.productId) &&
        Objects.equals(this.categoryId, products.categoryId) &&
        Objects.equals(this.taxId, products.taxId) &&
        Objects.equals(this.title, products.title) &&
        Objects.equals(this.sizeType, products.sizeType) &&
        Objects.equals(this.description, products.description) &&
        Objects.equals(this.barcode, products.barcode) &&
        Objects.equals(this.isVariants, products.isVariants) &&
        Objects.equals(this.productUrl, products.productUrl) &&
        Objects.equals(this.metaDescription, products.metaDescription) &&
        Objects.equals(this.keyword, products.keyword) &&
        Objects.equals(this.seo, products.seo) &&
        Objects.equals(this.tax, products.tax) &&
        Objects.equals(this.stock, products.stock) &&
        Objects.equals(this.price, products.price) &&
        Objects.equals(this.productImage, products.productImage) &&
        Objects.equals(this.productVariant, products.productVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId, taxId, title, sizeType, description, barcode, isVariants, productUrl, metaDescription, keyword, seo, tax, stock, price, productImage, productVariant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Products {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    isVariants: ").append(toIndentedString(isVariants)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    seo: ").append(toIndentedString(seo)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

