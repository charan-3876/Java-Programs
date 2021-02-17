package FileHandling_progs;
import java.io.File;
import java.io.FileWriter;

public class FlushDataInFile  
{
  public static void main(String[] args) throws Exception 
  {
	System.out.println("Min starts...");
	File f1=new File("D:/fileoperations/charan.txt");
	FileWriter fw=new FileWriter(f1);
	fw.write("html"+"\r\n");
	fw.write("SQL"+"\r\n");
	fw.write("java"+"\r\n");
	fw.flush();
	System.out.println("Main ends...");
  }
}
