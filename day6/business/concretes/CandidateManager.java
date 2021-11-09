package day6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day6.hrms.business.abstracts.CandidateService;
import day6.hrms.dataAccess.abstracts.CandidateDao;
import day6.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}


	@Override
	public List<Candidate> getAllCandidate() {
		return this.candidateDao.findAll();
	}

}
