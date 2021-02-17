package CollectionsAssignment;
import java.util.*;
public class Program5
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	TreeSet t1=new TreeSet();
	int cos=0;
	do
	{
	  System.out.println("Enter the integer elements: ");
	  int ele=scan.nextInt();
	  t1.add(ele);
	  System.out.println("Press 1 to continue or 0 to stop: ");
	  cos=scan.nextInt();
	}while(cos==1);
	Iterator i1=t1.descendingIterator();
	System.out.println("The treeset elements are: ");
	while(i1.hasNext())
	{
		System.out.println(i1.next()+" ");
	}
  }
}
