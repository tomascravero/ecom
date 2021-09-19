package com.auriecommerce.enterprise.services.productService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import com.auriecommerce.enterprise.model.product.Product;
import com.auriecommerce.enterprise.model.product.ProductGroup;
import com.auriecommerce.enterprise.repositories.IProductRepository;
import com.auriecommerce.enterprise.services.userService.UserService;

public class ProductService implements IProductService {

	@Autowired
	private IProductRepository productRepository;
	
	private UserService userService;
	
	public ProductService(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product save(Product product) {
		Product newProduct = productRepository.save(product);
		return newProduct;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> allProducts = productRepository.getAllProducts();
		return allProducts;
	}

	@Override
	public Product getProductById(long id) {
		Optional<Product> product = productRepository.findById(id);
		try {
			return product.get();
		} catch (NoSuchElementException e) {
			throw e;
		}
	}

	@Override
	public List<Product> getProductsByGroup(ProductGroup productGroup) {
		List<Product> products = productRepository.getProductsByGroup(productGroup);
		return products;
	}

	@Override
	public String deleteProductById(long id) {
		Product product = productRepository.getById(id);
		productRepository.deleteById(id);

		return "Producto " + product.getName() + " eliminado correctamente";
	}

	@Override
	public String deleteProductsByGroup(ProductGroup productGroup) {
		List<Product> products = productRepository.getProductsByGroup(productGroup);
		productRepository.deleteAllByGroup(productGroup);
		return "Productos eliminados: " + products;
	}

	@Override
	public List<Product> getProductsByName(String name) {
		List<Product> products = productRepository.getProductsByName(name);
		return products;
	}

}
