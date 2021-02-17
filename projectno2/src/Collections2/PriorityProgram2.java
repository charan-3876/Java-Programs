package Collections2;
import java.util.*;
/*inser only character elements*/
public class PriorityProgram2 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	PriorityQueue<Character> p1=new PriorityQueue<Character>();
	p1.add('w');
	p1.add('w');
	p1.add('w');
	p1.add('w');
	p1.add('w');
	System.out.println(p1);
	p1.offer('q');
	System.out.println(p1);
  }
}
