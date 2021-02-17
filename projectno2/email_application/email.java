package email_application;

import java.util.Scanner;

public class email
{
   private String firstName;
   private String lastName;
   private String password;
   private int defaultPasswordLength=10;
   private String emailName;
   private String companySuffix="truYum.com";
   private String department;
   private int mailBoxCapacity=500;
   private String alternateEmail;
   
   //constructor to receive first name and last name
   public email(String firstName,String lastName)
   {
	   this.firstName=firstName;
	   this.lastName=lastName;
	   System.out.println("Email Created: "+this.firstName+" "+this.lastName);
	   
	   //call a method asking for department- return department
	   this.department=getDepartment();
	   System.out.println("Department is: "+this.department);
	   
	   //call a method that return random password
	   this.password=randomPassword(defaultPasswordLength);
	   System.out.println("Password is: "+this.password);
	   
	   //combine elements to generate email
	   emailName=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	   System.out.println("Your email is: "+emailName);
   }
   //Ask for the department
   private String getDepartment()
   {
	   System.out.println("New Worker: "+firstName+"."+lastName+"\nDEPARTMENT CODES: \n1-for sales \n2-for development \n3-for Accounting \n0-for none\n Enter department code: ");
	   Scanner scanner=new Scanner(System.in);
	   int depChoice=scanner.nextInt();
	   if(depChoice==1)
	   {
		   return "sales";
	   }
	   else if(depChoice==2)
	   {
		   return "development";
	   }
	   else if(depChoice==3)
	   {
		   return "accounting";
	   }
	   else
	   {
		   return "";
	   }
   }
   //generate password
   private String randomPassword(int length)
   {
	   String passwordSet="abcdefghijklmnopqrstuvwxyz1234567890!@#";
	   char[] password=new char[length];
	   for(int i=0; i<length; i++)
	   {
		 int rand=(int)(Math.random()*passwordSet.length());
		 password[i]=passwordSet.charAt(rand);
	   }
	   return new String(password);
   }
   //set the mailbox capacity
   public void setMailCapacity(int capacity)
   {
	   this.mailBoxCapacity=capacity;
   }
   
   //set the alternate email
   public void setAlternatEmail(String altEmail)
   {
	   this.alternateEmail=altEmail;
   }
   
   //change the password
   public void changePassword(String password)
   {
	   this.password=password;
   }
   
   public int getMailBoxCapacity()
   {
	   return mailBoxCapacity;
   }
   public String getAlternateEmail()
   {
	   return alternateEmail;
   }
   public String getchangePassword()
   {
	   return password;
   }
   
   public String showInfo()
   {
	   return "Display Name:"+firstName+"."+lastName+" "+
              "\nCompany Email:"+emailName+" "+
			   "\nMailbox Capacity:"+mailBoxCapacity+"mb";
   }
}
