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

	
	UserData userData;
	
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
	      userRes.setStatus(userRes.getStatus());
	    return userRes;
	
	}
	
public UserRes createUser(User user) throws Exception{
		
		userData = new UserData();
		
		try {
			userData.setEmail(user.getEmail());
			userData.setUsername(user.getUsername());
			userData.setMobile(user.getMobile());
			userData.setSellerId(user.getSellerId());
			userData.setPassword(user.getPassword());
			userData.setSellerPassword(user.getSellerPassword());
			userData.setStatus("active");
			
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
		
		List<UserData> UserList = UserRepository.findByStatus("active");
	
		if(UserList.size() > 0) {
    		
    		for(UserData UserData : UserList) {
    			UserRes user = new UserRes();
    			
    			user.setUsername(UserData.getUsername());
    			user.setEmail(UserData.getEmail());
    			user.setMobile(UserData.getMobile());
    			user.setSellerPassword(UserData.getSellerPassword());
    			user.setSellerId(UserData.getSeller_id());
    			user.setUserId(UserData.getUserId());
    			user.setStatus(UserData.getStatus());
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
		 UserDataOp = UserRepository.findByUserIdAndStatus(userid,"active");
	
		 if(UserDataOp.isPresent()) {
			 UserData userData = UserDataOp.get();
			 UserRes user = new UserRes();
			 
			 user.setUsername(userData.getUsername());
			 user.setEmail(userData.getEmail());
			 user.setMobile(userData.getMobile());
			 user.setSellerPassword(userData.getSellerPassword());
			 user.setSellerId(userData.getSeller_id());
			 user.setUserId(userData.getUserId());
			 user.setStatus(userData.getStatus());
			 
			 return user;
		 }else {
    		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
    	}
		
	}catch(ResponseStatusException ex) {
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR!");
	}
	
}

public UserRes updateUser(int UserId,User user) throws Exception{
	
  	 userData = new UserData();
  
  	try {
  		UserDataOp = UserRepository.findByUserIdAndStatus(UserId, "active");
  		if(UserDataOp.isPresent()) {
  			UserData userData = UserDataOp.get();
  			userData.setUsername(user.getUsername());
  			userData.setEmail(user.getEmail());
  			userData.setMobile(user.getMobile());
  			userData.setPassword(user.getPassword());
  			userData.setSellerPassword(user.getSellerPassword());
  			userData.setSellerId(user.getSellerId());
  			userData.setStatus(user.getStatus());
  			
  			userData = UserRepository.save(userData);
  			UserRes userRes = this.setResData(userData);
  			return userRes;
  		}else {
  			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
  		}
  		
  	}catch(ResponseStatusException ex) {
  		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
  	}
  	
  }

}

