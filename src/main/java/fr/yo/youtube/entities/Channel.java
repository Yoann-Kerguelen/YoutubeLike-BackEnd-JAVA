package fr.yo.youtube.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Channel")
public class Channel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "youtuber_id")
	private long id;

	private String name;

	@OneToOne
	@MapsId
	@JoinColumn(name = "youtuber_id")
	private Youtuber youtuber;

	@OneToMany(mappedBy = "channel")
	private List<Video> videoList;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "channel_suscribers", joinColumns = @JoinColumn(name = "youtuber_id"), inverseJoinColumns = @JoinColumn(name = "suscriber_id"))
	private List<Suscriber> suscribers;

	public Channel() {
	}

	public Channel(long id, String name, Youtuber youtuber, List<Video> videoList, List<Suscriber> suscribers) {
		super();
		this.id = id;
		this.name = name;
		this.youtuber = youtuber;
		this.videoList = videoList;
		this.suscribers = suscribers;
	}

	public Channel(String name, Youtuber youtuber, List<Video> videoList, List<Suscriber> suscribers) {
		super();
		this.name = name;
		this.youtuber = youtuber;
		this.videoList = videoList;
		this.suscribers = suscribers;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Youtuber getYoutuber() {
		return youtuber;
	}

	public void setYoutuber(Youtuber youtuber) {
		this.youtuber = youtuber;
	}

	public List<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}

	public List<Suscriber> getSuscribers() {
		return suscribers;
	}

	public void setSuscribers(List<Suscriber> suscribers) {
		this.suscribers = suscribers;
	}

}
