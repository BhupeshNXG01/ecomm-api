package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxg.nxgecomm.datamodel.ProductData;

public interface ProductRepository extends JpaRepository<ProductData,Integer> {

	 Optional<ProductData> findByProductIdAndStatus(int productId,int status);
	
	 List<ProductData> findByStatus(int status);
}
