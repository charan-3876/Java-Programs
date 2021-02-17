package CollectionsAssignment;
import java.util.*;
public class Program3 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	Vector<Integer> v1=new Vector<Integer>();
	int cos=0;
	do
	{
	 System.out.println("Enter integer element: ");
	 int ele=scan.nextInt();
	 v1.add(ele);
	 System.out.println("Press 1 to continue 0 to stop: ");
	 cos=scan.nextInt();
	}while(cos==1);
	System.out.println("The vector elements are: ");
	System.out.println(v1);
	System.out.println("The sorted elements are: ");
	Collections.sort(v1);
	System.out.println(v1);
  }
}
