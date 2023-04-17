package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nxg.nxgecomm.datamodel.UserData;

public interface UserRepository extends JpaRepository<UserData,Integer> {

	Optional<UserData> findByUserIdAndStatus(int user_id, int status);
	List<UserData> findByStatus(int status);
	
	@Query("Select count(e)>0 from UserData e where e.username=?1 AND e.password=?2")
	Boolean existsByUsernameAndPassword(String username, String password);
	
}