package day3;

public class Instructors extends Users {
	
	private double salary;

	public Instructors() {
		super();
	}

	public Instructors(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
