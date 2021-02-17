package Collections;
import java.util.*;
/*In priority queue duplicate elemens are allowed*/
public class PriorityProgram2 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	PriorityQueue p1=new PriorityQueue();
	int cos=0;
	do
	{
		System.out.println("Enter the double element: ");
		double ele=scan.nextDouble();
		p1.add(ele);
		System.out.println("Enter 1 to continue or 0 to stop: ");
		cos=scan.nextInt();
	}while(cos==1);
	System.out.println("The priority queue elements are: ");
	System.out.println(p1);
  }
}
