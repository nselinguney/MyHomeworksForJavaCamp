package day5.dataAccess.abstracts;

import day5.entities.concretes.User;

public interface UserDao {

	void uyeEkle(User user);
	void uyeGirisi(User user);
}
