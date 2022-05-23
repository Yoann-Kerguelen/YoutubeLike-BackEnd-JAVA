package fr.yo.youtube.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String denominate;

	@OneToMany(mappedBy = "category")
	private List<Video> videoList;

	public Category() {
	}

	public Category(long id, String denominate, List<Video> videoList) {
		super();
		this.id = id;
		this.denominate = denominate;
		this.videoList = videoList;
	}

	public Category(String denominate, List<Video> videoList) {
		super();
		this.denominate = denominate;
		this.videoList = videoList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDenominate() {
		return denominate;
	}

	public void setDenominate(String denominate) {
		this.denominate = denominate;
	}

	public List<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}

}
