package net.CustomedComponents.Controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class PickListBoxController {
	private List<String> leftValues;
	private List<String> leftItems;
	private List<String> rightValues;
	private List<String> rightItems;

	@PostConstruct
	public void init() {
		leftItems = new ArrayList<>();
		leftItems.add("BMW");
		leftItems.add("Audi");
		leftItems.add("Ford");
		leftItems.add("Chevrolet");
		leftItems.add("Dodge");
		leftItems.add("Falcon");
		leftItems.add("GMC");
		leftItems.add("Hennessey");
		leftItems.add("Lincoln");
		leftItems.add("Mercedes-Benz");
		leftItems.add("Porsche");
		leftItems.add("Volkswagen");

		rightItems = new ArrayList<>();
		rightItems.add("Toyota");
		rightItems.add("Tesla");
		rightItems.add("Honda");
		rightItems.add("Cadillac");
		rightItems.add("Faraday");
		rightItems.add("Jeep");
	}

	public void pushToRightSelected() {
		if (leftValues != null) {
			rightItems.addAll(leftValues);
			leftItems.removeAll(leftValues);
		}
	}

	public void pushToRightAll() {
		rightItems.addAll(leftItems);
		leftItems.clear();
	}

	public void pushToLeftSelected() {
		if (rightValues != null) {
			leftItems.addAll(rightValues);
			rightItems.removeAll(rightValues);
		}
	}

	public void pushToLeftAll() {
		leftItems.addAll(rightItems);
		rightItems.clear();
	}

	public List<String> getLeftValues() {
		return leftValues;
	}

	public void setLeftValues(List<String> leftValues) {
		this.leftValues = leftValues;
	}

	public List<String> getLeftItems() {
		return leftItems;
	}

	public void setLeftItems(List<String> leftItems) {
		this.leftItems = leftItems;
	}

	public List<String> getRightValues() {
		return rightValues;
	}

	public void setRightValues(List<String> rightValues) {
		this.rightValues = rightValues;
	}

	public List<String> getRightItems() {
		return rightItems;
	}

	public void setRightItems(List<String> rightItems) {
		this.rightItems = rightItems;
	}
}

