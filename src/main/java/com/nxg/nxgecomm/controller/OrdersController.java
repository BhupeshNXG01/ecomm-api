package com.nxg.nxgecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.Orders;
import com.nxg.nxgecomm.datamodel.OrdersData;
import com.nxg.nxgecomm.service.OrdersService;

@RestController
@RequestMapping(path = "/nxgecomm/api/v1")
public class OrdersController {
	
	@Autowired
	OrdersService orderService;
	
	@PostMapping(value = "/orders", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> addOrders(@RequestBody Orders orders) throws Exception {
		try {
			
			Orders OrderRes = orderService.createOrders(orders);
			System.out.println(orders);
			return new ResponseEntity<>(OrderRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.orderResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	@GetMapping(value = "/orders")
	ResponseEntity<Object> getAllOrders() throws Exception {
		try {
			
			List<Orders> ordersResList = orderService.getAllOrders();
			System.out.println( "ordersResList "+ ordersResList);
			return new ResponseEntity<>(ordersResList,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.orderResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping(value = "/orders/{order_id}")
	ResponseEntity<Object> getOrdersById(@PathVariable("order_id") int order_id) throws Exception {
		try {
			
			List<Orders> orderRes = orderService.getOrdersById(order_id);
			return new ResponseEntity<>(orderRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.orderResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	

	
	@PutMapping(value = "/orders/{orderid}", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> updateOrders(@PathVariable("orderid") int order_id, @RequestBody Orders orders) throws Exception {
		try {
			
			Orders OrdersRes = orderService.updateOrders(order_id,orders);
			return new ResponseEntity<>(OrdersRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.orderResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@DeleteMapping(value = "/orderProducts/{orderid}")
	ResponseEntity<Object> deleteOrders(@PathVariable("orderid") int order_id) throws Exception {
		try {
			
			Orders OrdersRes = orderService.deleteOrders(order_id);
			return new ResponseEntity<>(OrdersRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.orderResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}

}