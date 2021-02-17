package Assignment_questions;
import java.util.Scanner;
public class EvenNum 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter starting number:");
	  int i=sc.nextInt();
	  System.out.println("Enter ending number:");
	  int k=sc.nextInt();
	for(int j=i;j<=k;j+=2)
	{
		System.out.println(j);
	}
  }
}
