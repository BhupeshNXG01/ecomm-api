package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nxg.nxgecomm.datamodel.UserData;

public interface UserRepository extends JpaRepository<UserData,Integer> {

	Optional<UserData> findByIdAndStatus(int id, int status);
	List<UserData> findByStatus(int status);
	
}
