package com.bluecollar.jobmanagement.controller;

import com.bluecollar.jobmanagement.model.Job;
import com.bluecollar.jobmanagement.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobManagementController
{
	@Autowired  
	JobService jobService;
	
	@PostMapping("/createjob")
	public void createJob(
		@RequestParam(value = "clientId") int clientId,
		@RequestParam(value = "jobCategoryId") int jobCategoryId,
		@RequestParam(value = "text") String text)
	{
		jobService.saveOrUpdate(new Job(clientId, jobCategoryId, text));
	}

	@PatchMapping("/updatejob")
	public void updateJob(
		@RequestParam(value = "jobId") Integer jobId,
		@RequestParam(value = "clientId", required = false) Integer clientId,
		@RequestParam(value = "workerId", required = false) Integer workerId,
		@RequestParam(value = "jobCategoryId", required = false) Integer jobCategoryId,
		@RequestParam(value = "text", required = false) String text,
		@RequestParam(value = "status", required = false) String status)
	{
		//implement
	}

	@DeleteMapping("/deletejob")
	public void deleteJob()
	{
		//implement
	}

	@GetMapping("/getjobs")
	public void getJobs()
	{
		//implement
	}
}