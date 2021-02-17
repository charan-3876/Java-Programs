package Collections;
import java.util.*;
/*Duplicate elements are not allowed but allows heterogenous elements*/
public class LinkedHashSetProgram1
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	LinkedHashSet h1=new LinkedHashSet();
	int cos=0;
	do
	{
		System.out.println("Enter the type of element: ");
		System.out.println("Press 1 to enter integer...");
		System.out.println("Press 2 to enter double...");
		System.out.println("Press 3 to enter character...");
		System.out.println("Press 4 to enter boolean...");
		System.out.println("Press 5 to enter string...");
		cos=scan.nextInt();
		if(cos==1)
		{
			System.out.println("Enter the element: ");
			int ele=scan.nextInt();
			h1.add(ele);
		}
		else if(cos==2)
		{
			System.out.println("Enter the element: ");
			double ele=scan.nextDouble();
			h1.add(ele);	
		}
		else if(cos==3)
		{
			System.out.println("Enter the element: ");
			char ele=scan.next().charAt(0);
			h1.add(ele);
		}
		else if(cos==4)
		{
			System.out.println("Enter the element: ");
			boolean ele=scan.nextBoolean();
			h1.add(ele);
		}
		else if(cos==5)
		{
			System.out.println("Enter the element: ");
			String ele=scan.next();
			h1.add(ele);
		}
		else
		{
			System.out.println("Invalid number....");
		}
		System.out.println("Enter 1 to continue or 0 to stop: ");
		cos=scan.nextInt();
	}while(cos==1);
	System.out.println("The linkedHashSet elements are: ");
	System.out.println(h1);
  }
}
