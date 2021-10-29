package day4homework3.entities;

import java.time.LocalDate;

public class Campaigns {

	private int id;
	private String name;
	private String conditions;
	private LocalDate startDate;
	private LocalDate finishDate;
	
	public Campaigns(int id, String name, String conditions, LocalDate startDate, LocalDate finishDate) {
		super();
		this.id = id;
		this.name = name;
		this.conditions = conditions;
		this.startDate = startDate;
		this.finishDate = finishDate;
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

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	
	
	

}
