package com.bluecollar.usermanagement.controller;

import java.util.ArrayList;
import java.util.List;
import com.bluecollar.usermanagement.model.User;
import com.bluecollar.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@Autowired
	UserService userService;

	@PostMapping("/createuser")
	public void createUser(
		@RequestParam(value = "worker") boolean worker,
		@RequestParam(value = "firstName") String firstName,
		@RequestParam(value = "lastName") String lastName,
		@RequestParam(value = "email") String email,
		@RequestParam(value = "city") String city,
		@RequestParam(value = "province") String province,
		@RequestParam(value = "country") String country,
		@RequestParam(value = "username") String username,
		@RequestParam(value = "passHash") String passHash)
	{
		userService.saveOrUpdate(new User(worker, firstName, lastName, email, city, province, country, username, passHash));
	}

	@GetMapping("/getuserbyid")
	public User getUserById(
		@RequestParam(value = "userId") int userId)
	{
		return userService.getUserById(userId);
	}
}