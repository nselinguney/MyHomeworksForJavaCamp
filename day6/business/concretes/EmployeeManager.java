package day6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day6.hrms.business.abstracts.EmployeeService;
import day6.hrms.dataAccess.abstracts.EmployeeDao;
import day6.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public List<Employee> getAllEmployees() {
		return this.employeeDao.findAll();
	}

}
