package fr.yo.youtube.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "Youtuber")
public class Youtuber implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String username;

	private String email;

	private String password;

	private boolean isAdmin;

	private Date registerDate;

	private Date lastLogin;

	@OneToOne(mappedBy = "youtuber", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Channel channel;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "suscriber_id")
	private Suscriber suscriber;

	@OneToMany(mappedBy = "youtuber", orphanRemoval = true)
	private List<Reviews> reviewsList;

	public Youtuber(String username, String email, String password, boolean isAdmin, Date registerDate, Date lastLogin,
			Channel channel, Suscriber suscriber, List<Reviews> reviewsList) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.isAdmin = isAdmin;
		this.registerDate = registerDate;
		this.lastLogin = lastLogin;
		this.channel = channel;
		this.suscriber = suscriber;
		this.reviewsList = reviewsList;
	}

}
