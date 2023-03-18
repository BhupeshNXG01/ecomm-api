package com.nxg.nxgecomm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.nxg.nxgecomm.api.model.Categories;
import com.nxg.nxgecomm.datamodel.CategoriesData;
import com.nxg.nxgecomm.repository.CategoriesRepository;

@Service
public class CategoriesService {

	CategoriesData categoriesData;
	
	Optional<CategoriesData> categoriesDataOp;
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	public Categories createCategory(Categories categories) throws Exception{
		
		CategoriesData categoriesData = new CategoriesData();
		
		try {
			categoriesData.setName(categories.getName());
			categoriesData.setPosition(categories.getPosition());
			categoriesData.setImage(categories.getImage());
			categoriesData.setCategoryHandle(categories.getCategoryHandel());
			categoriesData.setStatus(1);
			categoriesData = categoriesRepository.save(categoriesData);
			categories.setId(categoriesData.getCategoryId());
			return categories;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}
	
public Categories updateCategory(int id, Categories categories) throws Exception{
		
		
		categoriesDataOp = categoriesRepository.findByCategoryIdAndStatus(id, 1);
		
		if(categoriesDataOp.isPresent()) {
			
			try {
				CategoriesData categoriesData = categoriesDataOp.get();
				
				categoriesData.setName(categories.getName());
				categoriesData.setPosition(categories.getPosition());
				categoriesData.setImage(categories.getImage());
				categoriesData.setCategoryHandle(categories.getCategoryHandel());
				categoriesData.setStatus(1);
				categoriesData = categoriesRepository.save(categoriesData);
				categories.setId(categoriesData.getCategoryId());
				return categories;
			}catch(ResponseStatusException ex) {
				throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
			}
			
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
		}
		
		
	}

public Categories getCategoryById(int id) throws Exception{
	
	
	categoriesDataOp = categoriesRepository.findByCategoryIdAndStatus(id, 1);
	
	if(categoriesDataOp.isPresent()) {
		
		try {
			CategoriesData categoriesData = categoriesDataOp.get();
			Categories categories = new Categories();
			
			categories.setName(categoriesData.getName());
			categories.setPosition(categoriesData.getPosition());
			categories.setImage(categoriesData.getImage());
			categories.setCategoryHandel(categoriesData.getCategoryHandle());
			categories.setId(categoriesData.getCategoryId());
			
			return categories;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
}

public List<Categories> getAllCategories() throws Exception {
	
	List<Categories> categoriesList = new ArrayList<Categories>();
	List<CategoriesData> categoriesDataList = categoriesRepository.findByStatus(1);
	
	if(categoriesDataList.size() > 0) {
		
		try {
			
			for(CategoriesData categoriesData: categoriesDataList) {
				
				Categories categories = new Categories();
				
				categories.setName(categoriesData.getName());
				categories.setPosition(categoriesData.getPosition());
				categories.setImage(categoriesData.getImage());
				categories.setCategoryHandel(categoriesData.getCategoryHandle());
				categories.setId(categoriesData.getCategoryId());
				categoriesList.add(categories);
			}
			
			return categoriesList;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
}

public Categories deleteCategory(int id) throws Exception{
	
	
	categoriesDataOp = categoriesRepository.findByCategoryIdAndStatus(id, 1);
	
	if(categoriesDataOp.isPresent()) {
		
		try {
			CategoriesData categoriesData = categoriesDataOp.get();
			
			categoriesData.setStatus(0);
			categoriesData = categoriesRepository.save(categoriesData);
			Categories categories = new Categories();
			
			categories.setId(categoriesData.getCategoryId());
			
			return categories;
		}catch(ResponseStatusException ex) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"INTERNAL_SERVER_ERROR");
		}
		
	}else {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data not found!");
	}
	
}
	
}
