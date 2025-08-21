public class VideoStore {
    Video[] Store = new Video[100];
	int count = 0;
	public void addVideo(String name)
	{
		Store[count] = new Video(name);
		count++;
		System.out.println("video " + name +" added successfully.");
	}
	public void doCheckout(String name)
	{
		for(int i=0 ; i < count ; i++)
		{
			if(Store[i].getName().equalsIgnoreCase(name))
			{
				Store[i].doCheckout();
				System.out.println("video "+name+" checked out successfully.");
				return;
			}

				
		}
		System.out.println("video not found");
	}
	public void doReturn(String name)
	{
		for(int i=0 ; i < count ; i++)
		{
			if(Store[i].getName().equalsIgnoreCase(name))
			{
				Store[i].doReturn();
				System.out.println("video "+name+" returned successfully.");
				return;
			}
			else
				System.out.println("video not found");
		}
	}
	public void receiveRating(String name,int rating)
	{
		for(int i=0 ; i< count ; i++)
		{
			if(Store[i].getName().equalsIgnoreCase(name))
			{
				Store[i].receiveRating(rating);
				System.out.println("rating "+rating+" has been mapped to the Video "+name);
				return;
			}
		}
		System.out.println("video not found");
		
	}
	public void invitory()
	{
		System.out.println("Video Name | checkout status | rating");
		for(int i=0 ; i< count ; i++)
		{
			System.out.println("---------------------------------------");
			System.out.println(Store[i].getName()+"   |  "+Store[i].getCheckout()+"   | "+Store[i].getRating());			
		}
		System.out.println("-------------------------------------------");
	}
	

}
