package com.example.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Product;
import com.example.crud.repo.CrudRepo;

@Service
public class CrudService {

	@Autowired
	private CrudRepo repo;
	public List<Product> fetchproductList(){
		return repo.findAll();
	}
	public Product saveProductToDB(Product product)
	{
		return repo.save(product);
	}
	
	public Optional<Product> fetchProductById(int id)
	{
		return repo.findById(id);
	}
	
	public String deleteProductById(int id) {
		
		String result;
		try {
			repo.deleteById(id);
			result="product sucessfully deleted";
		} catch (Exception e) {
			result="issue  ";
		}
		
		
		return result;
	}
	
	
	
	
	
	
}
