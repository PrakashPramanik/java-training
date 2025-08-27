package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {
	private List<Product> list = new ArrayList<Product>();

	public void createProducts() {
		Product p1 = new Product(1, "product 1", 10, 1000);
		Product p2 = new Product(2, "product 2", 20, 2000);
		Product p3 = new Product(3, "product 3", 30, 3000);
		list.add(p1);
		list.add(p2);
		list.add(p3);
	}

	public List<Product> getAllProducts() {
		Product p1 = new Product(1, "product 1", 10, 1000);
		Product p2 = new Product(2, "product 2", 20, 2000);
		Product p3 = new Product(3, "product 3", 30, 3000);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		return list;
	}

	public Product findById(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == (id)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	
	
	public Product findByName(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}

	public List<Object> search(String name) {
		return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
	}

	public Product save(Product p) {
		Product product = new Product();
		product.setId(p.getId());
		product.setName(p.getName());
		product.setQuantity(p.getQuantity());
		product.setPrice(p.getPrice());
		list.add(product);
		return product;
	}

	public String delete(Integer id) {
		list.removeIf(x -> x.getId() == (id));
		return null;
	}

	public Product update(Product product) {
		int idx = 0;
		int id = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == (product.getId())) {
				id = product.getId();
				idx = i;
				break;
			}
		}

		Product product1 = new Product();
		product1.setId(id);
		product1.setName(product.getName());
		product1.setQuantity(product.getQuantity());
		product1.setPrice(product.getPrice());
		list.set(idx, product);
		return product1;
	}
}
