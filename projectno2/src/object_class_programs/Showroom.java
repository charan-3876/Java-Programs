package object_class_programs;

public class Showroom
{
  public static void main(String[] args) 
  {
	Car c1=new Car("Audi",150,8.9,"black");
	Car c2=new Car("Porsche",190,10.9,"blue");
	System.out.println(c1.equals(c2));
  }
}
