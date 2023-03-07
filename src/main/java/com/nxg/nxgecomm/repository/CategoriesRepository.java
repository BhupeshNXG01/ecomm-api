package com.nxg.nxgecomm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxg.nxgecomm.datamodel.CategoriesData;

public interface CategoriesRepository extends JpaRepository<CategoriesData,Integer> {

	Optional<CategoriesData> findByIdAndStatus(int id, int status);
	List<CategoriesData> findByStatus(int status);
	
}
