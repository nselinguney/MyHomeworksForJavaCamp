package day6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day6.hrms.business.abstracts.JobService;
import day6.hrms.dataAccess.abstracts.JobDao;
import day6.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobsDao;
	
	@Autowired
	public JobManager(JobDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}

	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return this.jobsDao.findAll();
	}

}
