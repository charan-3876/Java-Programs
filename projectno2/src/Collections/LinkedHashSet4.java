package Collections;
import java.util.*;
public class LinkedHashSet4 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	LinkedHashSet l1=new LinkedHashSet();
	LinkedHashSet l2=new LinkedHashSet();
	int cos=0;
	 do
	  {
		  System.out.println("Enter the type of element: ");
		  System.out.println("Press 1 to enter integer...");
		  System.out.println("Press 2 to enter double...");
		  System.out.println("Press 3 to enter character...");
		  System.out.println("Press 4 to enter boolean...");
		  System.out.println("Press 5 to enter string...");
		  System.out.println("Enter your choice....");
		  int choice=scan.nextInt();
		  if(choice==1)
		  {
			 System.out.println("Enter interger element: ");
		     l1.add(scan.nextInt());
		  }
		  else if(choice==2)
		  {
			 System.out.println("Enter double element: ");
		     l1.add(scan.nextDouble());
		  }
		  else if(choice==3)
		  {
			 System.out.println("Enter char element: ");
		     l1.add(scan.next().charAt(0));
		  }
		  else if(choice==4)
		  {
			 System.out.println("Enter boolean element: ");
		     l1.add(scan.nextBoolean());
		  }
		  else if(choice==5)
		  {
			 System.out.println("Enter string element: ");
		     l1.add(scan.next());
		  }
		  else
		  {
			  System.out.println("Invalid number....");
		  }
		  System.out.println("Press 1 to continue or 0 to stop");
		  cos=scan.nextInt();
	  }while(cos==1);
  }
}
