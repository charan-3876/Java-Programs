package string_Programs;
import java.util.Scanner;
/*count no of words in a given sentence*/
public class Program22 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String s1=scan.nextLine();
	String[] sArr=s1.split(" ");
	System.out.println("Number of words is: "+sArr.length);
  }
}
