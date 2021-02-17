package Collections;
import java.util.*;
public class ArrayListProgram2 
{
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  ArrayList a1=new ArrayList();
	  int x=0;
	  String s2="";
	  do
	  {
		System.out.println("Enter the type of element: ");
		System.out.println("Press 0 to enter integer...");
		System.out.println("Press 1 to enter double...");
		System.out.println("Press 2 to enter character...");
		System.out.println("Press 3 to enter boolean...");
		System.out.println("Press 4 to enter string...");
		x=scan.nextInt();
		if(x==0)
		{
			System.out.println("Enter the element: ");
			int ele=scan.nextInt();
			a1.add(ele);
		}
		else if(x==1)
		{
			System.out.println("Enter the element: ");
			double ele=scan.nextDouble();
			a1.add(ele);	
		}
		else if(x==2)
		{
			System.out.println("Enter the element: ");
			char ele=scan.next().charAt(0);
			a1.add(ele);
		}
		else if(x==3)
		{
			System.out.println("Enter the element: ");
			boolean ele=scan.nextBoolean();
			a1.add(ele);
		}
		else if(x==4)
		{
			System.out.println("Enter the element: ");
			String ele=scan.next();
			a1.add(ele);
		}
		System.out.println("Press y to continue or n to stop: ");
		s2=scan.next();
      }
	  while(s2.contentEquals("y"));
	  System.out.println("The elements are: "+a1);
  }
}  
