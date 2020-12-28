package com.bluecollar.usermanagement.repo;

import org.springframework.data.repository.CrudRepository;
import com.bluecollar.usermanagement.model.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	User findByUsername(String username);
}