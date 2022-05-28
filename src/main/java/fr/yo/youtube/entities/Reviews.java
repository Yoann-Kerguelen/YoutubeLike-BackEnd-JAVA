package fr.yo.youtube.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Reviews")
public class Reviews implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String comment;

	private int rating;

	private Date reviewsDate;

	@ManyToOne
	@JoinColumn(name = "youtuber_id", nullable = false)
	private Youtuber youtuber;

	@ManyToOne
	@JoinColumn(name = "video_id", nullable = false)
	private Video video;

	public Reviews(String comment, int rating, Date reviewsDate, Youtuber youtuber, Video video) {
		super();
		this.comment = comment;
		this.rating = rating;
		this.reviewsDate = reviewsDate;
		this.youtuber = youtuber;
		this.video = video;
	}

}
