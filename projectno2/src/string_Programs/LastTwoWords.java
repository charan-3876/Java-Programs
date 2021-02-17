package string_Programs;
import java.util.Scanner;
public class LastTwoWords 
{
	 public static void main(String[] args) 
	  {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s1=scan.nextLine();
		String sArr[]=s1.split(" ");
		String s2="";
		s2=sArr[sArr.length-2]+" "+sArr[sArr.length-1];
		System.out.println(s2);
	  }
}
