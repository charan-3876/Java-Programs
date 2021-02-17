package Collections;
import java.util.Scanner;
import java.util.Vector;
/*In vector duplicate elements are allowed*/
public class VectorDuplicateProgram2 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	Vector v1=new Vector();
	int continueOrStop=0;
	do
	{
	System.out.println("Enter the element: ");
	int ele=scan.nextInt();
	v1.add(ele);
	System.out.println("Enter 0 to stop: ");
	System.out.println("Enter 1 to continue: ");
	continueOrStop=scan.nextInt();
	}while(continueOrStop==1);
	System.out.println(v1);
  }
}
