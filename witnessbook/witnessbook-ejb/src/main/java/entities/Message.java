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

/**
 * Entity implementation class for Entity: Message
 *
 */
@Entity
public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String content;
	private Date msgDate;
	private Boolean seen;
	@ManyToOne
	private User sender;
	@OneToMany
	private ArrayList<User> recipients;

	public Message() {
		super();
		recipients = new ArrayList<>();
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMsgDate() {
		return this.msgDate;
	}

	public void setMsgDate(Date msgDate) {
		this.msgDate = msgDate;
	}

	public Boolean getSeen() {
		return this.seen;
	}

	public void setSeen(Boolean seen) {
		this.seen = seen;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public ArrayList<User> getRecipients() {
		return recipients;
	}

	public void setRecipients(ArrayList<User> recipients) {
		this.recipients = recipients;
	}

}
