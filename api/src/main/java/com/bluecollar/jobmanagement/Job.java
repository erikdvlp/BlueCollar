package com.bluecollar.jobmanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job
{
	@Id
	@GeneratedValue
	private int jobId;
	private int clientId;
	private int workerId;
	private int jobCategoryId;
	private String text;
	private int status;

	public int getJobId()
	{
		return this.jobId;
	}

	public int getClientId()
	{
		return this.clientId;
	}

	public void setClientId(int clientId)
	{
		this.clientId = clientId;
	}

	public int getjobCategoryId()
	{
		return this.jobCategoryId;
	}

	public void setjobCategoryId(int jobCategoryId)
	{
		this.jobCategoryId = jobCategoryId;
	}

	public int getWorkerId()
	{
		return this.workerId;
	}

	public void setWorkerId(int workerId)
	{
		this.workerId = workerId;
	}

	public String getText()
	{
		return this.text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public int getStatus()
	{
		return this.status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public Job(int clientId, int jobCategoryId, String text)
	{
		this.setClientId(clientId);
		this.setjobCategoryId(jobCategoryId);
		this.setText(text);
		this.setStatus(0);
	}
}