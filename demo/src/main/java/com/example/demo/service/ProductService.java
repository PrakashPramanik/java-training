package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Product;
import com.example.demo.repo.ProductRepository;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> getProducts() {
		return repository.getAllProducts();
	}

	public Product getProductById(int id) {
		return repository.findById(id);
	}
	
	
	
	public Product getProductByName(String name) {
		return repository.findByName(name);
	}

	public String deleteProduct(int id) {
		repository.delete(id);
		return "product removed !! " + id;
	}

	public Product updateProduct(Product product) {
		return repository.update(product);
	}
}