package day4homework3.concretes;

import day4homework3.abstracts.GamerCheckService;
import day4homework3.entities.Gamers;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamers gamer) {
		
		return true;
	}

}
