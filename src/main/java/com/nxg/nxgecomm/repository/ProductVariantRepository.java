package com.nxg.nxgecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nxg.nxgecomm.datamodel.ProductVariantData;

public interface ProductVariantRepository extends JpaRepository<ProductVariantData,Integer> {

}
