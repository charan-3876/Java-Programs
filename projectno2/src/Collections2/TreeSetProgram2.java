package Collections2;
import java.util.*;
/*remove first and last element*/
public class TreeSetProgram2 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	TreeSet<String> t1=new TreeSet<String>();
	int cos=1;
	do
	{
		System.out.println("Enter the String element: ");
		String ele=scan.next();
		t1.add(ele);
		System.out.println("Press 1 to continue or 0 to stop: ");
		cos=scan.nextInt();
	}while(cos==1);
	System.out.println("The tree set string elements are: ");
	System.out.println(t1);
	t1.remove(t1.first());
	t1.remove(t1.last());
	System.out.println(t1);
  }
}
