package Collections;
import java.util.PriorityQueue;
/*In priority queue it allows only homogenous elements.It depends on first elements.
 * i.e,if 1st element is string remaining all other elements inserted to queue must be string elements
 * or if 1st elements are double remaining all other elements must be double elements.....*/
import java.util.Scanner;
public class PriorityProgram1 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	PriorityQueue p1=new PriorityQueue();
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
			p1.add(ele);
		}
		else if(x==1)
		{
			System.out.println("Enter the element: ");
			double ele=scan.nextDouble();
			p1.add(ele);	
		}
		else if(x==2)
		{
			System.out.println("Enter the element: ");
			char ele=scan.next().charAt(0);
			p1.add(ele);
		}
		else if(x==3)
		{
			System.out.println("Enter the element: ");
			boolean ele=scan.nextBoolean();
			p1.add(ele);
		}
		else if(x==4)
		{
			System.out.println("Enter the element: ");
			String ele=scan.next();
			p1.add(ele);
		}
		System.out.println("Press y to continue or n to stop: ");
		s2=scan.next();
	}while(s2.equals("y"));
	System.out.println("The elements are: "+p1);
  }
}
