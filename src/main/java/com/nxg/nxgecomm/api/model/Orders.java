package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.OrderProducts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Orders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-19T13:12:34.365793400+05:30[Asia/Calcutta]")

public class Orders   {
  @JsonProperty("orderId")
  private Integer orderId;

  @JsonProperty("shipmentId")
  private Integer shipmentId;

  @JsonProperty("shiprocketOrderId")
  private Integer shiprocketOrderId;

  @JsonProperty("paymentStatus")
  private Integer paymentStatus;

  @JsonProperty("paymentMode")
  private String paymentMode;

  @JsonProperty("paymentId")
  private String paymentId;

  @JsonProperty("fulfilmentStatus")
  private Integer fulfilmentStatus;

  @JsonProperty("shipingMode")
  private Integer shipingMode;

  @JsonProperty("shippingAddId")
  private Integer shippingAddId;

  @JsonProperty("billingAddId")
  private Integer billingAddId;

  @JsonProperty("orderTotal")
  private Integer orderTotal;

  @JsonProperty("discountAmount")
  private Integer discountAmount;

  @JsonProperty("discountType")
  private Integer discountType;

  @JsonProperty("itemTotal")
  private Integer itemTotal;

  @JsonProperty("taxPercent")
  private Integer taxPercent;

  @JsonProperty("taxPrice")
  private Integer taxPrice;

  @JsonProperty("shipingPrice")
  private Integer shipingPrice;

  @JsonProperty("totalAmount")
  private Integer totalAmount;

  @JsonProperty("customerId")
  private Integer customerId;

  @JsonProperty("discountId")
  private Integer discountId;

  @JsonProperty("cartSession")
  private String cartSession;

  @JsonProperty("pickupAddressId")
  private Integer pickupAddressId;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("isDelivered")
  private Integer isDelivered;

  @JsonProperty("cancelStatus")
  private Integer cancelStatus;

  @JsonProperty("orderProducts")
  @Valid
  private List<OrderProducts> orderProducts = null;

