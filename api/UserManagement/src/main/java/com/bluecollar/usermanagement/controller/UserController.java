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

	@PatchMapping("/updateuserbyid")
	public void updateUserById(
		@RequestParam(value = "userId") Integer userId,
		@RequestParam(value = "firstName", required = false) String firstName,
		@RequestParam(value = "lastName", required = false) String lastName,
		@RequestParam(value = "email", required = false) String email,
		@RequestParam(value = "rating", required = false) Integer rating,
		@RequestParam(value = "active", required = false) Boolean active,
		@RequestParam(value = "city", required = false) String city,
		@RequestParam(value = "province", required = false) String province,
		@RequestParam(value = "country", required = false) String country,
		@RequestParam(value = "username", required = false) String username,
		@RequestParam(value = "passHash", required = false) String passHash)
	{
		User u = userService.getUserById(userId);
		if (firstName != null) u.setFirstName(firstName);
		if (lastName != null) u.setLastName(lastName);
		if (email != null) u.setEmail(email);
		if (rating != null) u.setRating(rating);
		if (active != null) u.setActive(active);
		if (city != null) u.setCity(city);
		if (province != null) u.setProvince(province);
		if (country != null) u.setCountry(country);
		if (username != null) u.setUsername(username);
		if (passHash != null) u.setPassHash(passHash);
		userService.saveOrUpdate(u);
	}

	@GetMapping("/getuserbyid")
	public User getUserById(
		@RequestParam(value = "userId") int userId)
	{
		return userService.getUserById(userId);
	}

	@DeleteMapping("/deleteuserbyid")
	public void deleteUserById(
		@RequestParam(value = "userId") int userId)
	{
		User u = userService.getUserById(userId);
		userService.delete(u);
	}
}