/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileLoops;

import java.util.Scanner;

public class SumofNums
{

    public static void main(String args[])
    {
	Scanner console = new Scanner(System.in);
	int sum = 0;
	int counter = 0;

	System.out.print("Enter" + " a number: ");
	int number = console.nextInt();
	
	System.out.print("Enter" + " a number: ");

	while (console.hasNextInt())
	{
	    sum = sum + number; // moved to top of loop
	    counter++;
	    if (counter == 10)
	    {
		break;
	    }
	    System.out.print("Enter a number: ");
	    number = console.nextInt();
	}
	console.close();
	
	System.out.println("The sum is " + sum);
	System.out.println("\nthe counter is " + counter);

    }
}
