package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private Date creationDate;
	private Date expirationDate;
	private Integer placesNumber;
	
	@ManyToOne
	private User customer;
	@ManyToOne
	private User band;
	@OneToMany
	private ArrayList<Ticket> tickets;

	public Event(String description, Date creationDate, Date expirationDate, Integer placesNumber) {
		super();
		this.description = description;
		this.creationDate = creationDate;
		this.expirationDate = expirationDate;
		this.placesNumber = placesNumber;
	}

	public Event() {
		super();
		tickets = new ArrayList<Ticket>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Integer getPlacesNumber() {
		return placesNumber;
	}

	public void setPlacesNumber(Integer placesNumber) {
		this.placesNumber = placesNumber;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public User getBand() {
		return band;
	}

	public void setBand(User band) {
		this.band = band;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

}
