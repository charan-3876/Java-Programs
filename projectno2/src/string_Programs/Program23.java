package string_Programs;
import java.util.Scanner;
/*To check whether word is present or not and can use contains()*/
public class Program23 
{
 public static void main(String[] args) 
 {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the sentence: ");
   String s1=scan.nextLine();
   System.out.println("Enter the word: ");
   String s2=scan.next();
   String[] sArr=s1.split(" ");
  /* int status=0;
   for(int i=0;i<=sArr.length-1;i++)
   {
	  if(s2.equals(sArr[i]))
	  {
		 status=1;
		 break;
	  }
   }
   if(status==1)
   {
	   System.out.println("The word is present");
   }
   else
   {
	   System.out.println("The word is not present ");
   }*/
   if(s1.contains(s2))
   {
	   System.out.println("present");
   }
   else
   {
	   System.out.println("not present");
   }
 }
}
