package encapsulation_program1;

public class watch 
{
  private int hour;
  private int min;
  private int sec;
  public watch(int hour,int min,int sec)
  {
	  this.hour=hour;
	  this.min=min;
	  this.sec=sec;
  }
  public void display()
  {
	  System.out.println("Time is:"+this.hour+"hours "+this.min+"minutes "+this.sec+"seconds");
  }
  public void changedisplay(int hour,int min,int secs)
  {
	  if((hour>=0 && hour<=23)&&(min>=0 && min<=59)&&(sec>=0 && sec<=59))
	  {
		  this.hour=hour;
		  this.min=min;
		  this.sec=sec;
		  System.out.println("Time is:"+this.hour+"hours "+this.min+"minutes "+this.sec+"seconds");
	  }
	  else
	  {
		  //throws exception	 
	  }
  }
}
