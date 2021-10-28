package day3;

public class UserManager {

	public void signUp(Users user) {
		
		System.out.println(user.getName() + user.getLastName() + "Sisteme kaydoldunuz");
	}

	public void updatePassword(Users user) {
		
		System.out.println(user.getName() + "�ifreniz ba�ar�yla g�ncellendi.");
		
	}
	
	public void updateMail(Users user) {
		
		System.out.println(user.getName() + user.getLastName() + "Mail adresiniz ba�ar�yla g�ncellendi.");
	}
	
	public void displayUser(Users user) {
		
		System.out.println(
				"Kullan�c� Id: " + user.getId() +
				" Ad: " + user.getName() +
				" Soyad: " + user.getLastName() +
				" E-Mail: " + user.getEmail() +
				" Kurs: " + user.getCourses()
		);
	}
}
