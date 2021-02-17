package FileHandling_progs;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserialization 
{
  public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException 
  {
	  System.out.println("Start");
	File f1=new File("D:/fileoperations/student.ser");
	FileInputStream fis=new FileInputStream(f1);
	ObjectInputStream ois=new ObjectInputStream(fis);
	Student s1=(Student)ois.readObject();
	s1.info();
	ois.close();
	fis.close();
	System.out.println("Stop");
  }
}
