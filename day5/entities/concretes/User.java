package day5.entities.concretes;

import day5.entities.abstracts.Entity;

public class User implements Entity {

	private String ad;
	private String soyad;
	private String email;
	private String parola;
	
	public User(String ad, String soyad, String email, String parola) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
		this.parola = parola;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	
}
