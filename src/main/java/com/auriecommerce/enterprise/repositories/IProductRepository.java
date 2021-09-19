package com.auriecommerce.enterprise.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auriecommerce.enterprise.model.product.Product;
import com.auriecommerce.enterprise.model.product.ProductGroup;

@Repository("productRepository")
public interface IProductRepository extends JpaRepository<Product, Long> {
	List<Product> getAllProducts();

	List<Product> getProductsByGroup(ProductGroup productGroup);

	void deleteAllByGroup(ProductGroup productGroup);

	List<Product> getProductsByName(String name);
}
