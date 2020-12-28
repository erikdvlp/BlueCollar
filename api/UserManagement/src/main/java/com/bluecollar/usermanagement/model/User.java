package com.bluecollar.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User
{
	@Id
	@GeneratedValue
	private int userId;
	private boolean worker;
	private String firstName;
	private String lastName;
	private String email;
	private int rating;
	private boolean active;
	private String city;
	private String province;
	private String country;
	@Column(unique = true)
	private String username;
	private String passHash;

	public int getUserId()
	{
		return this.userId;
	}

	public boolean getWorker()
	{
		return this.worker;
	}

	public void setWorker(boolean worker)
	{
		this.worker = worker;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getRating()
	{
		return this.rating;
	}

	public void setRating(int rating)
	{
		this.rating = rating;
	}

	public boolean getActive()
	{
		return this.active;
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}

	public String getCity()
	{
		return this.city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getProvince()
	{
		return this.province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getCountry()
	{
		return this.country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassHash()
	{
		return this.passHash;
	}

	public void setPassHash(String passHash)
	{
		this.passHash = passHash;
	}

	public User() {}

	public User(boolean worker, String firstName, String lastName, String email, String city, String province, String country, String username, String passHash)
	{
		this.worker = worker;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.rating = 5;
		this.active = true;
		this.city = city;
		this.province = province;
		this.country = country;
		this.username = username;
		this.passHash = passHash;
	}
}