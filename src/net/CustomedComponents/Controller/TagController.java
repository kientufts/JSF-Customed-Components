package net.CustomedComponents.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class TagController {
	private String inputTag;
	private List<String> tags;

	@PostConstruct
	public void init(){
		if(tags==null){
			tags = new ArrayList<>();
		}
	}

	public void splitTag(){
		String[] tagArray = inputTag.split(",");
		inputTag="";
		for(String singleTag :tagArray){
			tags.add(singleTag);
		}
	}

	public void removeTag(String tag){
		tags.remove(tag);
	}

	public String getInputTag() {
		return inputTag;
	}

	public void setInputTag(String inputTag) {
		this.inputTag = inputTag;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
