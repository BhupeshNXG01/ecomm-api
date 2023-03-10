package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxg.nxgecomm.datamodel.ProductsData;

public interface ProductsRepository extends JpaRepository<ProductsData,Integer> {

	 Optional<ProductsData> findByProductIdAndStatus(int productId,int status);
	
	 List<ProductsData> findByStatus(int status);
}
