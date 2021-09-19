package com.auriecommerce.enterprise.controllers.product;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.auriecommerce.enterprise.model.product.Product;
import com.auriecommerce.enterprise.model.product.ProductGroup;
import com.auriecommerce.enterprise.services.productService.IProductService;

@RestController
public class ProductController {

	private IProductService productService;
	
	@PostMapping("/products/add")
	public Product add(Product product) {
		Product newProduct = productService.save(product);
		return newProduct;
	}
	
	@GetMapping("/products/all")
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return products;
	}
	
	@GetMapping("/products/{id}")
	public Product getById(long id) {
		Product product = productService.getProductById(id);
		return product;
	}
	
	@GetMapping("/products/{productGroup.id}")
	public List<Product> getProductsByGroup(ProductGroup productGroup){
		List<Product> products = productService.getProductsByGroup(productGroup);
		return products;
	}
	
	@DeleteMapping("/products/delete")
	public String deleteProductById(long id) {
		String response = productService.deleteProductById(id);
		return response;
	}
	
}
