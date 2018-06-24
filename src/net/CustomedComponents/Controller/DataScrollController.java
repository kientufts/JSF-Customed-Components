package net.CustomedComponents.Controller;

import net.CustomedComponents.Bean.DataScrollNews;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@SessionScoped
public class DataScrollController {
	private List<DataScrollNews> news= null;

	@PostConstruct
	public void init(){
		news = new ArrayList<>();
		for(int i = 0; i<20; i++){
			news.add(new DataScrollNews("Title "+news.size(), "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", new Date()));
		}
	}

	public void loadData(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i<5; i++){
			news.add(new DataScrollNews("Title "+news.size(), "Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum", new Date()));
		}
	}

	public List<DataScrollNews> getNews() {
		return news;
	}

	public void setNews(List<DataScrollNews> news) {
		this.news = news;
	}
}
