package string_Programs;
import java.util.Scanner;
public class IntArraySize 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the integer array size: ");
	int size=scan.nextInt();
    System.out.println("Enter"+size+"elements: ");
    int a1[]=new int[size];
    for(int i=0;i<=a1.length-1;i++)
    {
    	a1[i]=scan.nextInt();
    }
    for(int k:a1)
    {
    	System.out.println(k);
    }
  }
}
