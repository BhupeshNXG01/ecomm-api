package com.ecom.blogApi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.blogApi.datamodel.BlogCategoryData;
import com.ecom.blogApi.datamodel.BlogData;

public interface BlogCategoryRepository extends JpaRepository<BlogCategoryData ,Integer> {
	
	List<BlogCategoryData> findByStatus(String status);
	List<BlogCategoryData> findByStatusIn(List<String> status);
	
//	Optional<BlogCategoryData> findByIdAndStatus(int blogCategoryId, String status);

}
