package array2D_programs;
import java.util.Scanner;
/* 16 38 76
 * 45 52 18
 * 36 41 97
 * 2  8  10 */
public class program1 
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
			 for(int j=0;j<=col-1;j++)
			 {
				 System.out.print(a1[i][j]+" ");
			 }
			 System.out.println();
		  }
	  }
}
