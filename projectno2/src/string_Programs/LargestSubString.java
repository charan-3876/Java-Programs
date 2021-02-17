package string_Programs;
import java.util.Scanner;
public class LargestSubString 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence: ");
	String s1=scan.nextLine();
	String sArr[]=s1.split(" ");
	int big=sArr[0].length();
	String largestSubString=sArr[0];
	for(int i=1;i<=sArr.length-1;i++)
	{
		int tempBig=sArr[i].length();
		if(tempBig > big)
		{
			big=tempBig;
			largestSubString=sArr[i];
		}
	}
	System.out.println("given string: "+s1);
	System.out.println("Largest substring is: "+largestSubString);
  }
}
