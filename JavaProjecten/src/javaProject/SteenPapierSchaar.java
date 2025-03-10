package javaProject;

import java.util.Random;
import java.util.Scanner;

public class SteenPapierSchaar
{

    public static void main(String[] args)

    {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();;
	String[] opties =
	{ "steen", "papier", "schaar" };

	System.out.println("Welkom bij Steen, Papier, Schaar");

	while (true)
	{
	    System.out.print("Kies je optie (steen, papier of schaar): ");
	    String gebruikerKeuze = scanner.nextLine().toLowerCase();

	    int randomIndex = random.nextInt(opties.length);

	    String computerKeuze = opties[randomIndex];

	    System.out.println("de computer kiest " + computerKeuze);
	    if (gebruikerKeuze.equals(computerKeuze))
	    {
		System.out.println("Gelijkspel");
	    } 
	    else if ((gebruikerKeuze.equals("steen") && computerKeuze.equals("schaar"))
		    || (gebruikerKeuze.equals("papier") && computerKeuze.equals("steen"))
		    || (gebruikerKeuze.equals("schaar") && computerKeuze.equals("papier")))
	    {
		System.out.println("Jij wint");
	    } else
	    {
		System.out.println("De computer wint");
	    }
	}
    }

}
