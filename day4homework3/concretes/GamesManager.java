package day4homework3.concretes;

import day4homework3.abstracts.GameService;
import day4homework3.entities.Games;

public class GamesManager implements GameService {

	@Override
	public void add(Games game) {
		System.out.println(game.getName() + "Adl� oyun eklendi.");
		
	}

	@Override
	public void delete(Games game) {
		System.out.println(game.getName() + "Adl� oyun silindi");
		
	}

	@Override
	public void update(Games game) {
		System.out.println(game.getName() + "Adl� oyun g�ncellendi.");
		
	}

}
