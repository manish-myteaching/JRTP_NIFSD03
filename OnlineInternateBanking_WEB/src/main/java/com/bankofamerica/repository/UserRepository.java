package com.bankofamerica.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankofamerica.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);
	
	Optional<User> findByPhoneNumber(String phoneNo);

	//@Query("SELECT u FROM User u WHERE u.userId = :userId")
	Optional<User> findByUserId(String userId);
}
