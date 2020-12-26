package com.bluecollar.jobmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.bluecollar.jobmanagement"})
public class JobManagementApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(JobManagementApplication.class, args);
	}
}