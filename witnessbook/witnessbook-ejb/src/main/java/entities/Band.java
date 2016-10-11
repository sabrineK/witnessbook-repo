package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Band
 *
 */
@Entity

public class Band extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String musicStyle;
	private Date creationDate;
	private Double fee;
	private String description;
	private Boolean isVerified;

	public Band() {
		super();
	}

	public Band(Integer id, String login, String password, String mail, String adress, String phone, String avatar,
			Boolean isActif, Boolean isBaned, String musicStyle, Date creationDate, Double fee, String description,
			Boolean isVerified) {
		super(login, password, mail, adress, phone, avatar, isActif, isBaned);
		this.musicStyle = musicStyle;
		this.creationDate = creationDate;
		this.fee = fee;
		this.description = description;
		this.isVerified = isVerified;

	}

	public String getMusicStyle() {
		return musicStyle;
	}

	public void setMusicStyle(String musicStyle) {
		this.musicStyle = musicStyle;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

}
