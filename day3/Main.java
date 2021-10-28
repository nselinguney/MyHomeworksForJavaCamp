package day3;

public class Main {

	public static void main(String[] args) {
		
		Students student = new Students();
		student.setName("Selin");
		student.setLastName("Güney");
		student.setId(1);
		student.setEmail("selinguneylg@gmail.com");
		student.setSchool("Ankara Üniversitesi");
		student.setCourses("Java Kamp");
		
		Instructors instructor = new Instructors();
		instructor.setName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setId(2);
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setCourses("JavaKamp");
		instructor.setSalary(9500);
		
		
		UserManager userManager = new UserManager();
		
		userManager.displayUser(student);
		userManager.displayUser(instructor);
	}

}
