package generalised_and_specialization2;

 public class dog implements Animal 
{
	public void noise()
	  {
		  System.out.println("dog barks");
	  } 
	  public void chasecat()
	  {
		  System.out.println("dog chases cat");
	  }
	  public void hunt()
	  {
		  //throws error
	  }
	  public void producedairy()
	  {
		  //throws error
	  }
}
