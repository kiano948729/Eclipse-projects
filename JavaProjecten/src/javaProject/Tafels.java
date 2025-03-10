package javaProject;

import java.util.Scanner;

public class Tafels
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
	    System.out.println("4. Wil je stoppen");
	    String keuze = console.nextLine();

	    switch (keuze)
	    {
	    case "1":
		System.out.println("voer een getal in");
		double getal1 = console.nextDouble();
		System.out.println("voer een getal in");
		double getal2 = console.nextDouble();
		double result = getal1 + getal2;
		System.out.println("het resultaat is" + result);
		break;
	    case "2":
		System.out.println("voer een getal in");
		double getalMin1 = console.nextDouble();
		System.out.println("voer een getal in");
		double getalMin2 = console.nextDouble();
		double resultMin = getalMin1 - getalMin2;
		System.out.println("het resultaat is" + resultMin);
		break;
	    case "3":
		System.out.println("voer een getal in");
		double getalX1 = console.nextDouble();
		System.out.println("voer een getal in");
		double getalX2 = console.nextDouble();
		double resultX = getalX1 * getalX2;
		System.out.println("het resultaat is" + resultX);
		break;
	    case "4":
		System.out.println("doei");
		isOver = true;
		break;
	    default:
		System.out.println("ongeldige keuze");
		break;
	    }
	    if (!isOver)
	    {
		System.out.println("Wil je nog een berekening doen? (ja/nee)");

		String verder = console.nextLine();
		if (verder.equals("nee"))
		{
		    isOver = true;
		}
	    }

	}
	console.close();
    }

}
