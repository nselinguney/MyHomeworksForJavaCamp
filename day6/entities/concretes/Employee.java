package day6.hrms.entities.concretes;

import lombok.Data;

@Data
public class Employee extends User {

	private String sirketAdı;
	private String webSitesi; 
	private int telefon;
	
	public Employee(String ad, String soyad, String ePosta, String sifre, String sifreTekrar, String sirketAdı,
			String webSitesi, int telefon) {
		super(ad, soyad, ePosta, sifre, sifreTekrar);
		this.sirketAdı = sirketAdı;
		this.webSitesi = webSitesi;
		this.telefon = telefon;
	}
}
