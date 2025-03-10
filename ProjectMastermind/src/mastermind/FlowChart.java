package mastermind;

import java.util.Scanner;

public class FlowChart
{

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	int counter = 0;
	int guess = (int) (Math.random() * 100);
	System.out.print("Enter" + " a number between 0-100: ");
	int number = console.nextInt();

	while (number != guess)
	{
	    if (number < guess)
	    {
		System.out.println("het getal is hoger");
	    }

	    else if (number > guess)
	    {
		System.out.println("het getal is lager");
	    }
	    if (counter == 7)
	    {
		System.out.println("je hebt tevaak gegokt");
		break;
	    }
	    counter++;
	    System.out.print("\nEnter a number: ");
	    number = console.nextInt();
	}
	if (counter < 7)
	{
	    System.out.println("je hebt het goed geraden");
	}
    }
}