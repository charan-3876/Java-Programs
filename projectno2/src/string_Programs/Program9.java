package string_Programs;
import java.util.Scanner;
public class Program9 
{
 public static void main(String[] args) 
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the sentence: ");
  String s1=scan.nextLine();
  System.out.println("Enter the start index: ");
  int a=scan.nextInt();
  String s2="";
  for(int i=a;i<=s1.length()-1;i++)
  {
	  char ch=s1.charAt(i);
	  s2=s2+ch;
  }
  System.out.println("The substring is: "+s2);
 }
}
/* strins s2=s1.substring()*/
