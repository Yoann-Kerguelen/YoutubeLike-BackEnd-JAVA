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

@Entity
@Table(name = "Video")
public class Video implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String title;

	private int duration; // in second

	private String url;

	@Column(columnDefinition="TEXT")
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

	public Video() {
	}

	public Video(long id, String title, int duration, String url, String description, long likes, long dislikes,
			long views, Date uploadedDate, Channel channel, Category category, List<Reviews> reviews) {
		super();
		this.id = id;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getLikes() {
		return likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	public long getDislikes() {
		return dislikes;
	}

	public void setDislikes(long dislikes) {
		this.dislikes = dislikes;
	}

	public long getViews() {
		return views;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public Date getUploadedDate() {
		return uploadedDate;
	}

	public void setUploadedDate(Date uploadedDate) {
		this.uploadedDate = uploadedDate;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}

}
