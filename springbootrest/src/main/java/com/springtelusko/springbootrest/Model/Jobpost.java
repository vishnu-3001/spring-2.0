package com.springtelusko.springbootrest.Model;

import java.util.List;


import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Jobpost {


	private int postId;
	private String postProfile; 
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;
	
}
