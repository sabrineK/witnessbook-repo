package entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String customerName;
	private String activity;
	private String commercialRegister;

	public Customer() {
		super();
		hiringRequests = new ArrayList<HiringRequest>();
		followingBands = new ArrayList<User>();
		offers = new ArrayList<>();
	}

	public Customer(Integer id, String login, String password, String mail, String adress, String phone, String avatar,
			Boolean isActif, Boolean isBaned, String customerName, String activity, String commercialRegister) {
		super(login, password, mail, adress, phone, avatar, isActif, isBaned);
		this.customerName = customerName;
		;
		this.activity = activity;
		this.commercialRegister = commercialRegister;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getCommercialRegister() {
		return commercialRegister;
	}

	public void setCommercialRegister(String commercialRegister) {
		this.commercialRegister = commercialRegister;
	}

	public ArrayList<User> getFollowingBands() {
		return followingBands;
	}

	public void setFollowingBands(ArrayList<User> followingBands) {
		this.followingBands = followingBands;
	}

	public ArrayList<HiringRequest> getHiringRequests() {
		return hiringRequests;
	}

	public void setHiringRequests(ArrayList<HiringRequest> hiringRequests) {
		this.hiringRequests = hiringRequests;
	}

	public ArrayList<Offer> getOffers() {
		return offers;
	}

	public void setOffers(ArrayList<Offer> offers) {
		this.offers = offers;
	}

}
