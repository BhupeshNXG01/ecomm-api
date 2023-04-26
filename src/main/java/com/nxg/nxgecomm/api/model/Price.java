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
 * Price
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

public class Price   {
  @JsonProperty("priceId")
  private Integer priceId;

  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("productVariantId")
  private Integer productVariantId;

  @JsonProperty("sellPrice")
  private Float sellPrice;

  @JsonProperty("listPrice")
  private Float listPrice;

  @JsonProperty("currencyCode")
  private String currencyCode;

  @JsonProperty("status")
  private String status;

  public Price priceId(Integer priceId) {
    this.priceId = priceId;
    return this;
  }

  /**
   * Get priceId
   * @return priceId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getPriceId() {
    return priceId;
  }

  public void setPriceId(Integer priceId) {
    this.priceId = priceId;
  }

  public Price productId(Integer productId) {
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

  public Price productVariantId(Integer productVariantId) {
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

  public Price sellPrice(Float sellPrice) {
    this.sellPrice = sellPrice;
    return this;
  }

  /**
   * Get sellPrice
   * @return sellPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Float getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(Float sellPrice) {
    this.sellPrice = sellPrice;
  }

  public Price listPrice(Float listPrice) {
    this.listPrice = listPrice;
    return this;
  }

  /**
   * Get listPrice
   * @return listPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Float getListPrice() {
    return listPrice;
  }

  public void setListPrice(Float listPrice) {
    this.listPrice = listPrice;
  }

  public Price currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=4) 
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Price status(String status) {
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
    Price price = (Price) o;
    return Objects.equals(this.priceId, price.priceId) &&
        Objects.equals(this.productId, price.productId) &&
        Objects.equals(this.productVariantId, price.productVariantId) &&
        Objects.equals(this.sellPrice, price.sellPrice) &&
        Objects.equals(this.listPrice, price.listPrice) &&
        Objects.equals(this.currencyCode, price.currencyCode) &&
        Objects.equals(this.status, price.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceId, productId, productVariantId, sellPrice, listPrice, currencyCode, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    priceId: ").append(toIndentedString(priceId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

