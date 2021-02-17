package CollectionsAssignment;
import java.util.*;
public class Student
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
    public void studentInfo()
    {
      System.out.println(" Student ID: "+this.id);
      System.out.println(" Student name: "+this.name);
      System.out.println(" Student marks: "+this.marks);
    }
    public String toString()
    {
    	return this.name;
    }
}
