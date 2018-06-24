package net.CustomedComponents.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProgressController {
	private int progress;

	public void doProgress(){
		class ProgressThread extends Thread{
			@Override
			public void run() {
				while(progress<72){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					progress+=1;
				}
			}
		}

		ProgressThread pt = new ProgressThread();
		pt.start();
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}
}
