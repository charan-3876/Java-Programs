package string_Programs;
import java.util.Scanner;
public class LargestPalindrome
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String s1=scan.nextLine();
	String sArr1[]=s1.split(" ");
	String s2=reverse(sArr1[0]);
	for(int i=1;i<=sArr1.length-1;i++)
	{
		s2=s2+" "+reverse(sArr1[i]);
	}
	
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
      public static String checkPalindrome(String[] sArr1,String[] sArr2)
      {
    	  String s="";
    	  for(int i=0;i<=sArr1.length-1;i++)
    	  {
    		 String ts1=sArr1[i];
    		 String ts2=sArr2[i];
    		 if(ts1.equalsIgnoreCase(ts2))
    		 {
    			 s=s+" "+ts1;
    		 }
    	  }
    	  s=s.trim();
    	  return s;
      }
      public static String largestSubString(String[] sArr3)
      {
    	  int big=sArr[0].length();
    	  String lss=sArr[0];
      }
}
