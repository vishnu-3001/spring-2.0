package com.springtelusko.springbootrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtelusko.springbootrest.Model.*;
import com.springtelusko.springbootrest.Repo.*;


@Service
public class Jobservice {
	@Autowired
	public Jobrepo repo;
	
	
	
	//method to return all JobPosts
	public List<Jobpost> getAllJobs() {
		return repo.getAllJobs();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJobPost(Jobpost jobPost) {
		 repo.addJobPost(jobPost);
	
	}

	
}