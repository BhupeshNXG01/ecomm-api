package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.nxg.nxgecomm.datamodel.CustomerDetailsData;


public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsData,Integer> {

	Optional<CustomerDetailsData> findByIdAndStatus(int id,int status);
	
	List<CustomerDetailsData> findByStatus(int status);
}
