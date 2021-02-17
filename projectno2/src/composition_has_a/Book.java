package composition_has_a;

public class Book 
{
  String title;
  public Book(String title)
  {
	  this.title=title;
  }
  public void openBook()
  {
	  System.out.println("Open the book....");
  }
  public void turnPage()
  {
	  System.out.println("Then,turn page");
  }
  public void closeBook()
  {
	  System.out.println("At last close the book");
  }
}
