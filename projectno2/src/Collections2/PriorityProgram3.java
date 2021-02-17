package Collections2;
/*retrieve and print the first element------>poll()*/
import java.util.*;
public class PriorityProgram3 
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
	System.out.println(p1.poll());
	System.out.println(p1);
  }
}
