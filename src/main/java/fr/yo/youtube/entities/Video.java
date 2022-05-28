package fr.yo.youtube.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Video")
public class Video implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String title;

	private int duration; // in second

	private String url;

	@Column(columnDefinition = "TEXT")
	@Lob
	private String description;

	private long likes;

	private long dislikes;

	private long views;

	private Date uploadedDate;

	@ManyToOne
	@JoinColumn(name = "youtuber_id", nullable = false)
	private Channel channel;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	@OneToMany(mappedBy = "video")
	private List<Reviews> reviews;

	public Video(String title, int duration, String url, String description, long likes, long dislikes, long views,
			Date uploadedDate, Channel channel, Category category, List<Reviews> reviews) {
		super();
		this.title = title;
		this.duration = duration;
		this.url = url;
		this.description = description;
		this.likes = likes;
		this.dislikes = dislikes;
		this.views = views;
		this.uploadedDate = uploadedDate;
		this.channel = channel;
		this.category = category;
		this.reviews = reviews;
	}

}
