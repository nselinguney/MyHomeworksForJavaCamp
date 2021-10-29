package day4homework3.entities;

public class Games {

	private int id;
	private String name;
	private double price;
	private String detail;
	
	public Games(int id, String name, double price, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
}
