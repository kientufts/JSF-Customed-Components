package net.CustomedComponents.Bean;

import java.util.Date;

public class DataScrollNews {
	private String title;
	private String body;
	private Date newsDate;

	public DataScrollNews(String title, String body, Date newsDate) {
		this.title = title;
		this.body = body;
		this.newsDate = newsDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}
}
