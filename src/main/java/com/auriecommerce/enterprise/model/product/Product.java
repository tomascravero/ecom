package com.auriecommerce.enterprise.model.product;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.auriecommerce.enterprise.model.user.User;

@Entity
@Table(name = "products")
public class Product {

	private long id;
	private String name;
	private Integer price;
	private String description;
	private AditionalInfo aditionalInfo;
	private ProductImage image;
	private List<ProductGroup> productGroup;
	private String createdAt;
	private String userId;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ProductImage getImage() {
		return image;
	}

	public void setImage(ProductImage image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AditionalInfo getAditionalInfo() {
		return aditionalInfo;
	}

	public void setAditionalInfo(AditionalInfo aditionalInfo) {
		this.aditionalInfo = aditionalInfo;
	}

	public List<ProductGroup> getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(List<ProductGroup> productGroup) {
		this.productGroup = productGroup;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return userId;
	}

	public void setCreatedBy(String userId) {
		this.userId = userId;
	}

}
