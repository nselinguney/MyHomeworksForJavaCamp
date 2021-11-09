package day6.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import day6.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
