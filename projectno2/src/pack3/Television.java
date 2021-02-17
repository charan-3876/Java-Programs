package pack3;

public class Television 
{
  private int length;
  private int width;
  private int height;
  private int vol;
  private int bri;
  public Television(int length,int width,int height,int vol,int bri)
  {
	  this.length=length;
	  this.width=width;
	  this.height=height;
	  this.vol=vol;
	  this.bri=bri;
  }
  public int getLength()
  {
	return this.length;
  }
  public int getWidth() 
  {
	return this.width;
  }
  public int getHeight() 
  {
	return this.height;
  }
  public void setincvol()
  {
	  if(this.vol<120 )
	  {
		  this.vol++;
		  System.out.println("volume increased to:"+this.vol);
	  }
	  else
	  {
		  //throws exception
	  }
  }
  public void setdecvol()
  {
	  if(this.vol>0)
	  {
		  this.vol--;
		  System.out.println("volume decreased to:"+this.vol);
	  }
	  else
	  {
		  //throws exception
	  }
  }
  public void setincbri()
  {
	  if(this.bri<25)
	  {
		  this.bri++;
		  System.out.println("Brightness increased to:"+this.bri);
	  }
	  else
	  {
		  //throws exception
	  }
  }
  public void setdecbri()
  {
	  if(this.bri>1)
	  {
		  this.bri--;
		  System.out.println("Brightness decreased to:"+this.bri);
	  }
	  else
	  {
		  //throws exception
	  }
  }
}
