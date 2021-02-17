package encapsulation_program;

public class watch1 
{
  private int hour;
  private int min;
  private int sec;
  public watch1(int hour,int min,int sec)
  {
	  this.hour=hour;
	  this.min=min;
	  this.sec=sec;
  }
  public void timedisp()
  {
	  System.out.println("Time is:"+this.hour+"hours "+this.min+"minutes "+this.sec+"seconds");
  }
  public void setHour(int hour)
  {
	  if((hour>=0&&hour<=23))
	  {
	  this.hour=hour;
	  }
	  else
	  {
		  //throws exception
	  }
  }
  public int getHour()
  {
	 return this.hour;
  }
  public void setMin(int min)
  {
	  if((min>=0&&min<=59))
	  {
	  this.min=min;
	  }
	  else
	  {
		  //throws exception
	  }
  }
  public int getmin()
  {
	  return this.min;
  }
  public void setSec(int sec)
  {
	  if((sec>=0&&sec<=59))
	  {
	  this.sec=sec;
	  }
	  else
	  {
		  //throws exception
	  }
  }
  public  int getsec()
  {
	  return this.sec;
  }
}
