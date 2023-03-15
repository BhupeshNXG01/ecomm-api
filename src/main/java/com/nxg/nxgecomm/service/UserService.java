package com.nxg.nxgecomm.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.nxg.nxgecomm.api.model.User;
import com.nxg.nxgecomm.datamodel.UserData;
import com.nxg.nxgecomm.repository.UserRepository;

public class UserService {
	
	UserData UserData;
	
Optional<UserData> UserDataOp;
	
	@Autowired
	UserRepository userRepository;
	
public User createUser(User user) throws Exception{
		
		UserData userData = new userData();
		
		try {
			userData.setEmail(user.getEmail());
			userData.setUsername(user.getUsername());
			userData.setMobile(user.getMobile());
			userData.setPassword(user.getPassword());
			userData.setSeller_id(user.getSeller_id());
			userData.setSeller_password(user.getSeller_password());
			userData.setStatus(1);
			userData = userRepository.save(userData);
			user.setId(userData.getId());
			return user;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	} 

public User updateUser(int id, User user) throws Exception{
	
	
	UserDataOp = UserRepository.findByIdAndStatus(id, 1);
	
	if(UserDataOp.isPresent()) {
		
		try {
		    UserData userData = UserDataOp.get();
			
			userData.setId(user.getId());
			userData.setSeller_id(user.getSellerId());
			userData.setEmail(user.getEmail());
			userData.setUsername(user.getUserName());
			userData.setMobile(user.getMobile());
			userData.setPassword(user.getPassword());
			userData.setSeller_password(user.getSellerPassword());
			userData.setStatus(1);
			userData = UserRepository.save(userData);
			user.setId(userData.getId());
			return user;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
	
}

public User getUserById(int id) throws Exception{
	
	
	userDataOp = userRepository.findByIdAndStatus(id, 1);
	
	if(userDataOp.isPresent()) {
		
		try {
			UserData userData = userDataOp.get();
			User user = new User();
			
			user.setEmail(userData.getEmail());
			user.setUsername(userData.getUsername());
			user.setMobile(userData.getMobile());
			user.setPassword(userData.getPassword());
			user.setSeller_id(userData.getSeller_id());
			user.setSeller_password(userData.getSeller_password());
			user.setId(userData.getId());
			
			return user;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}	
}

public List<User> getAllUser() throws Exception {
	
	List<User> userList = new ArrayList<User>();
	List<UserData> userDataList = UserRepository.findByStatus(1);
	
	if(userDataList.size() > 0) {
		
		try {
			for(UserData userData: userDataList) {
				User user = new User();
				
				user.setId(userData.getId());
				user.setSellerId(userData.getSeller_id());
				user.setEmail(userData.getEmail());
				user.setUsername(userData.getUsername());
				user.setMobile(userData.getMobile());
				user.setPassword(userData.getPassword());
				user.setSellerPassword(userData.getSeller_password());
				user.setStatus(userData.getStatus());
				userList.add(user);
			}
			return userList;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}


}
}
