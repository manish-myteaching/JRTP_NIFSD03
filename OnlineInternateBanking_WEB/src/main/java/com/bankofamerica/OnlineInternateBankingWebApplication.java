package com.bankofamerica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnlineInternateBankingWebApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(OnlineInternateBankingWebApplication.class, args);

		//UserRepository userRepository = applicationContext.getBean(UserRepository.class, "userRepository");

//		User user = new User();
//		user.setFirstName("Manish");
//		user.setLastName("Verma");
//		user.setEmail("manish.verma@gmail.com");
//		user.setPhoneNumber("8585856232");
//		user.setSsnNo("5555-5555-2222");
//		user.setUserId("m	anish123");
//		user.setUserPassword("123456");
		//userRepository.save(user);
		
//		UserService userService = applicationContext.getBean(UserService.class, "userService");
//		User user = new User();
//		user.setFirstName("Rohit");
//		user.setLastName("Sharma");
//		user.setEmail("Rohit.Sharma@gmail.com");
//		user.setPhoneNumber("8585856239");
//		user.setSsnNo("5555-5555-2222");
//		user.setUserId("manish1234");
//		user.setUserPassword("123456");
//		userService.registerUser(user);
//		

	}

}
