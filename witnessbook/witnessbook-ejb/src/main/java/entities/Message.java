package entities;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

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

	public Message() {
		super();
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
   
}
