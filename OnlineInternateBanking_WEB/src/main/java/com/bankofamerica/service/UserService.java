package com.bankofamerica.service;

import com.bankofamerica.entity.User;

public interface UserService {

	public User registerUser(User user);
	
	public User updateUser(User user);
	
	public User getUser(Long userId);

}
