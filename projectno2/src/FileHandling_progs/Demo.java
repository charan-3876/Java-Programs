package FileHandling_progs;
import java.io.File;
public class Demo 
{
  public static void main(String[] args) 
  {
	System.out.println("Main starts...");
	File f1=new File("D:/fileoperations");
	boolean status=f1.mkdir();
	System.out.println(status);
	System.out.println("main ends...");
  }
}
