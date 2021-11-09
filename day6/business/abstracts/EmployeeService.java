package day6.hrms.business.abstracts;

import java.util.List;

import day6.hrms.entities.concretes.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
}
