import java.util.*;
public class VideoLauncher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoStore v = new VideoStore();
		int i;
		String s;
		do
		{
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1:Add Videos");
			System.out.println("2:Check out Video");
			System.out.println("3:Return Video");
			System.out.println("4: Rating");
			System.out.println("5:List Inventory");
			System.out.println("6:Exit");
			System.out.print("Enter your choice : ");
			i = sc.nextInt();
			System.out.println("  ");
			switch(i)
			{
			case 1:
				System.out.print("Enter the name of the video you want to add : ");
				s = sc.next();
				v.addVideo(s);
				break;
			case 2:
				System.out.print("Enter the name of the video you want to check out : ");
				s = sc.next();
				v.doCheckout(s);
				break;
			case 3:
				System.out.print("Enter the name of the video you want to return : ");
				s = sc.next();
				v.doReturn(s);
				break;
			case 4:
				System.out.println("Enter the name of the video you want to rate : ");
				s = sc.next();
				System.out.println("Enter the rating for this video : ");
				int j = sc.nextInt();
				v.receiveRating(s, j);
				break;
			case 5:
				v.invitory();
				break;
			case 6:
				System.out.print("Exiting...!! Thanks for using the application.");
			}
		}while(i!=6);
        sc.close();
	}
}

