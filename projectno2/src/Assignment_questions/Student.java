package Assignment_questions;

public class Student 
{
  private int rollno;
  private String name;
  private double marks;
  public Student(int rollno,String name,double marks)
  {
	  this.rollno=rollno;
	  this.name=name;
	  this.marks=marks;
  }
  public void displayMarks()
  {
	  System.out.println("Marks of the student:"+this.rollno+this.name+this.marks);
  }
  public int getrollno()
  {
	  return rollno;
  }
  public String getname()
  {
	  return name;
  }
  public double getmarks()
  {
	  return marks;
  }
  public void setrollno(int rollno)
  {
	  this.rollno=rollno;
  }
  public void setname(String name)
  {
	  this.name=name;
  }
  public void setmarks(double marks)
  {
	  this.marks=marks;
  }
  public boolean equals(Object o1)
  {
	  Student s=(Student)o1;
	  return this.marks==s.marks;
  }
}
