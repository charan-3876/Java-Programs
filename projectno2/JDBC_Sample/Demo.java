package Package1;

import java.util.Scanner;

public class Demo 
{
  public static void main(String[] args)
  {
	System.out.println("Enter 1 to Add Book: ");
	System.out.println("Enter 2 to searchAuthor: ");
	System.out.println("Enter 3 to modifyBookPrice: ");
	System.out.println("Enter 4 to remove a Book: ");
	Task t=new Task();
	System.out.println();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number to perform the operation: ");
	int operation=scanner.nextInt();
	if(operation<=4)
	{
		switch(operation)
		{
		case 1:
			t.addBook();
			break;
		case 2:
			t.searchAuthor();
			break;
		case 3:
			t.modifyPrice();
			break;
		case 4:
			t.removeAuthor();
			break;
		}
	}
	else
	{
		System.out.println("Invalid choice: ");
	}
	System.out.println("Do you wish to continue---->(Y/N): ");
	String ch=scanner.next();
	if(ch.equalsIgnoreCase("Y"))
	{
		main(args);
	}
	else
	{
		System.out.println("Thank you.......");
	}
  }
}
