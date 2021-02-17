package Collections2;
import java.util.*;
public class HashSetProgram2
{
  public static void main(String[] args)
  {
	    Scanner scan=new Scanner(System.in);
		HashSet<String> h1=new HashSet<String>();
		HashSet<String> h2=new HashSet<String>();
		int cos=0;
		do
		{
			System.out.println("Enter 1st hashset array String element: ");
			String ele=scan.next();
			h1.add(ele);
			System.out.println("Press 1 to continue or 0 to stop: ");
			cos=scan.nextInt();
		}while(cos==1);
		do
		{
			System.out.println("Enter 2nd hashset array String element: ");
			String ele=scan.next();
			h2.add(ele);
			System.out.println("Press 1 to continue or 0 to stop: ");
			cos=scan.nextInt();
		}while(cos==1);
		System.out.println("Hash Set 1: "+h1);
		System.out.println("Hash Set 2: "+h2);
		h1.retainAll(h2);
		System.out.println("After retaining the Hash Set is: "+h1);
  }
}
