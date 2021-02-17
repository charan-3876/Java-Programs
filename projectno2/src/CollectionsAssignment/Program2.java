package CollectionsAssignment;
import java.util.*;
/*swap elements*/
import array_programs.FirstSmallSecondSmall;
public class Program2 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	ArrayList<Integer> a1=new ArrayList<Integer>();
	int cos=0;
	do
	{
		 System.out.println("Enter integer element: ");
		   int ele=scan.nextInt();
		   a1.add(ele);
		   System.out.println("Press 1 to continue 0 to stop: ");
		   cos=scan.nextInt();
	}while(cos==1);
	System.out.println("Elements before swapping: ");
	System.out.println(a1);
	System.out.println("Enter two indices for swapping: ");
	int x=scan.nextInt();
	int y=scan.nextInt();
    int a=a1.get(x);
    a1.set(x,a1.get(y));
    a1.set(y, a);
    System.out.println(a1);
  }
}
