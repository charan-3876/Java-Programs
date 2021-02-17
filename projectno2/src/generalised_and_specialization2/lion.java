package generalised_and_specialization2;

public class lion implements Animal
{
  public void noise()
  {
	  System.out.println("lion roars");
  } 
  public void hunt()
  {
	  System.out.println("lion hunts");
  }
  public void chasecat()
  {
	  //throws error
  }
  public void producedairy()
  {
	  //throws error
  }
}
