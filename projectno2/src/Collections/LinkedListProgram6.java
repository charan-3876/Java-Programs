package Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListProgram6 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  LinkedList l1=new LinkedList();
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
	  System.out.println("Linked list elements are....");
	  for(int i=0;i<=l1.size()-1;i++)
	  {
		  System.out.println(l1.get(i)+" @ index: "+i);
	  }
	  System.out.println("Enter index number to update an element: ");
	  int index=scan.nextInt();

	  System.out.println("Enter the type of element to update: ");
	  System.out.println("Press 1 to enter integer to update...");
	  System.out.println("Press 2 to enter double to update...");
	  System.out.println("Press 3 to enter character to update...");
	  System.out.println("Press 4 to enter boolean to update...");
	  System.out.println("Press 5 to enter string to update...");
	  System.out.println("Enter your choice to update....");
	  int choice=scan.nextInt();
	  if(choice==1)
	  {
		 System.out.println("Enter interger element: ");
	     l1.set(index,scan.nextInt());
	  }
	  else if(choice==2)
	  {
		 System.out.println("Enter double element: ");
	     l1.set(index,scan.nextDouble());
	  }
	  else if(choice==3)
	  {
		 System.out.println("Enter char element: ");
	     l1.set(index,scan.next().charAt(0));
	  }
	  else if(choice==4)
	  {
		 System.out.println("Enter boolean element: ");
	     l1.set(index,scan.nextBoolean());
	  }
	  else if(choice==5)
	  {
		 System.out.println("Enter string element: ");
	     l1.set(index,scan.next());
	  }
	  else
	  {
		  System.out.println("Invalid number....");
	  }
	  System.out.println("Updated Linked list elements are....");
	  for(int i=0;i<=l1.size()-1;i++)
	  {
		  System.out.println(l1.get(i)+" @ index: "+i);
	  }
  }
}
