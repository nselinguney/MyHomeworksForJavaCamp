package day6.hrms.business.abstracts;

import java.util.List;

import day6.hrms.core.utilities.results.Result;
import day6.hrms.entities.concretes.Candidate;

public interface CandidateService {

	Result add(Candidate candidate);
	List<Candidate> getAllCandidate();
}
