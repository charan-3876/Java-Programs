package interview;

public class Pdf
{
  private int ID;
  private String title;
  private String foldername;
  private int pages;
  public Pdf(int ID,String title,String foldername,int pages)
  {
	  this.ID=ID;
	  this.title=title;
	  this.foldername=foldername;
	  this.pages=pages;
  }
  public void setID(int ID)
  {
	this.ID=ID;
  }
  public int getID()
  {
	  return this.ID;
  }
  public void settitle(String title)
  {
	  this.title=title;
  }
  public String gettitle()
  {
	  return this.title;
  }
  public void setfoldername(String foldername)
  {
	  this.foldername=foldername;
  }
  public String getfoldername()
  {
	  return this.foldername;
  }
  public void setpages(int pages)
  {
	  this.pages=pages;
  }
  public int getpages()
  {
	  return this.pages;
  }
}
