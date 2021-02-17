package Collections;
import java.util.*;
/*duplicates are not allowed and prints in alphabetical order*/
public class TreeSetProgram2 
{
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
		TreeSet h1=new TreeSet();
		int cos=0;
		do
		{
		  System.out.println("Enter the element: ");
		  char ele=scan.next().charAt(0);
		  h1.add(ele);
		  System.out.println("Enter 1 to continue or 0 to stop: ");
		  cos=scan.nextInt();
		}while(cos==1);
		System.out.println("The hash set elements are: ");
		System.out.println(h1); 
  }
}
