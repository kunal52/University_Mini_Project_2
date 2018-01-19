package main;

public class VideoStore {

	
	Video[] videos=new Video[10];
	
	public void addVideo(String title, boolean isCheckedOut, float aUserrating)
	{
		videos[videos.length]=new Video(title, isCheckedOut, aUserrating);
	}
	
	public void checkout(String title)
	{
		
		for(int i=0;i<videos.length;i++)
		{
			if(videos[i].getTitle().equals(title))
			{
				videos[i].isCheckedOut=true;
				return;
			}
		}
	}
	
	public void returnVideo(String titile)
	{
		for(int i=0;i<videos.length;i++)
		{
			if(videos[i].getTitle().equals(titile))
			{
				videos[i].isCheckedOut=false;
			}
		}
	}
	
	
	public float recieveRating(String title)
	{
		for(int i=0;i<videos.length;i++)
		{
			if(videos[i].getTitle().equals(title))
			{
				return videos[i].getaUserrating();
			}
		}
		return 0;
	}
	
	public void listInventory()
	{
		
		for(Video v:videos)
			System.out.println(v.getTitle()+"\t"+v.getaUserrating()+"\t"+v.isCheckedOut());
		
	}
	
}
