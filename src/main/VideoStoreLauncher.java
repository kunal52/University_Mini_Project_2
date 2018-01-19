package main;

public class VideoStoreLauncher {

	
	public static void main(String []a)
	{
		
		VideoStore videoStoreLauncher=new VideoStore();
		videoStoreLauncher.addVideo("The Matrix", false, 3.4f);
		videoStoreLauncher.addVideo("Godfather 2", false, 4.4f);
		videoStoreLauncher.addVideo("Star Wars", false, 2.4f);
		
		videoStoreLauncher.listInventory();
		
	}
	
}
