package day6.hrms.business.abstracts;

import java.util.List;

import day6.hrms.core.utilities.results.Result;
import day6.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	List<Employer> getAllEmployers();
}
