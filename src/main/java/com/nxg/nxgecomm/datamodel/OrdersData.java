package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nxg.nxgecomm.api.model.OrderProducts;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class OrdersData implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "shipment_id")
	private int shipmentId;
	
	@Column(name = "shiprocket_order_id")
	private int shiprocketOrderId;
	
	@Column(name = "payment_status")
	private int paymentStatus;
	
	@Column(name = "payment_id")
	private String paymentId;
	
	@Column(name = "fulfilment_status")
	private int fulfilmentStatus;
	
	@Column(name = "shiping_mode")
	private int shipingMode;
	
	@Column(name = "shipping_add_id")
	private int shippingAddId;
	
	@Column(name = "billing_add_id")
	private int billingAddId;
	
	@Column(name = "order_total")
	private int orderTotal;
	
	@Column(name = "discount_amount")
	private int discountAmount;
	
	@Column(name = "discount_type")
	private int discountType;
	
	@Column(name = "item_total")
	private int itemTotal;
	
	@Column(name = "tax_percent")
	private int taxPercent;	
	
	@Column(name = "tax_price")
	private int taxPrice;
	
	@Column(name = "shiping_price")
	private int shipingPrice;
	
	@Column(name = "total_amount")
	private int totalAmount;
	
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "discount_id")
	private int discountId;
	
	@Column(name = "cart_session")
	private String cartSession;	
	
	@Column(name = "pickup_address_id")
	private int pickupAddressId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "is_delivered")
	private int isDelivered;
	
	@Column(name = "payment_mode")
	private String paymentMode;
	
	
	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Column(name = "cancel_status")
	private int cancelStatus;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ordersData")
	List<OrderProductsData> orderProductsDataList;

	
	
	public List<OrderProductsData> getOrderProductsDataList() {
		return orderProductsDataList;
	}

	public void setOrderProductsDataList(List<OrderProductsData> orderProductsDataList) {
		this.orderProductsDataList = orderProductsDataList;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	

	public int getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public int getShiprocketOrderId() {
		return shiprocketOrderId;
	}

	public void setShiprocketOrderId(int shiprocketOrderId) {
		this.shiprocketOrderId = shiprocketOrderId;
	}

	public int getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public int getFulfilmentStatus() {
		return fulfilmentStatus;
	}

	public void setFulfilmentStatus(int fulfilmentStatus) {
		this.fulfilmentStatus = fulfilmentStatus;
	}

	public int getShipingMode() {
		return shipingMode;
	}

	public void setShipingMode(int shipingMode) {
		this.shipingMode = shipingMode;
	}

	public int getShippingAddId() {
		return shippingAddId;
	}

	public void setShippingAddId(int shippingAddId) {
		this.shippingAddId = shippingAddId;
	}

	public int getBillingAddId() {
		return billingAddId;
	}

	public void setBillingAddId(int billingAddId) {
		this.billingAddId = billingAddId;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getDiscountType() {
		return discountType;
	}

	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}

	public int getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}

	public int getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(int taxPercent) {
		this.taxPercent = taxPercent;
	}

	public int getTaxPrice() {
		return taxPrice;
	}

	public void setTaxPrice(int taxPrice) {
		this.taxPrice = taxPrice;
	}

	public int getShipingPrice() {
		return shipingPrice;
	}

	public void setShipingPrice(int shipingPrice) {
		this.shipingPrice = shipingPrice;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getCartSession() {
		return cartSession;
	}

	public void setCartSession(String cartSession) {
		this.cartSession = cartSession;
	}

	public int getPickupAddressId() {
		return pickupAddressId;
	}

	public void setPickupAddressId(int pickupAddressId) {
		this.pickupAddressId = pickupAddressId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIsDelivered() {
		return isDelivered;
	}

	public void setIsDelivered(int isDelivered) {
		this.isDelivered = isDelivered;
	}


	public int getCancelStatus() {
		return cancelStatus;
	}

	public void setCancelStatus(int cancelStatus) {
		this.cancelStatus = cancelStatus;
	}
	
	
}
