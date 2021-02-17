package Collections;
import java.util.*;
/*hash set duplicates are not allowed*/
public class HashsetProgram2 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	HashSet h1=new HashSet();
	int cos=0;
	do
	{
	  System.out.println("Enter the element: ");
	  int ele=scan.nextInt();
	  h1.add(ele);
	  System.out.println("Enter 1 to continue or 0 to stop: ");
	  cos=scan.nextInt();
	}while(cos==1);
	System.out.println("The hash set elements are: ");
	System.out.println(h1);
  }
}
