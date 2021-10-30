package day5.business.concretes;

import java.util.Scanner;

import day5.business.abstracts.UserService;
import day5.core.GoogleService;
import day5.dataAccess.abstracts.UserDao;
import day5.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	

	public UserManager(GoogleService googleService) {
		super();
		this.googleService = googleService;
	}


	@Override
	public void uyeEkle(User user) {

		if(user.getAd().length() < 2 || user.getSoyad().length() < 2) {
			System.out.println("Ad ve Soyad en az 2 karakterden oluþmalýdýr.");
			System.out.println("Kayýt oluþturulamadý.");
				return;
		}
		if(user.getParola().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			System.out.println("Kayýt oluþturulamadý.");
				return;
		}
		
		Scanner sc = new Scanner(user.getEmail());
	    String phone = sc.next();
	    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      //Matching the given phone number with regular expression
	    boolean result = phone.matches(regex);
	   
	    if(!result) {
	    	System.out.println("Geçerli bir e-mail adresi giriniz.");
	    		return;
	    } else {
	    	userDao.uyeEkle(user);
	    		return;
	    }
		
		//userDao.uyeEkle(user);
		
	}
	
	public void googleIleUyeEkle(User user) {
		
		googleService.sistemeUyelik(user.getAd());
	}


	@Override
	public void uyeGirisi(User user) {
		if(user.getAd().length()==0 || user.getParola().length()==0) {
			System.out.println("Lütfen bilgileri eksiksiz giriniz.");
		} else {
			userDao.uyeGirisi(user);
		}
	}
}
