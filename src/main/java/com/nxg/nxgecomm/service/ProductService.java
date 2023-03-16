package com.nxg.nxgecomm.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.ProductRequest;
import com.nxg.nxgecomm.api.model.ProductRequestProductImage;
import com.nxg.nxgecomm.datamodel.ProductData;
import com.nxg.nxgecomm.datamodel.ProductImageData;
import com.nxg.nxgecomm.repository.ProductImageRepository;
import com.nxg.nxgecomm.repository.ProductRepository;
import com.nxg.nxgecomm.repository.ProductVariantImageRepository;
import com.nxg.nxgecomm.repository.ProductVariantRepository;
import com.nxg.nxgecomm.repository.VariantOptionRepository;
import com.nxg.nxgecomm.repository.VariantOptionValueRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

	ProductData productData;
	
	Optional<ProductData> productsDataOp;
	
	@Autowired
	ProductRepository productsRepository;
	
	@Autowired
	ProductImageRepository productImageRepository;
	
	@Autowired
	ProductVariantRepository productVariantRepository;
	
	@Autowired
	ProductVariantImageRepository productVariantImageRepository;
	
	@Autowired
	VariantOptionRepository variantOptionRepository;
	
	@Autowired
	VariantOptionValueRepository variantOptionValueRepository;
	
	@Transactional
	public ProductRequest createProduct(ProductRequest product) throws Exception {
		
		ProductData productData = new ProductData();
		
		try {
			if(product.getIsVariants().equals(1)) {
				
				productData.setCategoryId(product.getCategoryId());
				productData.setTitle(product.getTitle());
				productData.setPrice(product.getPrice().floatValue());
				productData.setcPrice(product.getcPrice().floatValue());
				productData.setTaxPercent(product.getTaxPercent().floatValue());
				productData.setQty(product.getQty());
				productData.setSizeType(product.getSizeType());
				productData.setDescription(product.getDescription());
				productData.setSkuCode(product.getSkuCode());
				productData.setBarcode(product.getBarcode());
				productData.setIsVariants(product.getIsVariants());
				productData.setProductUrl(product.getProductUrl());
				productData.setSearchTerms(product.getSeo().getSearchTerms());
				
				productData.setSeoTitle(product.getSeo().getTitle());
				productData.setMeta(product.getMeta());
				productData.setKeyword(product.getKeyword());
				productData.setStatus(1);
				
				
				
				List<ProductRequestProductImage> productRequestProductImageList = product.getProductImage();
				List<ProductImageData> productImageDataList = new ArrayList<ProductImageData>();
				for(ProductRequestProductImage productRequestProductImage : productRequestProductImageList) {
					ProductImageData productImageData = new ProductImageData();
					
					productImageData.setImageName(productRequestProductImage.getImageName());
					productImageData.setUrl(productRequestProductImage.getUrl());
					productImageData.setIsPrimary(productRequestProductImage.getIsPrimary());
					productImageData.setStatus(1);
					productImageDataList.add(productImageData);
				}
				
				productData.setProductImageDataList(productImageDataList);
				productData = productsRepository.save(productData);
				
			}
			
			
			return product;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}

	
}
