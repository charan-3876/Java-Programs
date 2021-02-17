package array_programs;
import java.util.Scanner;
public class CharToString 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the char array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter "+size+" elements: ");
	  char c1[]=new char[size];
	  String s1="";
	  for(int i=0;i<=c1.length-1;i++)
	  {
		  c1[i]=scan.next().charAt(0);
	  }
	  /*for(int j=0;j<=c1.length-1;j++)
	  {
		  s1=s1+c1[j];
	  }*/
	  String s2=new String(c1);
	  System.out.println("The string is: "+s2);
  }
}
