package basisprogrameren;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class SuperHeroes
{
//kiano en thimo
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	ArrayList<String> superHeroes = new ArrayList<>();
	Random random = new Random();
	superHeroes.add("spiderman");
	superHeroes.add("batman");
	superHeroes.add("superman");
	superHeroes.add("iron man");
	superHeroes.add("green lantern");

	boolean case1 = false;
	System.out.println("welkom bij superhelden");
	System.out.println("1. wil je superhelden toevoegen");
	System.out.println("2. wil je superhelden verwijderen");
	System.out.println("3. wil je superhelden bekijken en sorteren");
	System.out.println("4. wil je een missie starten");
	System.out.println("5. wil je stoppen");

	String menuKeuze = console.nextLine();
	switch (menuKeuze)
	{
	case "1":
	    while (!case1)
	    {
		System.out.println("welke superhero wil je toevoegen/als je wil stoppen type (ja)");
		String keuze = console.nextLine();
		if (keuze.equals("ja"))
		{
		    case1 = true;
		} else
		{
		    superHeroes.add(keuze);
		}
	    }
	    break;
	case "2":
	    while (!case1)
	    {
		System.out.println(
			"welke superhero wil je verwijderen type de naam van de superhero\nof wil je stoppen type (ja)");
		for (int idx = 0; idx < superHeroes.size(); idx++)
		{
		    System.out.println(idx + 1 + ". " + superHeroes.get(idx));
		}
		String delete = console.nextLine();
		if (delete.equals("ja"))
		{
		    case1 = true;
		}
		superHeroes.remove(delete);
	    }
	    break;
	case "3":
	    for (int i = 0; i < superHeroes.size(); i++)
	    {
		Collections.sort(superHeroes);
		System.out.println(i + 1 + ". " + superHeroes.get(i));
	    }
	    System.out.println(" ");
	    break;

	case "4":
	    System.out.println("\nKies een missie:");
	    System.out.println("1. Red de stad");
	    System.out.println("2. Versla de slechterik");
	    System.out.println("3. Vind de kat van oma");
	    System.out.print("Maak een keuze: ");
	    String missieKeuze = console.nextLine();

	    String missie = switch (missieKeuze)
	    {
	    case "1" -> "Red de stad";
	    case "2" -> "Versla de slechterik";
	    case "3" -> "Vind de kat van oma";
	    default -> "Onbekende missie";
	    };

	    if (superHeroes.size() < 3)
	    {
		System.out.println("Niet genoeg superhelden in het team om de missie uit te voeren.");
		break;
	    }
	    ArrayList<String> geselecteerdTeam = new ArrayList<>();
	    while (geselecteerdTeam.size() < 3)
	    {
		String geselecteerdeHeld = superHeroes.get(random.nextInt(superHeroes.size()));
		if (!geselecteerdTeam.contains(geselecteerdeHeld))
		{
		    geselecteerdTeam.add(geselecteerdeHeld);
		}
	    }
	    System.out.println("Superhelden op missie: " + String.join(", ", geselecteerdTeam) + " gaan " + missie
		    + " uitvoeren!");
	    break;
	case "5":
	    System.out.println("Je bent gestopt");
	    break;
	}

    }

}
