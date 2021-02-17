package string_Programs;
import java.util.Scanner;
/*remove space from sentence*/
public class Program18
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence: ");
	String s1=scan.nextLine();
	String s2="";
	for(int i=0;i<=s1.length()-1;i++)
	{
	    char ch=s1.charAt(i);
	    if(ch!=' ')
	    {
	    	s2=s2+ch;
	    }
	}
	System.out.println("The given sentence is: "+s1);
	System.out.println("The required sentence is: "+s2);
  }
}
