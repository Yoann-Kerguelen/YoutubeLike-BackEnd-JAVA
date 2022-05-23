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

@Entity
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

	public Reviews() {
	}

	public Reviews(long id, String comment, int rating, Date reviewsDate, Youtuber youtuber, Video video) {
		super();
		this.id = id;
		this.comment = comment;
		this.rating = rating;
		this.reviewsDate = reviewsDate;
		this.youtuber = youtuber;
		this.video = video;
	}

	public Reviews(String comment, int rating, Date reviewsDate, Youtuber youtuber, Video video) {
		super();
		this.comment = comment;
		this.rating = rating;
		this.reviewsDate = reviewsDate;
		this.youtuber = youtuber;
		this.video = video;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Date getReviewsDate() {
		return reviewsDate;
	}

	public void setReviewsDate(Date reviewsDate) {
		this.reviewsDate = reviewsDate;
	}

	public Youtuber getYoutuber() {
		return youtuber;
	}

	public void setYoutuber(Youtuber youtuber) {
		this.youtuber = youtuber;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
