
package whileLoops;

import java.util.Scanner;

public class SquareRootWhile
{
    public static void main(String args[])
    {
	int sum = 0;
	while (true)
	{
	    System.out.print("Type a non-negative integer: ");
	    Scanner console = new Scanner(System.in);
	    int number = console.nextInt();
	    if(number == -1) {
		sum = sum + number;
		break;
	    }
	}
	System.out.println("the number is" + sum);

    }

}
