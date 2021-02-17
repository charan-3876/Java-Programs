package equals_package;

public class Clock 
{
  int hour;
  int min;
  int sec;
  public Clock(int hour,int min,int sec)
  {
	  this.hour=hour;
	  this.min=min;
	  this.sec=sec;
  }
  public String toString()
  {
	  return "Time is:"+this.hour+":"+this.min+":"+this.sec;
  }
  public boolean equals(Object o1)
  {
	 Clock c=(Clock)o1;
	 return ((this.hour==c.hour) &&(this.min==c.min) && (this.sec==c.sec));
  }
}
