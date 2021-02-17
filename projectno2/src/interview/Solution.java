package interview;
import java.util.Scanner;
public class Solution
{
  public static void main(String[] args) 
  {
	System.out.println("main starts.....");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size=sc.nextInt();
	Pdf p[]=new Pdf[size];
	for(int i=0;i<=p.length-1;i++)
	{
	   System.out.println("Enter id:");
	   int ID=sc.nextInt();
	   System.out.println("Enter title name:");
	   String title=sc.next();
	   System.out.println("Enter folder name");
	   String foldername=sc.next();
	   System.out.println("Enter no of pages:");
	   int pages=sc.nextInt();
	   Pdf p1[]=new Pdf[size];
	}
	combineDocs(p);
  }
  public static Pdf combineDocs(Pdf[] dArr)
  {
	  int finalID=dArr[0].getID();
	  String finaltitle=dArr[0].gettitle();
	  String finalfoldername=dArr[0].getfoldername();
	  int finalpages=dArr[0].getpages();
	  for(int i=1;i<=dArr.length-1;i++)
	  {
		  int tempID=dArr[i].getID();
		  if(tempID>finalID)
		  {
			  finalID=tempID;
		  }
		  String temptitle=dArr[i].gettitle();
		  finaltitle=finaltitle+"#"+temptitle;
		  String tempfoldername=dArr[i].getfoldername();
		  finalfoldername=finalfoldername+tempfoldername;
		  int temppages=dArr[i].getpages();
		  finalpages=finalpages+temppages;
	  }
	  finalID=finalID+1;
	  Pdf ps=new Pdf(finalID,finaltitle,finalfoldername,finalpages);
	  return ps;
  }
}
