package com.nxg.nxgecomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.UserLogin;
import com.nxg.nxgecomm.api.model.UserRes;

import com.nxg.nxgecomm.service.UserLoginService;

@RestController
@RequestMapping(path = "/nxgecomm/api/v1")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;

		
		 @PostMapping("/login")
		    public ResponseEntity<Object> userLoginData(@RequestBody UserLogin userLogin) throws Exception {
			 try {
				 Boolean response = userLoginService.isUserLogin(userLogin);
				 
				 return ResponseHandler.loginResponse("Successfully Logged In!", HttpStatus.OK, response);
				 
			 }catch(ResponseStatusException ex) {
				 return ResponseHandler.loginResponse(ex.getMessage(), ex.getStatusCode(), false);
			 }
		       
		    }	
		
		
		
	}