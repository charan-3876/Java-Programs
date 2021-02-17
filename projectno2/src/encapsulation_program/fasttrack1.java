package encapsulation_program;

public class fasttrack1 
{
  public static void main(String[] args)
  {   
	  watch1 w1=new watch1(2,30,60);
	  System.out.println(w1.getHour());
	  System.out.println(w1.getmin());
	  System.out.println(w1.getsec());
	  System.out.println("====Change Time=====");
	  w1.setHour(12);
	  w1.setMin(36);
	  w1.setSec(57);
	  System.out.println(w1.getHour());
	  System.out.println(w1.getmin());
	  System.out.println(w1.getsec());	 
  }
}
