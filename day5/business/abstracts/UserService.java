package day5.business.abstracts;

import day5.entities.concretes.User;

public interface UserService {

	public void uyeEkle(User user);
	public void googleIleUyeEkle(User user);
	public void uyeGirisi(User user);
}
