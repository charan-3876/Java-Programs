package abstraction_usage;

import abstraction_design.Run;
import abstraction_design.Sample;

public class Program 
{
	public static void main(String[] args) 
	 {
	   Sample rv=Run.getObject();
	   rv.test();
	 }
}
