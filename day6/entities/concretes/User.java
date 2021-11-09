package day6.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

	private String ad;
	private String soyad;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "email")
	private String ePosta;

	@Column(name = "sifre")
	private String sifre;

	@Column(name = "sifre_tekrar")
	private String sifreTekrar;

	public User() {
		super();
	}

	public User(String ad, String soyad, String ePosta, String sifre, String sifreTekrar) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.ePosta = ePosta;
		this.sifre = sifre;
		this.sifreTekrar = sifreTekrar;
	}

}
