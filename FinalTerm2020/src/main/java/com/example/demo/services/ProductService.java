package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.respositery.ProductRepositery;



@Service
public class ProductService {

	@Autowired
	private ProductRepositery productrepo;

	public Product saveProduct(Product product) {
		return productrepo.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return productrepo.saveAll(products);
	}

	public List<Product> getProducts() {
		return productrepo.findAll();
	}

	public Product getProductById(int id) {
		return productrepo.findById(id).orElse(null);
	}

	public Product getProductByName(String name) {
		return productrepo.findByName(name);
	}

	public String deleteProduct(int id) {
		productrepo.deleteById(id);
		return "Product Deleted " + id;
	}

	public Product updateProduct(Product product) {
		Product existingProduct = productrepo.findById(product.getProductId()).orElse(null);
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductQuantity(product.getProductQuantity());
		existingProduct.setProductPrice(product.getProductPrice());
		existingProduct.setProductType(product.getProductType());
		return productrepo.save(existingProduct);
	}
}
