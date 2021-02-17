package equals_package;

public class Road 
{
  public static void main(String[] args) 
  {
	ClockTower ct1=new ClockTower("Hyderabad",25,new Clock(2,35,55));
	ClockTower ct2=new ClockTower("Hyderabad",25,new Clock(2,35,55));
	System.out.println(ct1);
	System.out.println(ct2);
	System.out.println("==========================================");
	boolean status=ct1.equals(ct2);
	System.out.println(status);
  }
}
