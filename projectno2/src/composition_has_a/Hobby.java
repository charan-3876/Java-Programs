package composition_has_a;

public class Hobby
{
  public static void main(String[] args) 
  {
	Book rv1=new Book("Fault in our stars");
	Pen rv2=new Pen("Blue");
	Author rv3=new Author("charan",rv1,rv2);
	rv3.createStory();
  }
}
