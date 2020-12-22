package com.bluecollar.jobmanagement.controller;

import com.bluecollar.jobmanagement.model.Job;
import com.bluecollar.jobmanagement.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobManagementController
{
	@Autowired  
	JobService jobService;
	
	//create job
	@PostMapping("/createjob")
	public String createJob(@RequestParam(value = "clientId") int clientId, @RequestParam(value = "jobCategoryId") int jobCategoryId, @RequestParam(value = "text") String text)
	{
		jobService.saveOrUpdate(new Job(clientId, jobCategoryId, text));
		return "Success";
	}

	//update job

	//delete job

	//search jobs
}