package com.bluecollar.jobmanagement.repo;

import org.springframework.data.repository.CrudRepository;
import com.bluecollar.jobmanagement.model.Job;

public interface JobRepository extends CrudRepository<Job, Long>
{
}