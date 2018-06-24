package net.CustomedComponents.Controller;

import net.CustomedComponents.Bean.AccordionElement;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class AccordionController {
	private List<AccordionElement> elements = null;

	@PostConstruct
	public void init(){
		elements = new ArrayList<>();
		elements.add(new AccordionElement("Title 1", "Body 1"));
		elements.add(new AccordionElement("Title 2", "Body 2"));
		elements.add(new AccordionElement("Title 3", "Body 3"));
		elements.add(new AccordionElement("Title 4", "Body 4"));
		elements.add(new AccordionElement("Title 5", "Body 5"));
		elements.add(new AccordionElement("Title 6", "Body 6"));
		elements.add(new AccordionElement("Title 7", "Body 7"));
		elements.add(new AccordionElement("Title 8", "Body 8"));
		elements.add(new AccordionElement("Title 9", "Body 9"));
		elements.add(new AccordionElement("Title 10", "Body 10"));
	}

	public List<AccordionElement> getElements() {
		return elements;
	}

	public void setElements(List<AccordionElement> elements) {
		this.elements = elements;
	}
}
