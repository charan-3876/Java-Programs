package Maps;
import java.util.*;
/*Treeset elements are homogenous elements,similarly tree map key elements are also homogenous*/
public class TreeMapProgram1
{
  public static void main(String[] args)
  {
	  TreeMap t1=new TreeMap();
		t1.put(12,"java");
		t1.put(11,3.4);
		t1.put(13, 67);
		System.out.println(t1);
		System.out.println(t1.keySet());
  }
}
