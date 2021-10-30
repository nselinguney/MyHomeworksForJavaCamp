package day5;

import day5.business.abstracts.UserService;
import day5.business.concretes.UserManager;
import day5.core.GoogleManagerAdapter;
import day5.dataAccess.abstracts.UserDao;
import day5.dataAccess.concretes.HibernateUserDao;
import day5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserDao());
		User user = new User("Selin", "Güney", "selinguneylg@gmail.com", "123456");
		userService.uyeEkle(user);
		
		UserService userService2 = new UserManager(new GoogleManagerAdapter());
		User user2 = new User("Engin","Demiroð","engindemiroð@gmail.com","789101");
		userService2.googleIleUyeEkle(user2);
		
		UserService userService3 = new UserManager(new HibernateUserDao());
		User user3 = new User("Selin", "Güney", "selinguneylg@gmail.com", "123456");
		userService.uyeGirisi(user3);
		
	}

}
