package day4homework3.concretes;

import day4homework3.abstracts.GamerCheckService;
import day4homework3.abstracts.GamerService;
import day4homework3.entities.Gamers;

public class GamerManager implements GamerService {

	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService=gamerCheckService;
	}
	
	@Override
	public void add(Gamers gamer) {

		System.out.println(gamer.getName() + "Adlý kullanýcý eklendi.");
	}

	@Override
	public void delete(Gamers gamer) {

		System.out.println(gamer.getName() + "Adlý kullanýcý silindi.");
	}

	@Override
	public void update(Gamers gamer) {

		System.out.println(gamer.getName() + "adlý kullanýcý güncellendi");
	}

}
