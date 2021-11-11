package day6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day6.hrms.business.abstracts.CandidateService;
import day6.hrms.core.utilities.results.ErrorResult;
import day6.hrms.core.utilities.results.Result;
import day6.hrms.core.utilities.results.SuccessResult;
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


	@Override
	public Result add(Candidate candidate) {
		if(this.candidateDao.existsByEmail(candidate.getEMail())) {
		return new ErrorResult("Bu E-Mail adresi kullanımda. Lütfen başka bir adres seçiniz.");
		}
		else if (this.candidateDao.existsByNationalityId(candidate.getIdentityNumber())) {
			return new ErrorResult("Bu TC Kimlik No kullanımda");
		}
		else {
			this.candidateDao.save(candidate);
			return new SuccessResult("Kullanıcı eklendi.");
		}
	}

}
