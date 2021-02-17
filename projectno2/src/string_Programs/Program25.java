package string_Programs;
import java.util.Scanner;
/*ip-happy new year;o/p-year new happy*/
public class Program25 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String s1=scan.nextLine();
	String[] sArr=s1.split(" ");
	String s2=sArr[sArr.length-1];
	for(int i=sArr.length-2;i>=0;i--)
	{
      s2=s2+" "+sArr[i];
    }  
	System.out.println("The reversed sentence is: "+s2);
  }
}
