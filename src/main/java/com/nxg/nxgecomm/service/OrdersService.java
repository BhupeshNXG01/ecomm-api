package com.nxg.nxgecomm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.nxg.nxgecomm.api.model.OrderProducts;
import com.nxg.nxgecomm.api.model.Orders;
import com.nxg.nxgecomm.datamodel.OrderProductsData;
import com.nxg.nxgecomm.datamodel.OrdersData;
import com.nxg.nxgecomm.repository.OrderProductsRepository;
import com.nxg.nxgecomm.repository.OrdersRepository;

@Service
public class OrdersService {
	
	OrdersData orderData ;
	Optional<OrdersData> orderDataOp;
	Optional<OrderProductsData> orderProductDataOp;
	
	@Autowired
	OrdersRepository orderRepository;
	@Autowired
	OrderProductsRepository orderProductsRepository;
	
	public Orders createOrders(Orders  orders ) throws Exception {
		
		try {
			OrdersData orderData = new OrdersData() ;
			orderData.setShiprocketOrderId(orders.getShiprocketOrderId());
			orderData.setPaymentStatus(orders.getPaymentStatus());
			orderData.setPaymentMode(orders.getPaymentMode());
			orderData.setShipmentId(orders.getShipmentId());
			orderData.setPaymentId(orders.getPaymentId());
			orderData.setFulfilmentStatus(orders.getFulfilmentStatus());
			orderData.setShipingMode(orders.getShipingMode());
			orderData.setShippingAddId(orders.getShippingAddId());
			orderData.setBillingAddId(orders.getBillingAddId());
			orderData.setOrderTotal(orders.getOrderTotal());
			orderData.setDiscountAmount(orders.getDiscountAmount());
			orderData.setDiscountType(orders.getDiscountType());
			orderData.setItemTotal(orders.getItemTotal());
			orderData.setTaxPercent(orders.getTaxPercent());
			orderData.setTaxPrice(orders.getTaxPrice());
			orderData.setShipingPrice(orders.getShipingPrice());
			orderData.setTotalAmount(orders.getTotalAmount());
			orderData.setCustomerId(orders.getCustomerId());
			orderData.setDiscountId(orders.getDiscountId());
			orderData.setCartSession(orders.getCartSession());
			orderData.setPickupAddressId(orders.getPickupAddressId());
			orderData.setStatus(orders.getStatus());
			orderData.setIsDelivered(orders.getIsDelivered());
			orderData.setCancelStatus(orders.getCancelStatus());
			
			List<OrderProductsData> orderList = new ArrayList<OrderProductsData>();
			List<OrderProducts> orderProductList = orders.getOrderProducts();
			
			for(OrderProducts orderProduct : orderProductList ) {
				OrderProductsData orderproductdata = new OrderProductsData() ;
				orderproductdata.setAmount(orderProduct.getAmount());
				orderproductdata.setOrderProductId(orderProduct.getOrderProductId());
				orderproductdata.setProductId(orderProduct.getProductId());
				orderproductdata.setRowId(orderProduct.getRowId());		
				orderproductdata.setQuantity(orderProduct.getQuantity());
				orderproductdata.setAmount(orderProduct.getAmount());
				orderproductdata.setStatus(orderProduct.getStatus());
				orderproductdata.setOrdersData(orderData);
				orderList.add(orderproductdata);
			}
			orderData.setOrderProductsDataList(orderList);
			orderData = orderRepository.save(orderData);
			orders.setOrderId(orderData.getOrderId());
			return orders;
		}
		catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
		
	}
	
