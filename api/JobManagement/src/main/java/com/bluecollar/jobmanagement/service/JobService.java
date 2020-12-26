package com.bluecollar.jobmanagement.service;

import java.util.ArrayList;
import java.util.List;
import com.bluecollar.jobmanagement.model.Job;
import com.bluecollar.jobmanagement.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService
{
	@Autowired  
	JobRepository jobRepo;

	public Job getJobById(int jobId)
	{
		return jobRepo.findById(jobId).get();
	}

	public List<Job> getAllJobs()   
	{
		List<Job> jobs = new ArrayList<Job>();
		jobRepo.findAll().forEach(j -> jobs.add(j));
		return jobs;
	}

	public List<Job> getJobsByJobCategoryIdAndStatus(int jobCategoryId, int status)   
	{
		List<Job> jobs = new ArrayList<Job>();
		jobRepo.findByJobCategoryIdAndStatus(jobCategoryId, status).forEach(j -> jobs.add(j));
		return jobs;
	}

	public void saveOrUpdate(Job j)
	{
		jobRepo.save(j);
	}

	public void delete(Job j)
	{
		jobRepo.delete(j);
	}
}