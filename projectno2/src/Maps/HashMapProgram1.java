package Maps;
import java.util.*;
public class HashMapProgram1 
{
  public static void main(String[] args)
  {
	HashMap m1=new HashMap();
	m1.put(12,"java");
	m1.put('a',3.4);
	m1.put(true, 67);
	System.out.println(m1);
	System.out.println(m1.keySet());
	System.out.println(m1.values());
  }
}
