
package array2D_programs;
import java.util.Scanner;
public class program2 
{
	public static void main(String[] args) 
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter number of rows: ");
		  int row=scan.nextInt();
		  System.out.println("Enter number of columns: ");
		  int col=scan.nextInt();
		  int a1[][]=new int[row][col];
		  System.out.println("The elements are: ");
		  for(int i=0;i<=row-1;i++)
		  {		
			 for(int j=0;j<=col-1;j++)
			 {
				 a1[i][j]=scan.nextInt();
			 }
		  }
		  for(int i=0;i<=row-1;i++)
		  {
			 if(i%2==0)
			 {
				 for(int x=0;x<=col-1;x++)
				 {
					 System.out.print(a1[i][x]+" ");
				 }
			 }
			 else
			 {
				 for(int y=col-1;y>=0;y--)
				 {
					 System.out.print(a1[i][y]+" ");
				 }
			 }
		  }
	  }
}
