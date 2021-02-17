package Collections2;
import java.util.*;
public class LinkedHashSetProgram1
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
		LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
		int cos=0;
		do
		{
			System.out.println("Enter integer element: ");
			int ele=scan.nextInt();
			l1.add(ele);
			System.out.println("Press 1 to continue or 0 to stop: ");
			cos=scan.nextInt();
		}while(cos==1);
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
  }
}
