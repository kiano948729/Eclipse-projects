package javaProject;

import java.util.Scanner;

public class BMIcalculaotr
{

    public static void main(String[] args)
    {

	Scanner console = new Scanner(System.in);
	boolean isOver = false;
	while (!isOver)
	{

	    System.out.println("Welkom bij de BMI calculator");
	    System.out.println("1 Wil je BMI berekenen");
	    System.out.println("2 Wil je stoppen");
	    String keuze = console.nextLine();

	    switch (keuze)
	    {

	    case "1":
		System.out.println("wat is je lengte in meters: voorbeeld 1,83: ");
		double lengte = console.nextDouble();

		System.out.println("wat is je gewicht in kilogram: ");
		int gewicht = console.nextInt();

		double BMI = gewicht / (lengte * lengte);

		if (BMI < 18.5)
		{
		    System.out.println("je hebt ondergewicht  BMI " + BMI);
		} else if (BMI >= 18.5 && BMI < 25)
		{
		    System.out.println("je hebt gezond gewicht  BMI " + BMI);
		} else if (BMI >= 25 && BMI < 30)
		{
		    System.out.println("je hebt overgewicht  BMI " + BMI);
		} else
		{
		    System.out.println("je hebt obesitas  BMI " + BMI);
		}
		break;
	    case "2":
		isOver = true;
		System.out.println("doei");
		break;
	    default:
		System.out.println("ongeldige keuze");
		break;
	    }
	    if (!isOver)
	    {
		console.nextLine();
		System.out.println("wil je verder gaan (ja/nee)");
		String verder = console.nextLine();
		isOver = verder.equalsIgnoreCase("nee");
	    }

	}
        console.close();
    }
}
