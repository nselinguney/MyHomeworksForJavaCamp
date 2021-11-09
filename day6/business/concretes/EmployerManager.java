package day6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day6.hrms.business.abstracts.EmployerService;
import day6.hrms.dataAccess.abstracts.EmployerDao;
import day6.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAllEmployers() {
		// TODO Auto-generated method stub
		return this.employerDao.findAll();
	}
}
