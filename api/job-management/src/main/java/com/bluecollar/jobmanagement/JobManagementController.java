package com.bluecollar.jobmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobManagementController
{
	//create job
	@GetMapping("/createjob")
	public Job createJob(@RequestParam(value = "clientId") int clientId, @RequestParam(value = "jobCategoryId") int jobCategoryId, @RequestParam(value = "text") String text)
	{
		return new Job(clientId, jobCategoryId, text);
	}

	//update job

	//delete job

	//search jobs
}