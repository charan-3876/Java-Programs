package composition_has_a;

public class Author 
{
  String name;
  Book b;
  Pen p;
  public Author(String name,Book b,Pen p)
  {
	  this.name=name;
	  this.b=b;
	  this.p=p;
  }
  public void createStory()
  {
	  System.out.println("Author name:"+this.name);
	  b.openBook();
	  p.write();
	  b.turnPage();
	  p.write();
	  b.closeBook();
  }
}
