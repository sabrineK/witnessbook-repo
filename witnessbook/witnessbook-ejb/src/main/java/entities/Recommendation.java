package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Recommendation
 *
 */
@Entity

public class Recommendation implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date dateRecommendation;
	@ManyToOne
	private User sender;
	@ManyToOne
	private ArrayList<String> mailingList;

	


	public Recommendation() {
		super();
	}

	public Recommendation(Integer id, Date dateRecommendation) {
		super();
		this.id = id;
		this.dateRecommendation = dateRecommendation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateRecommendation() {
		return dateRecommendation;
	}

	public void setDateRecommendation(Date dateRecommendation) {
		this.dateRecommendation = dateRecommendation;
	}

	
	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public ArrayList<String> getMailingList() {
		return mailingList;
	}

	public void setMailingList(ArrayList<String> mailingList) {
		this.mailingList = mailingList;
	}
}
