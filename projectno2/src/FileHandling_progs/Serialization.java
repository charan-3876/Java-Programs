package FileHandling_progs;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serialization 
{
  public static void main(String[] args) throws IOException,FileNotFoundException
  //IOException,filenotfound
  //hrows is used with method signature
  {
	System.out.println("Main starts....");
	Student s1=new Student(1,"charan",45.6);
	File f1=new File("D:/fileoperations/student.ser");
	FileOutputStream fos=new FileOutputStream(f1);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s1);
	fos.close();
	oos.close();
	System.out.println("Main ends......");
  }
}
