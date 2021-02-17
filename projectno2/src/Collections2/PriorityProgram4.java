package Collections2;
import java.util.*;
/*only retrieve----->peek()*/
public class PriorityProgram4 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		p1.add(34);
		p1.add(35);
		p1.add(36);
		p1.add(37);
		p1.add(39);
		System.out.println(p1);
		System.out.println(p1.peek());
		System.out.println(p1);
  }
}
