package com.bankofamerica.util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bankofamerica.entity.User;
import com.bankofamerica.exception.UserAlreadyExist;
import com.bankofamerica.exception.UserDataException;
import com.bankofamerica.repository.UserRepository;

@Component
public class ValidationUtil {

    @Autowired
    private UserRepository userRepository;

   public void validateUser(User user) {

        // Field validation
        validateRequiredFields(user);
        
        //Valid Email ID and PhoneNo

        // User existence validation for email, phone number, and user ID
        validateUserExistence(user);
    }

    private void validateRequiredFields(User user) {
        if (isBlank(user.getFirstName())) {
            throw new UserDataException("First Name is required");
        }
        if (isBlank(user.getLastName())) {
            throw new UserDataException("Last Name is required");
        }
        if (isBlank(user.getEmail())) {
            throw new UserDataException("Email Address is required");
        }
        if (isBlank(user.getPhoneNumber())) {
            throw new UserDataException("Phone Number is required");
        }  
        if (isBlank(user.getSsnNo())) {
            throw new UserDataException("SSN Number is required");
        }
        if (isBlank(user.getUserId())) {
            throw new UserDataException("User Id is required");
        }     
    }

    private void validateUserExistence(User user) {
        if (user.getEmail() != null && isUserExistsByEmail(user.getEmail())) {
            throw new UserAlreadyExist("Email is already taken");
        }

        if (user.getPhoneNumber() != null && isUserExistsByPhoneNumber(user.getPhoneNumber())) {
            throw new UserAlreadyExist("Phone number is already registered");
        }

        if (user.getUserId() != null && isUserExistsByUserId(user.getUserId())) {
            throw new UserAlreadyExist("User ID is already taken");
        }
    }

    private boolean isUserExistsByEmail(String email) {
        Optional<User> userData = userRepository.findByEmail(email);
        return userData.isPresent();
    }

    private boolean isUserExistsByPhoneNumber(String phoneNumber) {
        Optional<User> userData = userRepository.findByPhoneNumber(phoneNumber);
        return userData.isPresent();
    }

    private boolean isUserExistsByUserId(String userId) {
        Optional<User> userData = userRepository.findByUserId(userId);
        return userData.isPresent();
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
