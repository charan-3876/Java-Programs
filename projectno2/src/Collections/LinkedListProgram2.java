package Collections;
import java.util.*;
/*Linked list storing integer elements*/
public class LinkedListProgram2 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  LinkedList l1=new LinkedList();
	  int continueOrStop=0;
	  do
	  {
		  System.out.println("Enter the element: ");
		  int ele=scan.nextInt();
		  l1.add(ele);
		  System.out.println("Press 1 to continue...");
		  System.out.println("press 0 to stop.....");
		  continueOrStop=scan.nextInt();
	  }
	  while(continueOrStop==1);
	  System.out.println("The elements are: "+l1);
  }
}
