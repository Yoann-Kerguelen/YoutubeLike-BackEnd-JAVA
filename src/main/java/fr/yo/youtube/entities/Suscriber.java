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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
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

	public Suscriber(Youtuber youtuber, List<Channel> channelsSubscriptions) {
		super();
		this.youtuber = youtuber;
		this.channelsSubscriptions = channelsSubscriptions;
	}

}
