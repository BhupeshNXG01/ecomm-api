package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nxg.nxgecomm.api.model.Orders;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_products")
public class OrderProductsData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_product_id")
	private int orderProductId;
	
//	@Column(name = "order_id")
//	private int orderId;
	
	@Column(name = "product_id")
	private int productId;	
	
	@Column(name = "row_id")
	private int rowId;
	
	@Column(name = "qty")
	private int quantity;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "status")
	private String status;
	

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private OrdersData ordersData;

	
	public OrdersData getOrdersData() {
		return ordersData;
	}

	public void setOrdersData(OrdersData ordersData) {
		this.ordersData = ordersData;
	}



//	public int getOrderId() {
//		return orderId;
//	}

//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}

	public int getOrderProductId() {
		return orderProductId;
	}

	public void setOrderProductId(int orderProductId) {
		this.orderProductId = orderProductId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getRowId() {
		return rowId;
	}

	public void setRowId(int rowId) {
		this.rowId = rowId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
