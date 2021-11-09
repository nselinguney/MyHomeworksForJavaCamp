package day6.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidates")
public class Candidate extends User {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String ad;
	
	@Column(name="last_name")
	private String soyad;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_year")
	private int birthYear;
	
	public Candidate(int id, String ad, String soyad, String identityNumber, int birthYear) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
	}
}
