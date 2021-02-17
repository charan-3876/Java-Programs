package string_Programs;
import java.util.Scanner;
/*i/p-happy new year;o/p-raey wen yppah*/
public class Program26 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s1=scan.nextLine();
		String[] sArr=s1.split(" ");
		String finalString=reverse(sArr[sArr.length-1]);
		for(int i=sArr.length-2;i>=0;i--)
		{
	      String tempString=reverse(sArr[i]);
	      finalString=finalString+" "+tempString;
	    }  
		System.out.println("The reversed sentence is: "+finalString);
  }
  public static String reverse(String s1)
  {
	  String s2="";
	  for(int i=s1.length()-1;i>=0;i--)
	  {
		  char ch=s1.charAt(i);
		  s2=s2+ch;
	  }
	  return s2;
  }
}
