package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Attachement
 *
 */
@Entity

public class Attachement implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private TypeMedia typeMedia;
	private Byte file;

	public Attachement() {
		super();
	}

	public Attachement(Byte media) {
		super();
		this.file = media;
	}

	public Byte getMedia() {
		return file;
	}

	public void setMedia(Byte media) {
		this.file = media;
	}

	public TypeMedia getTypeMedia() {
		return typeMedia;
	}

	public void setTypeMedia(TypeMedia typeMedia) {
		this.typeMedia = typeMedia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
