package Assignment_questions;

public class School
{
 public static void main(String[] args) 
 {
   Student s1=new Student(1,"charan",25.3);
   Student s2=new Student(2,"manoj",25.3);
   boolean status=s1.equals(s2);
   System.out.println(status);
 }
}
