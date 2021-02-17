package array_programs;
import java.util.Scanner;
/*remove duplicates and print the array*/
public class Program1 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the Array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter the "+size+" elements");
	  int a1[]=new int[size];
	  for(int i=0;i<=a1.length-1;i++)
	  {
		a1[i]=scan.nextInt();
	  }
	  int arraySize=0;
	  for(int i=0;i<=a1.length-1;i++)
	  {
		  int status=0;
		  for(int k=i;k>=0;k--)
		  {
			  if(a1[i]==a1[k])
			  {
				  status++;
			  }
		  }
		  if(status==1)
		  {
			  arraySize++;
		  }
	  }
	  int a2[]=new int[arraySize];
	  int index=0;
	  for(int i=0;i<=a1.length-1;i++)
	  {
		  int check=0;
		  for(int j=0;j<=a2.length-1;j++)
		  {
			  if(a1[i]==a2[j])
			  {
				  check=1;
				  break;
			  }
		  }
		  if(check==0)
		  {
			  a2[index]=a1[i];
			  index++;
		  }
	  }
	  System.out.println("The array with duplicates: ");
	  for(int x=0;x<=a1.length-1;x++)
	  {
		  System.out.print(a1[x]+" ");
	  }
	  System.out.print("The array without duplicates: ");
	  for(int y=0;y<=a2.length-1;y++)
	  {
		  System.out.print(a2[y]+" ");
	  }
   }
}
