package com.bluecollar.usermanagement.controller;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import com.bluecollar.usermanagement.model.User;
import com.bluecollar.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController
{
	@Autowired
	UserService userService;

	@PostMapping("/usermgmt/createuser")
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

	@PatchMapping("/usermgmt/updateuserbyid")
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

	@GetMapping("/usermgmt/getuserbyid")
	public User getUserById(
		@RequestParam(value = "userId") int userId)
	{
		return userService.getUserById(userId);
	}

	@DeleteMapping("/usermgmt/deleteuserbyid")
	public void deleteUserById(
		@RequestParam(value = "userId") int userId)
	{
		User u = userService.getUserById(userId);
		userService.delete(u);
	}

	@PostMapping("/usermgmt/login")
	public ResponseEntity login(
		@RequestParam(value = "username") String username,
		@RequestParam(value = "password") String password)
	{
		String passHash = "";
		try { passHash = hashPassword(password); }
		catch (NoSuchAlgorithmException e) { e.printStackTrace(); }
		User u = userService.getUserByUsername(username);
		if (u.getPassHash().equals(passHash))
			return new ResponseEntity<>(HttpStatus.ACCEPTED); //202
		else
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE); //406
	}

	private String hashPassword(String password) throws NoSuchAlgorithmException
	{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));
		BigInteger number = new BigInteger(1, hash);  
		StringBuilder hexString = new StringBuilder(number.toString(16));  
		while (hexString.length() < 32)
			hexString.insert(0, '0');
		return hexString.toString();
	}
}