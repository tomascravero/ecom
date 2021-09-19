package com.auriecommerce.enterprise.model.product;

import javax.persistence.*;

@Entity
@Table(name = "product_groups")
public class ProductGroup {
	private Long id;
	private String groupName;
	private String created;

	public ProductGroup() {

	}

	public ProductGroup(String id) {
		this.id = Long.parseLong(id);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "group_name")
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String toString() {
		return getGroupName();
	}
}
