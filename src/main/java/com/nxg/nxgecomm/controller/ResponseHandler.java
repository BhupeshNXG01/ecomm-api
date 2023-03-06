package com.nxg.nxgecomm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.nxg.nxgecomm.api.model.Categories;
import com.nxg.nxgecomm.api.model.CustomerDetails;

public class ResponseHandler {

	public static ResponseEntity<Object> generateResponse(String message, HttpStatusCode status, Object responseObj){
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		if(responseObj != null && (responseObj instanceof CustomerDetails)) {
			map.put("message", message);
			map.put("status", status.value());
			map.put("id", ((CustomerDetails) responseObj).getId());
			return new ResponseEntity<Object>(map,status);
		}
		if(responseObj != null && (responseObj instanceof Categories)) {
			map.put("message", message);
			map.put("status", status.value());
			map.put("id", ((Categories) responseObj).getId());
			return new ResponseEntity<Object>(map,status);
		}
		else {
			map.put("message", message);
			map.put("status", status.value());
			map.put("id", null);
			return new ResponseEntity<Object>(map,status);
		}
	
	}
	
}
