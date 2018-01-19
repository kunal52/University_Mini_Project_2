package main;

public class Video {

	
	String title;
	boolean isCheckedOut;
	float aUserrating;
	
	
	public Video(String title, boolean isCheckedOut, float aUserrating) {
		this.title = title;
		this.isCheckedOut = isCheckedOut;
		this.aUserrating = aUserrating;
	}
	public String getTitle() {
		return title;
	}
	public boolean isCheckedOut() {
		return isCheckedOut;
	}
	public float getaUserrating() {
		return aUserrating;
	}
	
}
