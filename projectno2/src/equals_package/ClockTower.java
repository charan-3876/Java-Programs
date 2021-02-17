package equals_package;

public class ClockTower 
{
  String location;
  double height;
  Clock c;
  public ClockTower(String location,double height,Clock c)
  {
	  this.location=location;
	  this.height=height;
	  this.c=c;
  }
  public String toString()
  {
	  return "Location is at "+this.location+"and the time----->:"
	  		+ ""+c.toString();
  }
  public boolean equals(Object o1)
  {
	   ClockTower ct=(ClockTower) o1;
	   return ((this.height==ct.height) && (this.c.equals(ct.c)));
  }
}
