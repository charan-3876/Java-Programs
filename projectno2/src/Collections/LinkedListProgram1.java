package Collections;
import java.util.*;
/*LinkedList
 * In Linkedlist heterogenous elements are allowed*/
public class LinkedListProgram1 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  LinkedList a1=new LinkedList();
	  a1.add(75);
	  a1.add(1.8);
	  a1.add('@');
	  a1.add(true);
	  a1.add("html");
	  int count=a1.size();
	  System.out.println("No.of elements is: "+count);
  }
}
