package day3;

public class UserManager {

	public void signUp(Users user) {
		
		System.out.println(user.getName() + user.getLastName() + "Sisteme kaydoldunuz");
	}

	public void updatePassword(Users user) {
		
		System.out.println(user.getName() + "Þifreniz baþarýyla güncellendi.");
		
	}
	
	public void updateMail(Users user) {
		
		System.out.println(user.getName() + user.getLastName() + "Mail adresiniz baþarýyla güncellendi.");
	}
	
	public void displayUser(Users user) {
		
		System.out.println(
				"Kullanýcý Id: " + user.getId() +
				" Ad: " + user.getName() +
				" Soyad: " + user.getLastName() +
				" E-Mail: " + user.getEmail() +
				" Kurs: " + user.getCourses()
		);
	}
}
