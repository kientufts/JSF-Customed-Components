package net.CustomedComponents.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PopupController {
	private boolean showPopup;

	public void show(){
		showPopup=true;
	}

	public void hide(){
		showPopup =false;
	}

	public boolean isShowPopup() {
		return showPopup;
	}

	public void setShowPopup(boolean showPopup) {
		this.showPopup = showPopup;
	}
}
