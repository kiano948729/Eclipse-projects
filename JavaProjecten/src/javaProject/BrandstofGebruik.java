package javaProject;

import java.util.Scanner;

public class BrandstofGebruik
{

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	boolean isOver = false;
	while (!isOver)
	{
	    System.out.println("Welkom bij de Brandstofverbruik Calculator");
	    
	    System.out.println("Hoeveel kilometers heb je gereden");
	    int kilometers = console.nextInt();
	    
	    System.out.println("Hoeveel verbruikte brandstof in liters");
	    int brandstof = console.nextInt();
	    
	    double result = (double) kilometers / brandstof;
	    
	    System.out.println("liter per kilometer " + result);

	    if (result < 5)
	    {
		System.out.println("je auto is zuinig");
	    } else if (result > 5)
	    {
		System.out.println("je auto is niet zuinig");
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
