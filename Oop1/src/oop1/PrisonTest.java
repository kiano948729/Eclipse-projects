package oop1;

import java.util.Random;
import java.util.Scanner;

public class PrisonTest
{
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	Prison prison = new Prison();
	boolean isOver = false;
	while (!isOver)
	{
	    System.out.println("welkom in prison");
	    System.out.println("1. iemand inboeken");
	    System.out.println("2. Lijst van prisoners");
	    String keuze = console.nextLine();
	    switch (keuze)
	    {

	    case "1":

		System.out.println("voer de naam");
		String name = console.nextLine();
		System.out.println("voer de lengte in");
		double height = console.nextDouble();
		System.out.println("voer de sentence in");
		int sentence = console.nextInt();
		prison.addPrisoner(name, height, sentence);
		break;
	    case "2":
		prison.showPrisoners();
		break;
	    default:
		System.out.println("ongeldige keuze");
	    }

	}
    }
}
