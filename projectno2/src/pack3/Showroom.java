package pack3;

public class Showroom 
{
  public static void main(String[] args)
  {
	  Television t1=new Television(20,35,10,15,20);
	  System.out.println("Characteristics of Television");
	  System.out.println("Length:"+t1.getLength());
	  System.out.println("Width:"+t1.getWidth());
	  System.out.println("Height:"+t1.getHeight());
	  t1.setincvol();
	  t1.setdecvol();
	  t1.setincbri();
	  t1.setdecbri();
  }
}
