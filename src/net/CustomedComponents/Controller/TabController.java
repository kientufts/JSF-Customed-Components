package net.CustomedComponents.Controller;

import net.CustomedComponents.Bean.Tab;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@SessionScoped
public class TabController {
	private List<Tab> tabs = null;
	private Tab selectedTab=null;

	@PostConstruct
	public void init(){
		if(tabs==null){
			tabs = new ArrayList<>();
		}
		tabs.add(new Tab("Java"));
		tabs.add(new Tab("PHP"));
		tabs.add(new Tab("Python"));
		tabs.add(new Tab("ASP.NET"));
		tabs.add(new Tab("Javascript"));

		if(selectedTab==null){
			selectedTab=tabs.get(0);
		}
	}

	public void doSelect(Tab t){
		selectedTab = t;
		selectedTab.setContent(t.getTitle()+ " <br/> Java Lorem ipsum <br/>"+new Date());
	}

	public List<Tab> getTabs() {
		return tabs;
	}

	public void setTabs(List<Tab> tabs) {
		this.tabs = tabs;
	}

	public Tab getSelectedTab() {
		return selectedTab;
	}

	public void setSelectedTab(Tab selectedTab) {
		this.selectedTab = selectedTab;
	}
}
