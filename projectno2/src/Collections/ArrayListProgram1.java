package Collections;
import java.util.*;
/*ArrayList
 * In array list heterogenous elements are allowed*/
public class ArrayListProgram1 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	ArrayList a1=new ArrayList();
	a1.add(75);
	a1.add(1.8);
	a1.add('@');
	a1.add(true);
	a1.add("html");
	System.out.println(a1);
  }
}
