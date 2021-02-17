package string_Programs;
import java.util.Scanner;
/*
 * count each type of vowel by using count variable
 */
public class Vowelcount 
{
 public static void main(String[] args) 
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1="aeiou";
	String s2=scan.next();
	for(int i=0;i<=s1.length()-1;i++)
	{
		int count=0;
		char c1=s1.charAt(i);
		for(int j=0;j<=s2.length()-1;j++)
		{
			char c2=s2.charAt(j);
			if(c1==c2)
			{
				count++;
			}
		}
		System.out.println(c1+" count is "+count);
	}
 }
}
