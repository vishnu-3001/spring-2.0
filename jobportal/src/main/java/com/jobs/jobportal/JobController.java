package com.jobs.jobportal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class JobController {
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("/addjob")
    public String addJob() {
        return "addjob";
    }
    @PostMapping("/handleForm")
    public String handleForm(Jobpost jobpost) {        
        return "success";
    }
    
    
}
