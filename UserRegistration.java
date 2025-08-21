import java.util.*;
class InvalidCountryException extends Exception
{
	InvalidCountryException(String a)
	{
		super(a);
	}
}
class StudentRegistration
{
	void Country(String country) throws InvalidCountryException
	{
		if(country.equalsIgnoreCase("india"))
		{
			System.out.println("User Registration done successfully");
		}
		else
		{
			throw new InvalidCountryException("User outside India cannot be registered");
		}
	}
}
public class UserRegistration{
     public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your country name: ");
		String country = sc.nextLine();
		StudentRegistration sr = new StudentRegistration();
		try {
			sr.Country(country);
			System.out.println("name: "+name);
		} catch (InvalidCountryException e) {
		    System.err.println(e.getMessage());
		}
		sc.close();
	}
}
