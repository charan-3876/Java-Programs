package Collections;
import java.util.*;
/*vector*/
public class VectorProgram1 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	Vector a1=new Vector();
	a1.add(75);
	a1.add(1.8);
	a1.add('@');
	a1.add(true);
	a1.add("html");
	System.out.println("Enter the index from 0 to: "+(a1.size()-1));
	int index=scan.nextInt();
	System.out.println(a1.get(index));
  }
}
