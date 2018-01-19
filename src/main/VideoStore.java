package main;

public class VideoStore {

	int total=0;
	Video[] videos=new Video[10];
	
	public void addVideo(String title, boolean isCheckedOut, float aUserrating)
	{
		
		videos[total]=new Video(title, isCheckedOut, aUserrating);
		total++;
	}
	
	public void checkout(String title)
	{
		
		for(int i=0;i<total;i++)
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
		for(int i=0;i<=total;i++)
		{
			if(videos[i].getTitle().equals(titile))
			{
				videos[i].isCheckedOut=false;
			}
		}
	}
	
	
	public float recieveRating(String title)
	{
		for(int i=0;i<=total;i++)
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
		
		for(int i=0;i<total;i++)
			System.out.println(videos[i].getTitle()+"\t"+videos[i].getaUserrating()+"\t"+videos[i].isCheckedOut());
		
	}
	
}
