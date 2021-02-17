package FileHandling_progs;
import java.io.File;
import java.io.IOException;
public class Demo1 
{
  public static void main(String[] args) throws IOException
  {
	 System.out.println("Main starts...");
	 File f1=new File("D:/fileoperations/abc.txt");
	 boolean status=f1.createNewFile();
	 System.out.println(status);
	 System.out.println("Main ends..");
  }
}
