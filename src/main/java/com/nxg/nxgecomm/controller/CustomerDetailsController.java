package com.nxg.nxgecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.CustomerDetails;
import com.nxg.nxgecomm.api.model.CustomerDetailsRes;
import com.nxg.nxgecomm.service.CustomerDetailsService;

@RestController
@RequestMapping(path = "/nxgecomm/api/v1")
public class CustomerDetailsController {

	@Autowired
	CustomerDetailsService customerDetailsService;
	
	
	@PostMapping(value = "/customer", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> addCustomerDetails(@RequestBody CustomerDetails customerDetails) throws Exception {
		try {
			
			CustomerDetailsRes customerDetailsRes = customerDetailsService.createCustomerDetails(customerDetails);
			return new ResponseEntity<>(customerDetailsRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping("/customer")
	ResponseEntity<Object> getCustomerDetails() {
		try {
			
			List<CustomerDetailsRes> customerDetailsList = customerDetailsService.getAllCustomerDetails();
			return new ResponseEntity<>(customerDetailsList,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping("/customer/{id}")
	ResponseEntity<Object> getCustomerDetailsById(@PathVariable("id") int id) {
		try {
			
			CustomerDetailsRes customerDetails = customerDetailsService.getCustomerDetailsById(id);
			return new ResponseEntity<>(customerDetails,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@PutMapping(value = "/customer/{id}", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> editCustomerDetails(@PathVariable("id")int id, @RequestBody CustomerDetails customerDetails) throws Exception {
		try {
			
			CustomerDetailsRes customerDetailsRes = customerDetailsService.updateCustomerDetails(id,customerDetails);
			return new ResponseEntity<>(customerDetailsRes, HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
}
