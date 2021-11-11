package day6.hrms.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message); // super() base sınıfını set eder.
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success); // super() base sınıfını set eder.
		this.data = data;
	}
	
	public T getData() {
		
		return this.data;
	}
}
