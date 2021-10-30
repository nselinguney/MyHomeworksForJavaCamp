package day5.dataAccess.concretes;

import day5.dataAccess.abstracts.UserDao;
import day5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void uyeEkle(User user) {
		
		System.out.println(user.getAd() + " Üyelik kaydýnýz baþarýyla gerçekleþti.");
		System.out.println(user.getEmail() + " adresine dogrulama e-postasý gönderilmiþtir.");
	}

	@Override
	public void uyeGirisi(User user) {
		System.out.println(user.getAd() + " Hoþgeldiniz");
	}
}
