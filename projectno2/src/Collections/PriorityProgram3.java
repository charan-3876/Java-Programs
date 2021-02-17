package Collections;
import java.util.*;
public class PriorityProgram3 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  PriorityQueue p1=new PriorityQueue();
	  int cos=0;
	  System.out.println("Enter the type of element: ");
	  System.out.println("Press 1 to enter integer...");
	  System.out.println("Press 2 to enter double...");
	  System.out.println("Press 3 to enter character...");
	  System.out.println("Press 4 to enter boolean...");
	  System.out.println("Press 5 to enter string...");
	  System.out.println("choose only one option because PQ allows only one type of option: ");
	  int choice=scan.nextInt();
	  if(choice==1)
	  {
	     do
	     {
	    	 System.out.println("Enter interger element: ");
	    	 p1.add(scan.nextInt());
	    	 System.out.println("Press 1 to continue or 0 to stop");
	    	 cos=scan.nextInt();
	     }while(cos==1);
      }
	  else if(choice==2)
	  {
	     do
	     {
	    	 System.out.println("Enter double element: ");
	    	 p1.add(scan.nextDouble());
	    	 System.out.println("Press 1 to continue or 0 to stop");
	    	 cos=scan.nextInt();
	     }while(cos==1);
      }
	  else if(choice==3)
	  {
	     do
	     {
	    	 System.out.println("Enter character element: ");
	    	 p1.add(scan.next().charAt(0));
	    	 System.out.println("Press 1 to continue or 0 to stop");
	    	 cos=scan.nextInt();
	     }while(cos==1);
      }
	  else if(choice==4)
	  {
	     do
	     {
	    	 System.out.println("Enter boolean element: ");
	    	 p1.add(scan.nextBoolean());
	    	 System.out.println("Press 1 to continue or 0 to stop");
	    	 cos=scan.nextInt();
	     }while(cos==1);
      }
	  else if(choice==5)
	  {
	     do
	     {
	    	 System.out.println("Enter string element: ");
	    	 p1.add(scan.next());
	    	 System.out.println("Press 1 to continue or 0 to stop");
	    	 cos=scan.nextInt();
	     }while(cos==1);
      }
	  else
	  {
		  System.out.println("Invalid choice......");
	  }
	  System.out.println("Priority queue elements are..........");
	 Iterator i1=p1.iterator();
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
  }
}
