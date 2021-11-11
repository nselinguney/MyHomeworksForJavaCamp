package day6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day6.hrms.business.abstracts.EmployerService;
import day6.hrms.core.utilities.results.ErrorResult;
import day6.hrms.core.utilities.results.Result;
import day6.hrms.core.utilities.results.SuccessResult;
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

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		if(this.employerDao.existsByEmail(employer.getEMail())) {
			return new ErrorResult("Bu E-Mail adresi kullanımda. Başka bir adresle kayıt yapınız.");
		} else {
			this.employerDao.save(employer);
			return new SuccessResult("Kullanıcı kaydedildi.");
		}
	}
}
