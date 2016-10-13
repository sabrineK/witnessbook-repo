package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: MarkBand
 *
 */
@Entity

public class MarkBand implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Float markCounter;
	@ManyToOne
	private User member;
	@ManyToOne
	private User band;

	public MarkBand() {
		super();
	}

	public MarkBand(Integer id, Float markCounter) {
		super();
		this.id = id;
		this.markCounter = markCounter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getMarkCounter() {
		return markCounter;
	}

	public void setMarkCounter(Float markCounter) {
		this.markCounter = markCounter;
	}

	public User getMember() {
		return member;
	}

	public void setMember(User member) {
		this.member = member;
	}

	public User getBand() {
		return band;
	}

	public void setBand(User band) {
		this.band = band;
	}

}
