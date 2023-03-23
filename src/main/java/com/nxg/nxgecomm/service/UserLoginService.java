package com.nxg.nxgecomm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.UserLogin;

import com.nxg.nxgecomm.repository.UserRepository;

@Service
public class UserLoginService {
	
	@Autowired
	UserRepository userRepository;

    public Boolean isUserLogin(UserLogin userLogin) throws Exception {
    	
    	try {
    		if(userRepository.existsByUsernameAndPassword(userLogin.getUsername(), userLogin.getPassword())){
    	        
            	return true;
            	
            }else {
            	return false;
            }
    	}catch(ResponseStatusException ex) {
    		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
    	}
        
         
    }


}
