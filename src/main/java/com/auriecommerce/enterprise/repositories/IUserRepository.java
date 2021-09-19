package com.auriecommerce.enterprise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auriecommerce.enterprise.model.user.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