  public Orders orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Orders shipmentId(Integer shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * Get shipmentId
   * @return shipmentId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(Integer shipmentId) {
    this.shipmentId = shipmentId;
  }

  public Orders shiprocketOrderId(Integer shiprocketOrderId) {
    this.shiprocketOrderId = shiprocketOrderId;
    return this;
  }

  /**
   * Get shiprocketOrderId
   * @return shiprocketOrderId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getShiprocketOrderId() {
    return shiprocketOrderId;
  }

  public void setShiprocketOrderId(Integer shiprocketOrderId) {
    this.shiprocketOrderId = shiprocketOrderId;
  }

  public Orders paymentStatus(Integer paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * Get paymentStatus
   * @return paymentStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(Integer paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public Orders paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  /**
   * Get paymentMode
   * @return paymentMode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }

  public Orders paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public Orders fulfilmentStatus(Integer fulfilmentStatus) {
    this.fulfilmentStatus = fulfilmentStatus;
    return this;
  }

  /**
   * Get fulfilmentStatus
   * @return fulfilmentStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getFulfilmentStatus() {
    return fulfilmentStatus;
  }

  public void setFulfilmentStatus(Integer fulfilmentStatus) {
    this.fulfilmentStatus = fulfilmentStatus;
  }

  public Orders shipingMode(Integer shipingMode) {
    this.shipingMode = shipingMode;
    return this;
  }

  /**
   * Get shipingMode
   * @return shipingMode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getShipingMode() {
    return shipingMode;
  }

  public void setShipingMode(Integer shipingMode) {
    this.shipingMode = shipingMode;
  }

  public Orders shippingAddId(Integer shippingAddId) {
    this.shippingAddId = shippingAddId;
    return this;
  }

  /**
   * Get shippingAddId
   * @return shippingAddId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getShippingAddId() {
    return shippingAddId;
  }

  public void setShippingAddId(Integer shippingAddId) {
    this.shippingAddId = shippingAddId;
  }

  public Orders billingAddId(Integer billingAddId) {
    this.billingAddId = billingAddId;
    return this;
  }

  /**
   * Get billingAddId
   * @return billingAddId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getBillingAddId() {
    return billingAddId;
  }

  public void setBillingAddId(Integer billingAddId) {
    this.billingAddId = billingAddId;
  }

  public Orders orderTotal(Integer orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

  /**
   * Get orderTotal
   * @return orderTotal
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(Integer orderTotal) {
    this.orderTotal = orderTotal;
  }

  public Orders discountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount
   * @return discountAmount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Orders discountType(Integer discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * Get discountType
   * @return discountType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getDiscountType() {
    return discountType;
  }

  public void setDiscountType(Integer discountType) {
    this.discountType = discountType;
  }

  public Orders itemTotal(Integer itemTotal) {
    this.itemTotal = itemTotal;
    return this;
  }

  /**
   * Get itemTotal
   * @return itemTotal
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getItemTotal() {
    return itemTotal;
  }

  public void setItemTotal(Integer itemTotal) {
    this.itemTotal = itemTotal;
  }

  public Orders taxPercent(Integer taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

  /**
   * Get taxPercent
   * @return taxPercent
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(Integer taxPercent) {
    this.taxPercent = taxPercent;
  }

  public Orders taxPrice(Integer taxPrice) {
    this.taxPrice = taxPrice;
    return this;
  }

  /**
   * Get taxPrice
   * @return taxPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getTaxPrice() {
    return taxPrice;
  }

  public void setTaxPrice(Integer taxPrice) {
    this.taxPrice = taxPrice;
  }

  public Orders shipingPrice(Integer shipingPrice) {
    this.shipingPrice = shipingPrice;
    return this;
  }

  /**
   * Get shipingPrice
   * @return shipingPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getShipingPrice() {
    return shipingPrice;
  }

  public void setShipingPrice(Integer shipingPrice) {
    this.shipingPrice = shipingPrice;
  }

  public Orders totalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Orders customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Orders discountId(Integer discountId) {
    this.discountId = discountId;
    return this;
  }

  /**
   * Get discountId
   * @return discountId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getDiscountId() {
    return discountId;
  }

  public void setDiscountId(Integer discountId) {
    this.discountId = discountId;
  }

  public Orders cartSession(String cartSession) {
    this.cartSession = cartSession;
    return this;
  }

  /**
   * Get cartSession
   * @return cartSession
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getCartSession() {
    return cartSession;
  }

  public void setCartSession(String cartSession) {
    this.cartSession = cartSession;
  }

  public Orders pickupAddressId(Integer pickupAddressId) {
    this.pickupAddressId = pickupAddressId;
    return this;
  }

  /**
   * Get pickupAddressId
   * @return pickupAddressId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getPickupAddressId() {
    return pickupAddressId;
  }

  public void setPickupAddressId(Integer pickupAddressId) {
    this.pickupAddressId = pickupAddressId;
  }

  public Orders status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Orders isDelivered(Integer isDelivered) {
    this.isDelivered = isDelivered;
    return this;
  }

  /**
   * Get isDelivered
   * @return isDelivered
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getIsDelivered() {
    return isDelivered;
  }

  public void setIsDelivered(Integer isDelivered) {
    this.isDelivered = isDelivered;
  }

  public Orders cancelStatus(Integer cancelStatus) {
    this.cancelStatus = cancelStatus;
    return this;
  }

  /**
   * Get cancelStatus
   * @return cancelStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getCancelStatus() {
    return cancelStatus;
  }

  public void setCancelStatus(Integer cancelStatus) {
    this.cancelStatus = cancelStatus;
  }

  public Orders orderProducts(List<OrderProducts> orderProducts) {
    this.orderProducts = orderProducts;
    return this;
  }

  public Orders addOrderProductsItem(OrderProducts orderProductsItem) {
    if (this.orderProducts == null) {
      this.orderProducts = new ArrayList<>();
    }
    this.orderProducts.add(orderProductsItem);
    return this;
  }

  /**
   * Get orderProducts
   * @return orderProducts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderProducts> getOrderProducts() {
    return orderProducts;
  }

  public void setOrderProducts(List<OrderProducts> orderProducts) {
    this.orderProducts = orderProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Orders orders = (Orders) o;
    return Objects.equals(this.orderId, orders.orderId) &&
        Objects.equals(this.shipmentId, orders.shipmentId) &&
        Objects.equals(this.shiprocketOrderId, orders.shiprocketOrderId) &&
        Objects.equals(this.paymentStatus, orders.paymentStatus) &&
        Objects.equals(this.paymentMode, orders.paymentMode) &&
        Objects.equals(this.paymentId, orders.paymentId) &&
        Objects.equals(this.fulfilmentStatus, orders.fulfilmentStatus) &&
        Objects.equals(this.shipingMode, orders.shipingMode) &&
        Objects.equals(this.shippingAddId, orders.shippingAddId) &&
        Objects.equals(this.billingAddId, orders.billingAddId) &&
        Objects.equals(this.orderTotal, orders.orderTotal) &&
        Objects.equals(this.discountAmount, orders.discountAmount) &&
        Objects.equals(this.discountType, orders.discountType) &&
        Objects.equals(this.itemTotal, orders.itemTotal) &&
        Objects.equals(this.taxPercent, orders.taxPercent) &&
        Objects.equals(this.taxPrice, orders.taxPrice) &&
        Objects.equals(this.shipingPrice, orders.shipingPrice) &&
        Objects.equals(this.totalAmount, orders.totalAmount) &&
        Objects.equals(this.customerId, orders.customerId) &&
        Objects.equals(this.discountId, orders.discountId) &&
        Objects.equals(this.cartSession, orders.cartSession) &&
        Objects.equals(this.pickupAddressId, orders.pickupAddressId) &&
        Objects.equals(this.status, orders.status) &&
        Objects.equals(this.isDelivered, orders.isDelivered) &&
        Objects.equals(this.cancelStatus, orders.cancelStatus) &&
        Objects.equals(this.orderProducts, orders.orderProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, shipmentId, shiprocketOrderId, paymentStatus, paymentMode, paymentId, fulfilmentStatus, shipingMode, shippingAddId, billingAddId, orderTotal, discountAmount, discountType, itemTotal, taxPercent, taxPrice, shipingPrice, totalAmount, customerId, discountId, cartSession, pickupAddressId, status, isDelivered, cancelStatus, orderProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Orders {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    shiprocketOrderId: ").append(toIndentedString(shiprocketOrderId)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    fulfilmentStatus: ").append(toIndentedString(fulfilmentStatus)).append("\n");
    sb.append("    shipingMode: ").append(toIndentedString(shipingMode)).append("\n");
    sb.append("    shippingAddId: ").append(toIndentedString(shippingAddId)).append("\n");
    sb.append("    billingAddId: ").append(toIndentedString(billingAddId)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    itemTotal: ").append(toIndentedString(itemTotal)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
    sb.append("    taxPrice: ").append(toIndentedString(taxPrice)).append("\n");
    sb.append("    shipingPrice: ").append(toIndentedString(shipingPrice)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    cartSession: ").append(toIndentedString(cartSession)).append("\n");
    sb.append("    pickupAddressId: ").append(toIndentedString(pickupAddressId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isDelivered: ").append(toIndentedString(isDelivered)).append("\n");
    sb.append("    cancelStatus: ").append(toIndentedString(cancelStatus)).append("\n");
    sb.append("    orderProducts: ").append(toIndentedString(orderProducts)).append("\n");
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

