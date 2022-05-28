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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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

	public Channel(String name, Youtuber youtuber, List<Video> videoList, List<Suscriber> suscribers) {
		super();
		this.name = name;
		this.youtuber = youtuber;
		this.videoList = videoList;
		this.suscribers = suscribers;
	}

}