	public List<Orders> getAllOrders() throws Exception {
		
		List<Orders> orderList = new ArrayList<Orders>();
		List<OrdersData> ordersDataList = orderRepository.findByStatus(1);
		if(ordersDataList.size() > 0) {
			
			try {
				
				for(OrdersData ordersData: ordersDataList) {
					
					Orders orders = new Orders();

		            orders.setOrderId(ordersData.getOrderId());
		            orders.setShipmentId(ordersData.getShipmentId());
					orders.setShiprocketOrderId(ordersData.getShiprocketOrderId());
					orders.setPaymentStatus(ordersData.getPaymentStatus());
					orders.setPaymentMode(ordersData.getPaymentMode());
					orders.setPaymentId(ordersData.getPaymentId());
					orders.setFulfilmentStatus(ordersData.getFulfilmentStatus());
					orders.setShipingMode(ordersData.getShipingMode());
					orders.setShippingAddId(ordersData.getShippingAddId());
					orders.setBillingAddId(ordersData.getBillingAddId());
					orders.setOrderTotal(ordersData.getOrderTotal());
					orders.setDiscountAmount(ordersData.getDiscountAmount());
					orders.setDiscountType(ordersData.getDiscountType());
					orders.setItemTotal(ordersData.getItemTotal());
					orders.setTaxPercent(ordersData.getTaxPercent());
					orders.setTaxPrice(ordersData.getTaxPrice());
					orders.setShipingPrice(ordersData.getShipingPrice());
					orders.setTotalAmount(ordersData.getTotalAmount());
					orders.setCustomerId(ordersData.getCustomerId());
					orders.setDiscountId(ordersData.getDiscountId());
					orders.setCartSession(ordersData.getCartSession());
					orders.setPickupAddressId(ordersData.getPickupAddressId());
					orders.setStatus(ordersData.getStatus());
					orders.setIsDelivered(ordersData.getIsDelivered());
					orders.setCancelStatus(ordersData.getCancelStatus());
					orderList.add(orders);
					
				List<OrderProducts> orderProductsList = new ArrayList<OrderProducts>();
				List<OrderProductsData> ordersProductsDataList = ordersData.getOrderProductsDataList();
				
				System.out.println(ordersProductsDataList);
				
				for(OrderProductsData orderproductsdata : ordersProductsDataList ) {
					OrderProducts orderproducts = new OrderProducts();
					orderproducts.setAmount(orderproductsdata.getAmount());
					orderproducts.setOrderProductId(orderproductsdata.getOrderProductId());
					orderproducts.setProductId(orderproductsdata.getProductId());
					orderproducts.setRowId(orderproductsdata.getRowId());		
					orderproducts.setQuantity(orderproductsdata.getQuantity());
					orderproducts.setAmount(orderproductsdata.getAmount());
					orderproducts.setStatus(orderproductsdata.getStatus());
					orderProductsList.add(orderproducts);	
				}
				orders.setOrderProducts(orderProductsList);
		
				}
				return orderList;
			}catch(ResponseStatusException ex) {
				throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
			}
			
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");		
	}
}

	
	

public List<Orders> getOrdersById(int id) throws Exception{
	
	ArrayList<Orders> orderList = new ArrayList<Orders>();
	orderDataOp = orderRepository.findByOrderId(id);
	orderProductDataOp = orderProductsRepository.findByOrderProductIdAndStatus(id,1);
    if(orderDataOp.isPresent()) {
		
    	try {
    		
    		    OrdersData ordersData = orderDataOp.get();
				Orders orders = new Orders();
				
				orders.setOrderId(ordersData.getOrderId());
		        orders.setShipmentId(ordersData.getShipmentId());
				orders.setShiprocketOrderId(ordersData.getShiprocketOrderId());
				orders.setPaymentStatus(ordersData.getPaymentStatus());
				orders.setPaymentMode(ordersData.getPaymentMode());
				orders.setPaymentId(ordersData.getPaymentId());
				orders.setFulfilmentStatus(ordersData.getFulfilmentStatus());
				orders.setShipingMode(ordersData.getShipingMode());
				orders.setShippingAddId(ordersData.getShippingAddId());
				orders.setBillingAddId(ordersData.getBillingAddId());
				orders.setOrderTotal(ordersData.getOrderTotal());
				orders.setDiscountAmount(ordersData.getDiscountAmount());
				orders.setDiscountType(ordersData.getDiscountType());
				orders.setItemTotal(ordersData.getItemTotal());
				orders.setTaxPercent(ordersData.getTaxPercent());
				orders.setTaxPrice(ordersData.getTaxPrice());
				orders.setShipingPrice(ordersData.getShipingPrice());
				orders.setTotalAmount(ordersData.getTotalAmount());
				orders.setCustomerId(ordersData.getCustomerId());
				orders.setDiscountId(ordersData.getDiscountId());
				orders.setCartSession(ordersData.getCartSession());
				orders.setPickupAddressId(ordersData.getPickupAddressId());
				orders.setStatus(ordersData.getStatus());
				orders.setIsDelivered(ordersData.getIsDelivered());
				orders.setCancelStatus(ordersData.getCancelStatus());
				orderList.add(orders);
				
			List<OrderProducts> orderProductsList = new ArrayList<OrderProducts>();
			List<OrderProductsData> ordersProductsDataList = ordersData.getOrderProductsDataList();
			
			
			  for(OrderProductsData orderProductsData : ordersProductsDataList) {
				  OrderProducts orderproducts = new OrderProducts();
					
					orderproducts.setAmount(orderProductsData.getAmount());
					orderproducts.setOrderProductId(orderProductsData.getOrderProductId());
					orderproducts.setProductId(orderProductsData.getProductId());
					orderproducts.setRowId(orderProductsData.getRowId());		
					orderproducts.setQuantity(orderProductsData.getQuantity());
					orderproducts.setAmount(orderProductsData.getAmount());
					orderproducts.setStatus(orderProductsData.getStatus());
					orderProductsList.add(orderproducts);
			  }	
			
			orders.setOrderProducts(orderProductsList);
	
			
			return orderList;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");		
}
	
}



public Orders updateOrders(int id, Orders orders) throws Exception{
    
    orderDataOp = orderRepository.findByOrderId(id);
    orderProductDataOp = orderProductsRepository.findByOrderProductId(id);
    
    if(orderDataOp.isPresent() && orderProductDataOp.isPresent()) {
        
        try {
            OrdersData orderData = orderDataOp.get();
            OrderProductsData orderProductData = orderProductDataOp.get();
            
            orderData.setShiprocketOrderId(orders.getShiprocketOrderId());
            orderData.setPaymentStatus(orders.getPaymentStatus());
            orderData.setPaymentMode(orders.getPaymentMode());
            orderData.setPaymentId(orders.getPaymentId());            
            orderData.setFulfilmentStatus(orders.getFulfilmentStatus());
            orderData.setShipingMode(orders.getShipingMode());
            orderData.setShippingAddId(orders.getShippingAddId());
            orderData.setBillingAddId(orders.getBillingAddId());
            orderData.setOrderTotal(orders.getOrderTotal());
            orderData.setDiscountAmount(orders.getDiscountAmount());
            orderData.setDiscountType(orders.getDiscountType());
            orderData.setItemTotal(orders.getItemTotal());
            orderData.setTaxPercent(orders.getTaxPercent());
            orderData.setTaxPrice(orders.getTaxPrice());
            orderData.setShipingPrice(orders.getShipingPrice());
            orderData.setTotalAmount(orders.getTotalAmount());
            orderData.setCustomerId(orders.getCustomerId());
            orderData.setDiscountId(orders.getDiscountId());
            orderData.setCartSession(orders.getCartSession());
            orderData.setPickupAddressId(orders.getPickupAddressId());
            orderData.setStatus(orders.getStatus());
            orderData.setIsDelivered(orders.getIsDelivered());
            orderData.setCancelStatus(orders.getCancelStatus());
            orderData = orderRepository.save(orderData);
            orders.setOrderId(orderData.getOrderId());
            
            OrderProducts orderproducts = orders.getOrderProducts().get(0);
            
            orderProductData.setProductId(orderproducts.getProductId());
            orderProductData.setRowId(orderproducts.getRowId());        
            orderProductData.setQuantity(orderproducts.getQuantity());
            orderProductData.setAmount(orderproducts.getAmount());
            orderProductData.setStatus(orderproducts.getStatus());
            
            orderProductData = orderProductsRepository.save(orderProductData);
            orderproducts.setOrderProductId(orderProductData.getOrderProductId());
            List<OrderProducts> orderProductsList = new ArrayList<>();
            orderProductsList.add(orderproducts);
            
            orders.setOrderProducts(orderProductsList);
            
            return orders;
        } catch(ResponseStatusException ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_SERVER_ERROR");
        }
        
    } else {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found!");
    }
}

public Orders deleteOrders(int id) throws Exception{
	
	ArrayList<Orders> orderList = new ArrayList<Orders>();
	List<OrderProducts> orderProductsList = new ArrayList<OrderProducts>();
	List<OrderProductsData> ordersProductsDataList = new ArrayList<OrderProductsData>();


	Optional<OrdersData> orderDataOp = orderRepository.findByOrderIdAndStatus(id, 1);
	Optional<OrderProductsData> orderProductDataOp = orderProductsRepository.findByOrderProductIdAndStatus(id, 1) ;
	if(orderDataOp.isPresent()) {
		
		try {
			OrdersData orderData = orderDataOp.get();
			orderData.setStatus(0);
			orderData = orderRepository.save(orderData);
			
			OrderProductsData orderProductData = orderProductDataOp.get();
			orderProductData.setStatus(0);
			orderProductData = orderProductsRepository.save(orderProductData);
			
			Orders orders = new Orders();
			
			orders.setOrderProducts(orderProductsList);
			orderList.add(orders);
			
			
			return orders;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
	
}
	
}