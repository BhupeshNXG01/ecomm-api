package com.nxg.nxgecomm.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.User;
import com.nxg.nxgecomm.api.model.UserRes;
import com.nxg.nxgecomm.datamodel.UserData;
import com.nxg.nxgecomm.repository.UserRepository;

@Service
public class UserService {

	
	UserData UserData;
	
	Optional<UserData> UserDataOp;
	
	@Autowired
	UserRepository UserRepository;
	
	private UserRes setResData(UserData userData) {
	      UserRes userRes = new UserRes();
		
	      userRes.setUserId(userRes.getUserId());
	      userRes.setUsername(userRes.getUsername());
	    
	      userRes.setEmail(userRes.getEmail());
	      userRes.setMobile(userRes.getMobile());
	      userRes.setSellerId(userRes.getSellerId());
	      userRes.setSellerPassword(userRes.getSellerPassword());
	    return userRes;
	
	}
	
public UserRes createUser(User user) throws Exception{
		
		UserData userData = new UserData();
		
		try {
			userData.setEmail(user.getEmail());
			userData.setUsername(user.getUsername());
			userData.setMobile(user.getMobile());
			userData.setSellerId(user.getSellerId());
			userData.setPassword(user.getPassword());
			userData.setSellerPassword(user.getSellerPassword());
			userData.setStatus(1);
			
			userData = UserRepository.save(userData);
    		System.out.println("This is Id === " + userData.getUserId());
    		
    		UserRes userRes = this.setResData(userData);
    		System.out.println("This is Username === " + userRes.getUsername());
    		return userRes;
    	}catch(ResponseStatusException ex) {
    		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
    	}
    	
    }
public List<UserRes> getAlluser() throws ResponseStatusException {
	List<UserRes> userList = new ArrayList<UserRes>();
	
	try {
		
		List<UserData> UserList = UserRepository.findByStatus(1);
	
		if(UserList.size() > 0) {
    		
    		for(UserData UserData : UserList) {
    			UserRes user = new UserRes();
    			
    			user.setUsername(UserData.getUsername());
    			user.setEmail(UserData.getEmail());
    			user.setMobile(UserData.getMobile());
    			user.setSellerPassword(UserData.getSellerPassword());
    			user.setSellerId(UserData.getSeller_id());
    			user.setUserId(UserData.getUserId());
    			userList.add(user);
    			
    		}
    		
    		return userList;
    		
    	}else {
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
    	}
		
	}catch(ResponseStatusException ex) {
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR!");
	}
	
}

public UserRes getUserByUserId(int userid) {
	
	try {
		 UserDataOp = UserRepository.findByUserIdAndStatus(userid,1);
	
		 if(UserDataOp.isPresent()) {
			 UserData userData = UserDataOp.get();
			 UserRes user = new UserRes();
			 
			 user.setUsername(userData.getUsername());
			 user.setEmail(userData.getEmail());
			 user.setMobile(userData.getMobile());
			 user.setSellerPassword(userData.getSellerPassword());
			 user.setSellerId(userData.getSeller_id());
			 user.setUserId(userData.getUserId());
			 
			 return user;
		 }else {
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
    	}
		
	}catch(ResponseStatusException ex) {
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR!");
	}
	
}

public UserRes updateUser(int UserId,User user) throws Exception{
	
  	 UserData = new UserData();
  
  	try {
  		UserDataOp = UserRepository.findByUserIdAndStatus(UserId, 1);
  		if(UserDataOp.isPresent()) {
  			UserData UserData = UserDataOp.get();
  			UserData.setUsername(user.getUsername());
  			UserData.setEmail(user.getEmail());
  			UserData.setMobile(user.getMobile());
  			UserData.setPassword(user.getPassword());
  			UserData.setSellerPassword(user.getSellerPassword());
  			UserData.setSellerId(user.getSellerId());
  			
  			UserData = UserRepository.save(UserData);
  			UserRes userRes = this.setResData(UserData);
  			return userRes;
  		}else {
  			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
  		}
  		
  	}catch(ResponseStatusException ex) {
  		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
  	}
  	
  }

}

