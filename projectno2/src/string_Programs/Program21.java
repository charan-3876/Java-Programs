package string_Programs;
import java.util.Scanner;
/*split the word in a given sentence*/
public class Program21 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence: ");
	String s1=scan.nextLine();
	String[] sArr=s1.split(" ");
	for(int i=0;i<=sArr.length-1;i++)
	{
		System.out.println(sArr[i]);
	}
  }
}
