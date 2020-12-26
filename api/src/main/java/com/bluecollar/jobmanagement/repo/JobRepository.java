package com.bluecollar.jobmanagement.repo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.bluecollar.jobmanagement.model.Job;

public interface JobRepository extends CrudRepository<Job, Integer>
{
	List<Job> findByJobCategoryIdAndStatus(int jobCategoryId, int status);
}