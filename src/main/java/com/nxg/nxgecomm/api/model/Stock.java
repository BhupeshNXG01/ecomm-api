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
 * Stock
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

public class Stock   {
  @JsonProperty("stockId")
  private Integer stockId;

  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("productVariantId")
  private Integer productVariantId;

  @JsonProperty("skuCode")
  private String skuCode;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("status")
  private String status;

  public Stock stockId(Integer stockId) {
    this.stockId = stockId;
    return this;
  }

  /**
   * Get stockId
   * @return stockId
  */
  @ApiModelProperty(value = "")


  public Integer getStockId() {
    return stockId;
  }

  public void setStockId(Integer stockId) {
    this.stockId = stockId;
  }

  public Stock productId(Integer productId) {
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

  public Stock productVariantId(Integer productVariantId) {
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

  public Stock skuCode(String skuCode) {
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

  public Stock quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Stock status(String status) {
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
    Stock stock = (Stock) o;
    return Objects.equals(this.stockId, stock.stockId) &&
        Objects.equals(this.productId, stock.productId) &&
        Objects.equals(this.productVariantId, stock.productVariantId) &&
        Objects.equals(this.skuCode, stock.skuCode) &&
        Objects.equals(this.quantity, stock.quantity) &&
        Objects.equals(this.status, stock.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stockId, productId, productVariantId, skuCode, quantity, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stock {\n");
    
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

