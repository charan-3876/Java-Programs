package Maps;
import java.util.*;
public class LinkedHashMapProgram1 
{
  public static void main(String[] args) 
  {
	LinkedHashMap l1=new LinkedHashMap();
	l1.put(12,"java");
	l1.put('a',3.4);
	l1.put(true, 67);
	System.out.println(l1);
	System.out.println(l1.get(12));
  }
}
