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

import com.nxg.nxgecomm.api.model.User;
import com.nxg.nxgecomm.api.model.UserRes;
import com.nxg.nxgecomm.service.UserService;

@RestController
@RequestMapping(path = "/nxgecomm/api/v1")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> addUser(@RequestBody User user) throws Exception {
		try {
			
	        UserRes userRes = userService.createUser(user);
			return new ResponseEntity<>(userRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@PutMapping(value = "/user/{user_id}", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> updateUser(@PathVariable("user_id") int userId, @RequestBody User user) throws Exception {
		try {
			
			UserRes userRes = userService.updateUser(userId,user);
			return new ResponseEntity<>(userRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping(value = "/user")
	ResponseEntity<Object> getUser() throws Exception {
		try {
			
			List<UserRes> userResList = userService.getAlluser();
			return new ResponseEntity<>(userResList,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping(value = "/user/{user_id}")
	ResponseEntity<Object> getUser(@PathVariable("user_id") int user_id) throws Exception {
		try {
			
			UserRes userRes = userService.getUserByUserId(user_id);
			return new ResponseEntity<>(userRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}

	

}