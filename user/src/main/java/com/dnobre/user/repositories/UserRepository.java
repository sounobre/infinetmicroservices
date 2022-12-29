package com.dnobre.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnobre.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
