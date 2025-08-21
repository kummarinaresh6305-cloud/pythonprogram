import java.util.*;
public class employees {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String emp_ID = args[0];
	    String[][] emp_details = {
	    		{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
	    		{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
	    		{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
	    		{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
	    		{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
	    		{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
	    		{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
	    		};
	    String emp_name="";
	    String emp_dept="";
	    String emp_designation="";
	    int basic=0;
	    int HRA=0;
	    int IT=0;
	    int DA=0;
	    int c = 0;
	    for(int i=0 ; i < emp_details.length ; i++)
	    {
	    	if(emp_details[i][0].equals(emp_ID))
	    	{
	    		c = c + 1;
	            char d = emp_details[i][3].charAt(0);
	            emp_name = emp_details[i][1] ;
	    	    emp_dept = emp_details[i][4];
	    	    basic=Integer.parseInt(emp_details[i][5]);
	    	    HRA=Integer.parseInt(emp_details[i][6]);
	    	    IT=Integer.parseInt(emp_details[i][7]);
	            switch(d)
	            {
	                case 'e':
	                {
	        	        emp_designation = "Engineer";
	        	        DA = 20000;
	        	        break;
	                }
	                case 'c':
	                {
	        	        emp_designation = "Consultant";
	        	        DA = 32000;
	        	        break;
	                }
	                case 'k':
	                {
	        	        emp_designation = "Clerk";
	        	        DA = 12000;
	        	        break;
	                }
	                case 'r':
	                {
	        	        emp_designation = "Receptionist";
	        	        DA = 15000;
	        	        break;
	                }
	                case 'm':
	                {
	        	        emp_designation = "Manager";
	        	        DA = 20000;
	        	        break;
	               }
	           }
	    	}
	    }
	    int emp_sal= basic + HRA + DA -IT;
	    if(c==1)
	    {
	    	System.out.println("Emp No          : "+emp_ID);
	    	System.out.println("Emp Name        : "+emp_name);
	    	System.out.println("Emp Department  : "+emp_dept);
	    	System.out.println("Emp Designation : "+emp_designation);
	    	System.out.println("Emp Salary      : "+emp_sal);
	    }
	    else
	    {
	    	System.out.println("There is no employee with empid: "+emp_ID);
	    }
        sc.close();
	}
}
