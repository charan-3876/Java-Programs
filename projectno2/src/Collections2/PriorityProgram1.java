package Collections2;
import java.util.*;
public class PriorityProgram1 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		int cos=0;
		do
		{
			System.out.println("Enter integer element: ");
			int ele=scan.nextInt();
			p1.add(ele);
			System.out.println("Press 1 to continue or 0 to stop: ");
			cos=scan.nextInt();
		}while(cos==1);
		Iterator i1=p1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
  }
}
