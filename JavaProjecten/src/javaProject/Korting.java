package javaProject;

import java.util.Scanner;

public class Korting
{

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	boolean isOver = false;
	while (!isOver)
	{
	    System.out.println("Welkom bij Korting Calculator");

	    System.out.println("voer een oorspronkelijk bedrag in");
	    double bedrag = console.nextDouble();

	    System.out.println("voer de korting in");
	    double korting = console.nextDouble();

	    if (korting > 100)
	    {
		System.out.println("het mag niet meer dan honderd");
	    } else
	    {
		double result = (korting / 100) * bedrag;

		result = bedrag - result;
		System.out.println("Het nieuwe bedrag is " + result);
	    }
	    if (!isOver)
	    {
		console.nextLine();
		System.out.println("wil je verder gaan (ja/nee)");
		String verder = console.nextLine();
		isOver = verder.equalsIgnoreCase("nee");
	    }
	}

    }

}
