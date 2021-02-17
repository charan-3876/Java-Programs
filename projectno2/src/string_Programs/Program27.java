package string_Programs;
import java.util.Scanner;
public class Program27 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the paragraph: ");
	String s1=scan.nextLine();
	String sArr1[]=s1.split(" ");
	String s2=" ";
	for(int i=0;i<=sArr1.length-1;i++)
	{
		String tempString=sArr1[i];
		int status=s2.indexOf(tempString);
		if(status==-1)
		{
			s2=s2+" "+tempString;
		}
	}
	s2=s2.trim();
	String sArr2[]=s2.split(" ");
	for(int i=0;i<=sArr2.length-1;i++)
	{
		int count=0;
		String ts1=sArr2[i];
		for(int j=0;j<=sArr1.length-1;j++)
		{
		    String ts2=sArr1[j];
			if(ts1.equals(ts2))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(ts1 + "repeated: "+count);
		}
	}
  }
}
