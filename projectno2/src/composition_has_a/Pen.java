package composition_has_a;

public class Pen 
{
  String colour;
  public Pen(String colour)
  {
	  this.colour=colour;
  }
  public void write()
  {
	  System.out.println("Write a page with:"+this.colour+"ink");
  }
}
