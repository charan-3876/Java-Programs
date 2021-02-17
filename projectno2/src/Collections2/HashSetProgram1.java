package Collections2;
import java.util.*;
public class HashSetProgram1
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
		HashSet<Integer> h1=new HashSet<Integer>();
		int cos=0;
		do
		{
			System.out.println("Enter integer element: ");
			int ele=scan.nextInt();
			h1.add(ele);
			System.out.println("Press 1 to continue or 0 to stop: ");
			cos=scan.nextInt();
		}while(cos==1);
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
  }
}
