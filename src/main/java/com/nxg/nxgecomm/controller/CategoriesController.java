package com.nxg.nxgecomm.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.nxg.nxgecomm.api.model.Categories;
import com.nxg.nxgecomm.api.model.CustomerDetails;
import com.nxg.nxgecomm.api.model.CustomerDetailsRes;
import com.nxg.nxgecomm.service.CategoriesService;

@RestController
@RequestMapping(path = "/nxgecomm/api/v1")
public class CategoriesController {

	@Autowired
	CategoriesService categoriesService;
	
	@PostMapping(value = "/category", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> addCategory(@RequestBody Categories categories) throws Exception {
		try {
			// Check if the category name already exists in the database
			if(categoriesService.existsByCategoryName(categories.getName().trim())) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Category with the same name already exists");
			}
			
			Categories categoriesRes = categoriesService.createCategory(categories);
			return new ResponseEntity<>(categoriesRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
	}

	

	@PutMapping(value = "/category/{id}", consumes = "application/json", produces = "application/json")
	ResponseEntity<Object> updateCategory(@PathVariable("id") int id, @RequestBody Categories categories) throws Exception {
	    try {
	        Categories existingCategory = categoriesService.getCategoryById(id);

	        // Check if the updated category name already exists in the database
	        if (!existingCategory.getName().equals(categories.getName()) && categoriesService.checkCategoryExist(categories.getName())) {
	            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Category with the same name already exists");
	        }

	        Categories updatedCategory = categoriesService.updateCategory(id, categories);
	        return new ResponseEntity<>(updatedCategory, HttpStatus.OK);
	    } catch (ResponseStatusException ex) {
	        return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
	    }
	}

	@GetMapping(value = "/category")
	ResponseEntity<Object> getCategories() throws Exception {
		try {
			
			List<Categories> categoriesResList = categoriesService.getAllCategories();
			return new ResponseEntity<>(categoriesResList,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@GetMapping(value = "/category/{id}")
	ResponseEntity<Object> getCategories(@PathVariable("id") int id) throws Exception {
		try {
			
			Categories categoriesRes = categoriesService.getCategoryById(id);
			return new ResponseEntity<>(categoriesRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
	@DeleteMapping(value = "/category/{id}")
	ResponseEntity<Object> deleteCategory(@PathVariable("id") int id) throws Exception {
		try {
			
			Categories categoriesRes = categoriesService.deleteCategory(id);
			return new ResponseEntity<>(categoriesRes,HttpStatus.OK);
		}catch(ResponseStatusException ex) {
			return ResponseHandler.generateResponse(ex.getMessage(), ex.getStatusCode(), null);
		}
		
	}
	
}
