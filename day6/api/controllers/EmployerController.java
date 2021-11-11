package day6.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import day6.hrms.business.abstracts.EmployerService;
import day6.hrms.core.utilities.results.Result;
import day6.hrms.entities.concretes.Candidate;
import day6.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("api/employers")
public class EmployerController {
	
	EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getAllEmployers")
	public List<Employer> getAllEmployers(){
		
		return employerService.getAllEmployers();
	}
	
	 @PostMapping("/addEmployer")
	 public Result add(@RequestBody Employer employer){
       return this.employerService.add(employer);
     }
}
