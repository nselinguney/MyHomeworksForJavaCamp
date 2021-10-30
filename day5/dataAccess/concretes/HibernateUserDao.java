package day5.dataAccess.concretes;

import day5.dataAccess.abstracts.UserDao;
import day5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void uyeEkle(User user) {
		
		System.out.println(user.getAd() + " �yelik kayd�n�z ba�ar�yla ger�ekle�ti.");
		System.out.println(user.getEmail() + " adresine dogrulama e-postas� g�nderilmi�tir.");
	}

	@Override
	public void uyeGirisi(User user) {
		System.out.println(user.getAd() + " Ho�geldiniz");
	}
}
