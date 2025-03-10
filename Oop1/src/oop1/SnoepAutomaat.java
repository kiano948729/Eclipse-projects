package oop1;

import java.util.Random;
import java.util.Scanner;

public class SnoepAutomaat
{
   
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	Snoep snoepautomaat = new Snoep();
	boolean isOver = false;
	boolean newRandom = false;

	while (!isOver)
	{
	    System.out.println("\nWelkom bij het snoepautomaat!");
	    System.out.println("1. Wil je een willekeurig snoepje?");
	    System.out.println("2. Wil je een snoepje kiezen?");
	    System.out.println("3. Exit");

	    String keuze = console.nextLine();

	    switch (keuze)
	    {
	    case "1":
		while (!newRandom)
		{
		    System.out.println("Je krijgt het snoepje: " + snoepautomaat.getRandomSnoep());
		    System.out.println("wil je nog een random snoepje? type ja of nee");
		    String contin = console.nextLine();
		    if(contin.equals("nee")) newRandom = true;
		    else {
			continue;
		    }
;		}
		break;

	    case "2":
		System.out.println("Je hebt keuze uit: " + String.join(", ", snoepautomaat.snoepen));
		System.out.print("Welk snoepje wil je? ");
		String gekozen = console.nextLine();

		if (snoepautomaat.isGeldigeKeuze(gekozen))
		{
		    System.out.println("Je hebt gekozen voor: " + gekozen);
		} else
		{
		    System.out.println("Ongeldige keuze, probeer opnieuw.");
		}
		break;

	    case "3":
		System.out.println("doei");
		isOver = true;
		console.close();
		break;
	    default:
		System.out.println("Ongeldige invoer");
	    }
	}
    }
}
