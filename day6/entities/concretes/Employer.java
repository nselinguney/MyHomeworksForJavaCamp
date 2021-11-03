package day6.hrms.entities.concretes;

import lombok.Data;

@Data
public class Employer extends User {
	
	private int telefon;

	public Employer(String ad, String soyad, String ePosta, String sifre, String sifreTekrar, int telefon) {
		super(ad, soyad, ePosta, sifre, sifreTekrar);
		this.telefon = telefon;
	}
}
