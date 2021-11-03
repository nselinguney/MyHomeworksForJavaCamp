package day6.hrms.entities.concretes;

import lombok.Data;

@Data
public class Candidate extends User {
	
	private int tcNo;
	private int dogumYılı;
	
	public Candidate(String ad, String soyad, String ePosta, String sifre, String sifreTekrar, int tcNo,
			int dogumYılı) {
		super(ad, soyad, ePosta, sifre, sifreTekrar);
		this.tcNo = tcNo;
		this.dogumYılı = dogumYılı;
	}
}
