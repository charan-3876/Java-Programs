package generalised_and_specialization2;

public class Animals 
{
  public static void main(String[] args) 
  {
     animalbehaviour(new lion());
     animalbehaviour(new dog());
     animalbehaviour(new cow());
  }
  public static void animalbehaviour(Animal a)
  {
	  a.noise();
	  a.hunt();
	  a.chasecat();
	  a.producedairy();
  }
}
