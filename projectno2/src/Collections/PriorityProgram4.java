package Collections;
import java.util.*;
public class PriorityProgram4 
{
   public static void main(String[] args) 
   {
	  Scanner scan=new Scanner(System.in);
	  PriorityQueue p1=new PriorityQueue();
	  p1.add(1);
	  p1.add(2);
	  p1.add(3);
	  p1.add(4);
	  p1.add(5);
	  p1.add(6);
	  Iterator i1=p1.iterator();
	  int count=1;
	  while(i1.hasNext())
	  {
	  if(count!=4)
	  {
		  System.out.println(i1.next());
		  count++;
	  }
	  else
	  {
		  i1.next();
		  i1.remove();
		  count++;
	  }
	  }
   }
}
