package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nxg.nxgecomm.datamodel.OrderProductsData;

public interface OrderProductsRepository extends JpaRepository<OrderProductsData,Integer>{
	
	Optional<OrderProductsData> findByOrderProductIdAndStatus(int orderProductId , int status);
	Optional<OrderProductsData> findByOrderProductId(int orderProductId );
	List<OrderProductsData> findByStatus(int status);

}
