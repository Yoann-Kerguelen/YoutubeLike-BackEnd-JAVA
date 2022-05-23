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

@Entity
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

	@OneToMany(mappedBy = "youtuber")
	private List<Reviews> reviewsList;

	public Youtuber() {
	}

	public Youtuber(long id, String username, String email, String password, boolean isAdmin, Date registerDate,
			Date lastLogin, Channel channel, Suscriber suscriber, List<Reviews> reviewsList) {
		super();
		this.id = id;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Suscriber getSuscriber() {
		return suscriber;
	}

	public void setSuscriber(Suscriber suscriber) {
		this.suscriber = suscriber;
	}

	public List<Reviews> getReviewsList() {
		return reviewsList;
	}

	public void setReviewsList(List<Reviews> reviewsList) {
		this.reviewsList = reviewsList;
	}

}
