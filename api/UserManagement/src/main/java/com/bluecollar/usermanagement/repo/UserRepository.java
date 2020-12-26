package com.bluecollar.usermanagement.repo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.bluecollar.usermanagement.model.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	
}