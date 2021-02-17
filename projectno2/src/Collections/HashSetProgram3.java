package Collections;
import java.util.*;
public class HashSetProgram3
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  TreeSet h1=new TreeSet();
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
		     h1.add(scan.nextInt());
		  }
		  else if(choice==2)
		  {
			 System.out.println("Enter double element: ");
		     h1.add(scan.nextDouble());
		  }
		  else if(choice==3)
		  {
			 System.out.println("Enter char element: ");
		     h1.add(scan.next().charAt(0));
		  }
		  else if(choice==4)
		  {
			 System.out.println("Enter boolean element: ");
		     h1.add(scan.nextBoolean());
		  }
		  else if(choice==5)
		  {
			 System.out.println("Enter string element: ");
		     h1.add(scan.next());
		  }
		  else
		  {
			  System.out.println("Invalid number....");
		  }
		  System.out.println("Press 1 to continue or 0 to stop");
		  cos=scan.nextInt();
	  }while(cos==1);
	 System.out.println("HashSet elements are.........."+h1.get(0));
	 
  }
}
