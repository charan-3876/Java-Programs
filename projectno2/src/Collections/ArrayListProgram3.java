package Collections;
import java.util.*;
public class ArrayListProgram3 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	ArrayList a=new ArrayList();
	int x=0;
	String s="";
	do
	{
		System.out.println("Enter the type of element: ");
		System.out.println("Press 0 to enter integer...");
		System.out.println("Press 1 to enter double...");
		System.out.println("Press 2 to enter character...");
		System.out.println("Press 3 to enter boolean...");
		System.out.println("Press 4 to enter string...");
		x=scan.nextInt();
		switch(x)
		{
		  case 0:
		  {
			System.out.println("Enter integer element: ");
			int ele=scan.nextInt();
			a.add(ele);
			break;
		  }
		  case 1:
		  {
			System.out.println("Enter double element: ");
			double ele=scan.nextDouble();
			a.add(ele);
			break;
		  }
		  case 2:
		  {
			System.out.println("Enter character element: ");
			char ele=scan.next().charAt(0);
			a.add(ele);
			break;
		  }
		  case 3:
		  {
			System.out.println("Enter boolean element: ");
			boolean ele=scan.nextBoolean();
			a.add(ele);
			break;
		  }
		  case 4:
		  {
			System.out.println("Enter string element: ");
			String ele=scan.next();
			a.add(ele);
			break;
		  }
		}
		System.out.println("Enter y to continue n to stop.......");
		s=scan.next();
	}
	while(s.equals("y"));
    System.out.println("The elements are: "+a);
  }
}
