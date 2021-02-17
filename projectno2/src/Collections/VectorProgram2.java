package Collections;
import java.util.*;
public class VectorProgram2 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	Vector v1=new Vector();
	v1.add(23);
	v1.add("web");
	v1.add(12);
	v1.add(99);
	v1.add('w');
	System.out.println("Vector elements are......");
	for(int i=0;i<=v1.size()-1;i++)
	{
		System.out.println(v1.get(i)+"@index: "+i);
	}
	System.out.println("Enter index number to insert an element: ");
	int index=scan.nextInt();
	System.out.println("Enter the element: ");
	System.out.println("Press 1 to enter integer element: ");
	System.out.println("Press 2 to enter String element: ");
	System.out.println("Press 3 to enter character element");
	int choice=scan.nextInt();
	if(choice==1)
	{
		System.out.println("Enter integer element: ");
		v1.add(index,scan.nextInt());
	}
	else if(choice==2)
	{
		System.out.println("Enter string element: ");
		v1.add(index,scan.next());
	}
	else if(choice==3)
	{
		System.out.println("Enter character element: ");
		v1.add(index,scan.next().charAt(0));
	}
	else
	{
		System.out.println("Invalid number......");
	}
	System.out.println("Vector elements after inserting new elements: ");
	for(int i=0;i<=v1.size()-1;i++)
	{
		System.out.println(v1.get(i)+" @ index: "+i);
	}
  }
}
