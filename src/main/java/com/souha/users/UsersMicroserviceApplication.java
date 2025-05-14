package com.souha.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.souha.users.entities.User;
import com.souha.users.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroserviceApplication {


	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	@Autowired
	UserService userService;
	/*@PostConstruct
	void init_users() {
	//ajouter les rôles
	//userService.addRole(new Role(null,"ADMIN"));
	//userService.addRole(new Role(null,"USER"));
	//ajouter les users
	userService.saveUser(new User(null,"admin","123",true,null)); 
	userService.saveUser(new User(null,"souha","123",true,null));
	userService.saveUser(new User(null,"doua","123",true,null));
	//ajouter les rôles aux users
	userService.addRoleToUser("admin", "ADMIN");
	userService.addRoleToUser("admin", "USER");
	userService.addRoleToUser("souha", "USER");
	userService.addRoleToUser("doua", "USER");
	} */
}
