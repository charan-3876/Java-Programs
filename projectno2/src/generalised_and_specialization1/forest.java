package generalised_and_specialization1;

public class forest 
{
  public static void main(String[] args) 
  {
	sound(new lion());
	sound(new tiger());
	sound(new monkey());
	animal a1=new tiger();
  }
  public static void sound(animal a)//generalisation
  {
	  a.noise();
  }
}
