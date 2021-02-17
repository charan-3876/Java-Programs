package array2D_programs;
import java.util.Scanner;
public class program3 
{
	public static void main(String[] args) 
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter  1st array number of rows: ");
		  int row1=scan.nextInt();
		  System.out.println("Enter 1st array number of columns: ");
		  int col1=scan.nextInt();
		  int a1[][]=new int[row1][col1];
		  System.out.println("The elements are: ");
		  for(int i=0;i<=row1-1;i++)
		  {		
			 for(int j=0;j<=col1-1;j++)
			 {
				 a1[i][j]=scan.nextInt();
			 }
		  }
		  System.out.println("Enter  2nd array number of rows: ");
		  int row2=scan.nextInt();
		  System.out.println("Enter 2nd array number of columns: ");
		  int col2=scan.nextInt();
		  int a2[][]=new int[row2][col2];
		  System.out.println("The elements are: ");
		  for(int i=0;i<=row2-1;i++)
		  {		
			 for(int j=0;j<=col2-1;j++)
			 {
				 a1[i][j]=scan.nextInt();
			 }
		  }
		  int a3[][]=new int[row1][col1];
		  for(int i=0;i<=row2-1;i++)
		  {
			   for(int y=0;y<=col2-1;y++)
			   {
				 a3[i][y]=a1[i][y]+a2[i][y]; 
			   }
		  }
		  System.out.println("The third array added elements are: ");
		  for(int i=0;i<=row2-1;i++)
		  {
			  for(int y=0;y<=col2-1;y++)
			  {
				  System.out.print(a3[i][y]+" ");
			  }
			  System.out.println();
		  }
	  }
}
