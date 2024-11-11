package com.bankofamerica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankofamerica.entity.User;
import com.bankofamerica.repository.UserRepository;
import com.bankofamerica.util.ValidationUtil;

/*
 *  @author: Manish.verma
 *  @since 11-11-2024
 *  This functionality  we are going to use for user management.
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ValidationUtil validationUtil;

	/**
	 * Method for new user registration.
	 */
	@Override
	public User registerUser(User user) {
		
		validationUtil.validateUser(user);		
		User userData = userRepository.save(user);
		
		//Email
		//Message

		return userData;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
