package Collections2;
import java.util.*;
public class HashSetProram3 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	HashSet<Double> h1=new HashSet<Double>();
	TreeSet<Double> t1=new TreeSet<Double>();
	int cos=0;
	do
	{
		System.out.println("Enter HashSet double element: ");
		double ele=scan.nextDouble();
		h1.add(ele);
		System.out.println("Press 1 to continue or 0 to stop: ");
		cos=scan.nextInt();	
	}while(cos==1);
  }
}
