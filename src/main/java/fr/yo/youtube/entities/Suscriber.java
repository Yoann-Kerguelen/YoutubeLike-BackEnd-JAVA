package fr.yo.youtube.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Suscriber")
public class Suscriber implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(mappedBy = "suscriber")
	private Youtuber youtuber;

	@ManyToMany(mappedBy = "suscribers")
	private List<Channel> channelsSubscriptions;

	public Suscriber() {
	}

	public Suscriber(long id, Youtuber youtuber, List<Channel> channelsSubscriptions) {
		super();
		this.id = id;
		this.youtuber = youtuber;
		this.channelsSubscriptions = channelsSubscriptions;
	}

	public Suscriber(Youtuber youtuber, List<Channel> channelsSubscriptions) {
		super();
		this.youtuber = youtuber;
		this.channelsSubscriptions = channelsSubscriptions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Youtuber getYoutuber() {
		return youtuber;
	}

	public void setYoutuber(Youtuber youtuber) {
		this.youtuber = youtuber;
	}

	public List<Channel> getChannelsSubscriptions() {
		return channelsSubscriptions;
	}

	public void setChannelsSubscriptions(List<Channel> channelsSubscriptions) {
		this.channelsSubscriptions = channelsSubscriptions;
	}

}
