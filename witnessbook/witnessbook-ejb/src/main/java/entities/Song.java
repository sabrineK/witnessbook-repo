package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Song
 *
 */
@Entity

public class Song implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Date creationDate;
	private Float rate;
	private Integer played;
	@OneToOne(mappedBy="song")
	private Attachement track;

	public Song(Integer id, String name, Date creationDate, Float rate, Integer played, Attachement track) {
		super();
		this.id = id;
		this.name = name;
		this.creationDate = creationDate;
		this.rate = rate;
		this.played = played;
		this.track = track;
	}

	public Song() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Integer getPlayed() {
		return played;
	}

	public void setPlayed(Integer played) {
		this.played = played;
	}

	public Attachement getTrack() {
		return track;
	}

	public void setTrack(Attachement track) {
		this.track = track;
	}

}
