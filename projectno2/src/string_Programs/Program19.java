package string_Programs;
import java.util.Scanner;
/*remove digits from string*/
public class Program19 
{
 public static void main(String[] args) 
 {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the string: ");
   String s1=scan.next();
   String s2="";
   for(int i=0;i<=s1.length()-1;i++)
   {
	   char ch=s1.charAt(i);
	   if(!Character.isDigit(ch))
	   {
		   s2=s2+ch;
	   }
   }
   System.out.println("String with digits: "+s1);
   System.out.println("String without digits: "+s2);
 }
}
