package com.bluecollar.usermanagement.service;

import java.util.ArrayList;
import java.util.List;
import com.bluecollar.usermanagement.model.User;
import com.bluecollar.usermanagement.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
	@Autowired
	UserRepository userRepo;

	public User getUserById(int userId)
	{
		return userRepo.findById(userId).get();
	}

	public User getUserByUsername(String username)
	{
		return userRepo.findByUsername(username);
	}

	public void saveOrUpdate(User u)
	{
		userRepo.save(u);
	}

	public void delete(User u)
	{
		userRepo.delete(u);
	}
}