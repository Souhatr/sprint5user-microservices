package com.souha.users.service;
import java.util.List;

import com.souha.users.entities.Role;

import com.souha.users.entities.User;
import com.souha.users.service.register.RegistationRequest;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	User registerUser(RegistationRequest request);
	void sendEmailUser(User u, String code);
	public User validateToken(String code);
}
