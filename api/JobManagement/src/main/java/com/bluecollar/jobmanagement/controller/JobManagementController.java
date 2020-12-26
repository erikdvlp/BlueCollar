package com.bluecollar.jobmanagement.controller;

import java.util.ArrayList;
import java.util.List;
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
		@RequestParam(value = "status", required = false) Integer status)
	{
		Job j = jobService.getJobById(jobId);
		if (clientId != null) j.setClientId(clientId);
		if (workerId != null) j.setWorkerId(workerId);
		if (jobCategoryId != null) j.setjobCategoryId(jobCategoryId);
		if (text != null) j.setText(text);
		if (status != null) j.setStatus(status);
		jobService.saveOrUpdate(j);
	}

	@DeleteMapping("/deletejob")
	public void deleteJob(
		@RequestParam(value = "jobId") Integer jobId)
	{
		Job j = jobService.getJobById(jobId);
		jobService.delete(j);
	}

	@GetMapping("/getjobsmatching")
	public List<Job> getJobsMatching(
		@RequestParam(value = "jobCategoryId", required = false) Integer jobCategoryId,
		@RequestParam(value = "status", required = false) Integer status)
	{
		List<Job> jobs = new ArrayList<Job>();
		jobs = jobService.getJobsByJobCategoryIdAndStatus(jobCategoryId, status);
		return jobs;
	}
}