package javaProject;

import java.util.Scanner;

public class BetereTafels
{

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	boolean isOver = false;

	while (!isOver)
	{
	    System.out.println("Welkom bij de rekenmachine");
	    System.out.println("1. Wil je + berekenen");
	    System.out.println("2. Wil je - berekenen");
	    System.out.println("3. Wil je x berekenen");
	    System.out.println("4. Wil je / berekenen");
	    System.out.println("5. Wil je stoppen");
	    String keuze = console.nextLine();

	    if (keuze.equals("5"))
	    {
		System.out.println("doei");
		isOver = true;
	    } else if (keuze.matches("[1-4]"))
	    {
		System.out.println("voer twee getallen in gescheiden door spaties:");
		double getal1 = console.nextDouble();
		double getal2 = console.nextDouble();
		console.nextLine();

		double result = switch (keuze)
		{
		case "1" -> getal1 + getal2;
		case "2" -> getal1 - getal2;
		case "3" -> getal1 * getal2;
		case "4" -> getal1 / getal2;
		default -> 0;
		};

		System.out.println("het resultaat is: " + result);
	    } else
	    {
		System.out.println("ongeldige keuze");
	    }

	    if (!isOver)
	    {
		System.out.println("Wil je nog een berekening doen? (ja/nee)");
		String verder = console.nextLine();
		isOver = verder.equalsIgnoreCase("nee");
	    }
	}
	console.close();
    }
}
