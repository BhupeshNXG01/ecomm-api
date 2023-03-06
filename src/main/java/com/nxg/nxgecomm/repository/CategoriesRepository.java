package com.nxg.nxgecomm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxg.nxgecomm.datamodel.CategoriesData;

public interface CategoriesRepository extends JpaRepository<CategoriesData,Integer> {

	Optional<CategoriesData> findByIdAndDeleteStatus(int id, int deleteStatus);
	CategoriesData findByDeleteStatus(int deleteStatus);
	
}
