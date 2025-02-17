package com.springtelusko.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springtelusko.springbootrest.Model.Jobpost;
import com.springtelusko.springbootrest.Service.Jobservice;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private Jobservice service;

    @GetMapping("jobPosts")
    @ResponseBody
    public List<Jobpost> getAllJobs(){
        return service.getAllJobs();
    }
    @PostMapping("jobPost")
    public void addJob(@RequestBody Jobpost jobpost) {        
        service.addJobPost(jobpost);
    }
    
    
}
