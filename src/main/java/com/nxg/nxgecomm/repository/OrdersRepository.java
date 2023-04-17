package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nxg.nxgecomm.datamodel.OrdersData;

public interface OrdersRepository extends JpaRepository<OrdersData,Integer>{
	
	Optional<OrdersData> findByOrderIdAndStatus(int order_id, int status);
	Optional<OrdersData> findByOrderId(int order_id);
	List<OrdersData> findByStatus(int status);

}
