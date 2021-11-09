package day6.hrms.business.abstracts;

import java.util.List;
import day6.hrms.entities.concretes.Job;

public interface JobService {

	List<Job> getAll();

}
