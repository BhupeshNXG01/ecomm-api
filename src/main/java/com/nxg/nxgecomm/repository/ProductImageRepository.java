package com.nxg.nxgecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxg.nxgecomm.datamodel.ProductImageData;

public interface ProductImageRepository extends JpaRepository<ProductImageData,Integer> {

}
