package day6.hrms.business.abstracts;

import java.util.List;

import day6.hrms.entities.concretes.Candidate;

public interface CandidateService {

	List<Candidate> getAllCandidate();
}
