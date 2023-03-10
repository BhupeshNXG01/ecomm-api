package com.nxg.nxgecomm.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.Products;
import com.nxg.nxgecomm.datamodel.ProductsData;
import com.nxg.nxgecomm.repository.ProductsRepository;

@Service
public class ProductsService {

	ProductsData productsData;
	
	Optional<ProductsData> productsDataOp;
	
	@Autowired
	ProductsRepository productsRepository;
	
	public Products createProduct(Products products) throws Exception {
		
		ProductsData productsData = new ProductsData();
		
		try {
			
			productsData.setCategoryId(products.getCategoryId());
			productsData.setTitle(products.getTitle());
			productsData.setPrice(products.getPrice().floatValue());
			productsData.setcPrice(products.getcPrice().floatValue());
			productsData.setTaxPercent(products.getTaxPercent().floatValue());
			productsData.setQty(products.getQty());
			productsData.setSizeType(products.getSizeType());
			productsData.setDescription(products.getDescription());
			productsData.setSkuCode(products.getSkuCode());
			productsData.setBarcode(products.getBarcode());
			productsData.setIsVariants(products.getIsVariants());
			productsData.setProductUrl(products.getProductUrl());
			productsData.setSearchTerms(products.getSearchTerms());
			productsData.setSeoTitle(products.getSeoTitle());
			productsData.setMeta(products.getMeta());
			productsData.setKeyword(products.getKeyword());
			productsData.setStatus(1);
			productsData = productsRepository.save(productsData);
			
			products.setProductId(productsData.getProductId());
			return products;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}
	
	
public Products updateProduct(int productId,Products products) throws Exception {
				
		try {
			
		productsDataOp = productsRepository.findByProductIdAndStatus(productId, 1);
		
		if(productsDataOp.isPresent()) {
			ProductsData productsData = productsDataOp.get();
		
		try {
			
			productsData.setCategoryId(products.getCategoryId());
			productsData.setTitle(products.getTitle());
			productsData.setPrice(products.getPrice().floatValue());
			productsData.setcPrice(products.getcPrice().floatValue());
			productsData.setTaxPercent(products.getTaxPercent().floatValue());
			productsData.setQty(products.getQty());
			productsData.setSizeType(products.getSizeType());
			productsData.setDescription(products.getDescription());
			productsData.setSkuCode(products.getSkuCode());
			productsData.setBarcode(products.getBarcode());
			productsData.setIsVariants(products.getIsVariants());
			productsData.setProductUrl(products.getProductUrl());
			productsData.setSearchTerms(products.getSearchTerms());
			productsData.setSeoTitle(products.getSeoTitle());
			productsData.setMeta(products.getMeta());
			productsData.setKeyword(products.getKeyword());
			productsData.setStatus(1);
			productsData = productsRepository.save(productsData);
			
			products.setProductId(productsData.getProductId());
			return products;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
		}
		
}catch(ResponseStatusException ex) {
	throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
}
	
}


public Products getProductById(int productId) throws Exception {
	
	
	
	try {
		
	productsDataOp = productsRepository.findByProductIdAndStatus(productId, 1);
	
	if(productsDataOp.isPresent()) {
		ProductsData productsData = productsDataOp.get();
		Products products = new Products();
	try {
		products.setCategoryId(productsData.getCategoryId());
		products.setTitle(productsData.getTitle());
		BigDecimal price = new BigDecimal(productsData.getPrice());
		BigDecimal cPrice = new BigDecimal(productsData.getcPrice());
		BigDecimal taxPercent = new BigDecimal(productsData.getTaxPercent());
		products.setPrice(price);
		products.setcPrice(cPrice);
		products.setTaxPercent(taxPercent);
		products.setQty(productsData.getQty());
		products.setSizeType(productsData.getSizeType());
		products.setDescription(productsData.getDescription());
		products.setSkuCode(productsData.getSkuCode());
		products.setBarcode(productsData.getBarcode());
		products.setIsVariants(productsData.getIsVariants());
		products.setProductUrl(productsData.getProductUrl());
		products.setSearchTerms(productsData.getSearchTerms());
		products.setSeoTitle(productsData.getSeoTitle());
		products.setMeta(productsData.getMeta());
		products.setKeyword(productsData.getKeyword());
		
		products.setProductId(productsData.getProductId());
		return products;
	}catch(ResponseStatusException ex) {
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
	}
	
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
}catch(ResponseStatusException ex) {
throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
}

}

	
}
