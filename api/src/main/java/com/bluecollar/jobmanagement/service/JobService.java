package com.bluecollar.jobmanagement.service;

import com.bluecollar.jobmanagement.model.Job;
import com.bluecollar.jobmanagement.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService
{
	@Autowired  
	JobRepository jobRepo;

	public void saveOrUpdate(Job job)   
	{  
		jobRepo.save(job);
	}
}
