package FileHandling_progs;
import java.io.Serializable;
public class Student implements Serializable
{
  int id;
  String name;
  double marks;
  public Student(int id,String name,double marks)
  {
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
  }
  public void info()
  {
	  System.out.println("ID is: "+this.id);
	  System.out.println("Name is: "+this.name);
	  System.out.println("Marks: "+this.marks);
  }
}
