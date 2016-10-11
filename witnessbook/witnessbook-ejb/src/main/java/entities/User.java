package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String login;
	private String password;
	private String mail;
	private String adress;
	private String phone;
	private String avatar;
	private Boolean isActif;
	private Boolean isBaned;
	
	public User() {
		super();
	}

	public User(String login, String password, String mail, String adress, String phone, String avatar,
			Boolean isActif, Boolean isBaned) {
		super();
		this.login = login;
		this.password = password;
		this.mail = mail;
		this.adress = adress;
		this.phone = phone;
		this.avatar = avatar;
		this.isActif = isActif;
		this.isBaned = isBaned;
	}

	public User(Integer id, String login, String password, String mail, String adress, String phone, String avatar,
			Boolean isActif, Boolean isBaned) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.mail = mail;
		this.adress = adress;
		this.phone = phone;
		this.avatar = avatar;
		this.isActif = isActif;
		this.isBaned = isBaned;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Boolean getIsActif() {
		return isActif;
	}

	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}

	public Boolean getIsBaned() {
		return isBaned;
	}

	public void setIsBaned(Boolean isBaned) {
		this.isBaned = isBaned;
	}

	

	
}
