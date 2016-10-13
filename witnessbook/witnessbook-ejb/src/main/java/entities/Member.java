package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity

public class Member extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private Date birthDate;

	public Member() {
		super();
		followingBands = new ArrayList<User>();
		challenges = new ArrayList<Challenge>();
		tickets = new ArrayList<>();

	}

	public Member(Integer id, String login, String password, String mail, String adress, String phone, String avatar,
			Boolean isActif, Boolean isBaned, String firstName, String lastName, Date birthDate) {
		super(id, login, password, mail, adress, phone, avatar, isActif, isBaned);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public ArrayList<User> getFollowingBands() {
		return followingBands;
	}

	public void setFollowingBands(ArrayList<User> followingBands) {
		this.followingBands = followingBands;
	}

	public ArrayList<Challenge> getChallenges() {
		return challenges;
	}

	public void setChallenges(ArrayList<Challenge> challenges) {
		this.challenges = challenges;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

}
