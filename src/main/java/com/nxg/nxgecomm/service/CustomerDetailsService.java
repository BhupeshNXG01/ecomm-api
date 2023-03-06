package com.nxg.nxgecomm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.CustomerDetails;
import com.nxg.nxgecomm.datamodel.CustomerDetailsData;
import com.nxg.nxgecomm.repository.CustomerDetailsRepository;

@Service
public class CustomerDetailsService {

	
	CustomerDetailsData customerDetailsData;
	
	Optional<CustomerDetailsData> customerDetailsDataOp;
	
	@Autowired
	CustomerDetailsRepository customerDetailsRepository;
	
    public CustomerDetails createCustomerDetails(CustomerDetails customerDetails) throws Exception{
    	
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
    		CustomerDetails customerDetailsRes = new CustomerDetails();
    		
    		customerDetailsRes.setId(customerDetailsData.getId());
    	    return customerDetailsRes;
    		
    	}catch(ResponseStatusException ex) {
    		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
    	}
    	
    }
	
    public List<CustomerDetails> getAllCustomerDetails() throws ResponseStatusException {
    	List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
    	
    	try {
    		
    		List<CustomerDetailsData> CustomerDetailsDataList = customerDetailsRepository.findByStatus(1);
    	
    		if(CustomerDetailsDataList.size() > 0) {
        		
        		for(CustomerDetailsData customerDetailsData : CustomerDetailsDataList) {
        			CustomerDetails customerDetails = new CustomerDetails();
        			
        			customerDetails.setName(customerDetailsData.getName());
        			customerDetails.setEmail(customerDetailsData.getEmail());
        			customerDetails.setMobile(customerDetailsData.getMobile());
        			customerDetails.setPassword(customerDetailsData.getPassword());
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
    
    
    public CustomerDetails getCustomerDetailsById(int id) {
    	
    	try {
    		 customerDetailsDataOp = customerDetailsRepository.findByIdAndStatus(id,1);
    	
    		 if(customerDetailsDataOp.isPresent()) {
    			 CustomerDetailsData customerDetailsData = customerDetailsDataOp.get();
    			 CustomerDetails customerDetails = new CustomerDetails();
    			 
    			 customerDetails.setName(customerDetailsData.getName());
    			 customerDetails.setEmail(customerDetailsData.getEmail());
    			 customerDetails.setMobile(customerDetailsData.getMobile());
    			 customerDetails.setPassword(customerDetailsData.getPassword());
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
    
   
   public CustomerDetails updateCustomerDetails(int id,CustomerDetails customerDetails) throws Exception{
    	
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
   			CustomerDetails customerDetailsRes = new CustomerDetails();
   			
   			customerDetailsRes.setId(customerDetailsData.getId());
   			return customerDetailsRes;
   		}else {
   			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
   		}
   		
   	}catch(ResponseStatusException ex) {
   		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
   	}
   	
   }
    
}
