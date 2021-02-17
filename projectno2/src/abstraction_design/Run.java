package abstraction_design;
/**
 * 
 * @author charan
 *
 */
public class Run
{
	/**
	 * This is helper method,which will create and return implementation class object by Up-Casting to interface
	 * @return Sample
	 */
  public static Sample getObject()
  {
	  Sample s1=new Demo();
	  return s1;
  }
}
