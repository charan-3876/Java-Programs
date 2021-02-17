package string_Programs;
import java.util.Scanner;
public class Program8
{
 public static void main(String[] args) 
 {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter a sentence: ");
   String s1=scan.nextLine();
   System.out.println("Enter the start index: ");
   int a=scan.nextInt();
   System.out.println("Enter the end index: ");
   int b=scan.nextInt();
   /*String s2="";
   for(int i=a;i<=b;i++)
   {
	   char ch=s1.charAt(i);
	   s2=s2+ch;
   }*/
   String s2=s1.substring(a,b+1);
   System.out.println("Given string is: "+s1);
   System.out.println("Sub string is: "+s2);
 }
}
