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
 * OrderProducts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T12:19:21.972986800+05:30[Asia/Calcutta]")

public class OrderProducts   {
  @JsonProperty("orderProductId")
  private Integer orderProductId;

  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("rowId")
  private Integer rowId;

  @JsonProperty("status")
  private String status;

  public OrderProducts orderProductId(Integer orderProductId) {
    this.orderProductId = orderProductId;
    return this;
  }

  /**
   * Get orderProductId
   * @return orderProductId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getOrderProductId() {
    return orderProductId;
  }

  public void setOrderProductId(Integer orderProductId) {
    this.orderProductId = orderProductId;
  }

  public OrderProducts productId(Integer productId) {
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

  public OrderProducts quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderProducts amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=100) 
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public OrderProducts rowId(Integer rowId) {
    this.rowId = rowId;
    return this;
  }

  /**
   * Get rowId
   * @return rowId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public Integer getRowId() {
    return rowId;
  }

  public void setRowId(Integer rowId) {
    this.rowId = rowId;
  }

  public OrderProducts status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=20) 
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
    OrderProducts orderProducts = (OrderProducts) o;
    return Objects.equals(this.orderProductId, orderProducts.orderProductId) &&
        Objects.equals(this.productId, orderProducts.productId) &&
        Objects.equals(this.quantity, orderProducts.quantity) &&
        Objects.equals(this.amount, orderProducts.amount) &&
        Objects.equals(this.rowId, orderProducts.rowId) &&
        Objects.equals(this.status, orderProducts.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderProductId, productId, quantity, amount, rowId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderProducts {\n");
    
    sb.append("    orderProductId: ").append(toIndentedString(orderProductId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
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

