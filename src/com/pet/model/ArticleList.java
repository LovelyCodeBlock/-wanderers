package com.pet.model;

import java.util.Date;

/**
 * ����
 * @author Cedo
 *
 */
public class ArticleList {

	private int id;
	private String title;
	private String publisher;
	private int comments;
	private String summary;
	private Date time;
	public ArticleList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArticleList(String title, String publisher, int comments,
			String summary) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.comments = comments;
		this.summary = summary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
