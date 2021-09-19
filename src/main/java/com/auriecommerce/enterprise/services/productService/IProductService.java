package com.auriecommerce.enterprise.services.productService;

import java.util.List;

import com.auriecommerce.enterprise.model.product.Product;
import com.auriecommerce.enterprise.model.product.ProductGroup;

public interface IProductService {
	Product save(Product product);

	/* GETTERS */
	List<Product> getAllProducts();

	Product getProductById(long id);

	List<Product> getProductsByGroup(ProductGroup productGroup);

	List<Product> getProductsByName(String name);
	
	/* UPDATES */

	/* DELETE */
	String deleteProductsByGroup(ProductGroup productGroup);

	String deleteProductById(long id);
}
