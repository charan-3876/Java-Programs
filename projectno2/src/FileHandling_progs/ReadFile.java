package FileHandling_progs;
import java.io.File;
public class ReadFile 
{
  public static void main(String[] args) throws Exception
  {
	File f1= new File("D:/fileoperations/charan.txt");
	FileReader fr=new FileReader(f1);
  }
}
