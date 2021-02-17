package array2D_programs;
import java.util.*;
public class Sunil 
{
	public static void main(String[] args) 
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter number of rows: ");
		  int row=scan.nextInt();
		  System.out.println("Enter number of columns: ");
		  int col=scan.nextInt();
		  String a1[][]=new String[row][col];
		  System.out.println("The elements are: ");
		  for(int i=0;i<=row-1;i++)
		  {		
			 for(int j=0;j<=col-1;j++)
			 {
				 a1[i][j]=scan.next();
			 }
		  }
		  System.out.println("Enter the string: ");
		  String s=scan.next();
		  char[] c=new char[s.length()];
		  for(int i=0;i<=s.length()-1;i++)
		  {
			  char ch=s.charAt(i);
			  c[i]=ch;
			  for(int x=0;x<=row-1;x++)
			  {
				  for(int y=0;y<=col-1;y++)
				  {
				     if(a1[x][y]=="/")
				     {
				        System.out.println(1);     
				     }
				     else if(a1[x][y]=="ABC")
				     {
				    	 System.out.println(2);
				     }
				     else if(a1[x][y]=="DEF")
				     {
				    	 System.out.println(3);
				     }
				     else if(a1[x][y]=="GHI")
				     {
				    	 System.out.println(4);
				     }
				     else if(a1[x][y]=="JKL")
				     {
				    	 System.out.println(5);
				     }
				     else if(a1[x][y]=="MNO")
				     {
				    	 System.out.println(6);
				     }
				     else if(a1[x][y]=="PQRS")
				     {
				    	 System.out.println(7);
				     }
				     else if(a1[x][y]=="TUV")
				     {
				    	 System.out.println(8);
				     }
				     else if(a1[x][y]=="WXYZ")
				     {
				    	 System.out.println(9);
				     }
				     else if(a1[x][y]=="*")
				     {
				    	 System.out.println(' ');
				     }
				     else if(a1[x][y]=="+")
				     {
				    	 System.out.println(0);
				     }
				     else if(a1[x][y]=="#")
				     {
				    	 System.out.println(' ');
				     }
				  }
			  }
		  }
		  for(int x=0;x<=row-1;x++)
		  {		
			 for(int y=0;y<=col-1;y++)
			 {
				 System.out.print(a1[x][y]+" ");;
			 }
		  }
	  }
}
