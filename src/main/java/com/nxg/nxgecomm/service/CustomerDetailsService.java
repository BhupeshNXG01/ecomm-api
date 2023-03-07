package com.nxg.nxgecomm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.CustomerDetails;
import com.nxg.nxgecomm.api.model.CustomerDetailsRes;
import com.nxg.nxgecomm.datamodel.CustomerDetailsData;
import com.nxg.nxgecomm.repository.CustomerDetailsRepository;

@Service
public class CustomerDetailsService {

	
	CustomerDetailsData customerDetailsData;
	
	Optional<CustomerDetailsData> customerDetailsDataOp;
	
	@Autowired
	CustomerDetailsRepository customerDetailsRepository;
	
	private CustomerDetailsRes setResData(CustomerDetailsData customerDetailsData) {
		CustomerDetailsRes customerDetailsRes = new CustomerDetailsRes();
		
		customerDetailsRes.setId(customerDetailsData.getId());
		customerDetailsRes.setName(customerDetailsData.getName());
		customerDetailsRes.setEmail(customerDetailsData.getEmail());
		customerDetailsRes.setMobile(customerDetailsData.getMobile());
		customerDetailsRes.setCurrencyId(customerDetailsData.getCurrencyId());
		customerDetailsRes.setIsGuest(customerDetailsData.getIsGuest());
	    return customerDetailsRes;
	
	}
	
    public CustomerDetailsRes createCustomerDetails(CustomerDetails customerDetails) throws Exception{
    	
    	 customerDetailsData = new CustomerDetailsData();
    
    	try {
    		
    		customerDetailsData.setName(customerDetails.getName());
    		customerDetailsData.setEmail(customerDetails.getEmail());
    		customerDetailsData.setMobile(customerDetails.getMobile());
    		customerDetailsData.setPassword(customerDetails.getPassword());
    		customerDetailsData.setIsGuest(customerDetails.getIsGuest());
    		customerDetailsData.setCurrencyId(customerDetails.getCurrencyId());
    		customerDetailsData.setStatus(1);
    		
    		customerDetailsData = customerDetailsRepository.save(customerDetailsData);
    		System.out.println("This is Id === " + customerDetailsData.getId());
//    		CustomerDetailsRes customerDetailsRes = new CustomerDetailsRes();
//    		
//    		customerDetailsRes.setId(customerDetailsData.getId());
//    		customerDetailsRes.setName(customerDetailsData.getName());
//    		customerDetailsRes.setEmail(customerDetailsData.getEmail());
//    		customerDetailsRes.setMobile(customerDetailsData.getMobile());
//    		customerDetailsRes.setCurrencyId(customerDetailsData.getCurrencyId());
//    		customerDetailsRes.setIsGuest(customerDetailsData.getIsGuest());
//    	    return customerDetailsRes;
    		
    		CustomerDetailsRes customerDetailsRes = this.setResData(customerDetailsData);
    		return customerDetailsRes;
    	}catch(ResponseStatusException ex) {
    		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
    	}
    	
    }
	
    public List<CustomerDetailsRes> getAllCustomerDetails() throws ResponseStatusException {
    	List<CustomerDetailsRes> customerDetailsList = new ArrayList<CustomerDetailsRes>();
    	
    	try {
    		
    		List<CustomerDetailsData> CustomerDetailsDataList = customerDetailsRepository.findByStatus(1);
    	
    		if(CustomerDetailsDataList.size() > 0) {
        		
        		for(CustomerDetailsData customerDetailsData : CustomerDetailsDataList) {
        			CustomerDetailsRes customerDetails = new CustomerDetailsRes();
        			
        			customerDetails.setName(customerDetailsData.getName());
        			customerDetails.setEmail(customerDetailsData.getEmail());
        			customerDetails.setMobile(customerDetailsData.getMobile());
        			customerDetails.setIsGuest(customerDetailsData.getIsGuest());
        			customerDetails.setCurrencyId(customerDetailsData.getCurrencyId());
        			customerDetails.setId(customerDetailsData.getId());
        			customerDetailsList.add(customerDetails);
        			
        		}
        		
        		return customerDetailsList;
        		
        	}else {
        		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
        	}
    		
    	}catch(ResponseStatusException ex) {
    		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR!");
    	}
    	
    }
    
    
    public CustomerDetailsRes getCustomerDetailsById(int id) {
    	
    	try {
    		 customerDetailsDataOp = customerDetailsRepository.findByIdAndStatus(id,1);
    	
    		 if(customerDetailsDataOp.isPresent()) {
    			 CustomerDetailsData customerDetailsData = customerDetailsDataOp.get();
    			 CustomerDetailsRes customerDetails = new CustomerDetailsRes();
    			 
    			 customerDetails.setName(customerDetailsData.getName());
    			 customerDetails.setEmail(customerDetailsData.getEmail());
    			 customerDetails.setMobile(customerDetailsData.getMobile());
    			 customerDetails.setIsGuest(customerDetailsData.getIsGuest());
    			 customerDetails.setCurrencyId(customerDetailsData.getCurrencyId());
    			 customerDetails.setId(customerDetailsData.getId());
    			 
    			 return customerDetails;
    		 }else {
        		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
        	}
    		
    	}catch(ResponseStatusException ex) {
    		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR!");
    	}
    	
    }
    
   
   public CustomerDetailsRes updateCustomerDetails(int id,CustomerDetails customerDetails) throws Exception{
    	
   	 customerDetailsData = new CustomerDetailsData();
   
   	try {
   		customerDetailsDataOp = customerDetailsRepository.findByIdAndStatus(id, 1);
   		if(customerDetailsDataOp.isPresent()) {
   			CustomerDetailsData customerDetailsData = customerDetailsDataOp.get();
   			customerDetailsData.setName(customerDetails.getName());
   			customerDetailsData.setEmail(customerDetails.getEmail());
   			customerDetailsData.setMobile(customerDetails.getMobile());
   			customerDetailsData.setPassword(customerDetails.getPassword());
   			customerDetailsData.setIsGuest(customerDetails.getIsGuest());
   			customerDetailsData.setCurrencyId(customerDetails.getCurrencyId());
   			
   			customerDetailsData = customerDetailsRepository.save(customerDetailsData);
   			CustomerDetailsRes customerDetailsRes = this.setResData(customerDetailsData);
   			return customerDetailsRes;
   		}else {
   			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
   		}
   		
   	}catch(ResponseStatusException ex) {
   		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
   	}
   	
   }
    
}
