package ovchipkaart;

import java.util.Scanner;

public class Oop1Casus
{

    public static void main(String[] args)
    {
	boolean isOver = true;
	Scanner console = new Scanner(System.in);
	Ovpoortje poortje1 = new Ovpoortje(1);
	System.out.println("Welkom bij het Ovchipkaart");
	OvchipkaartAutomaat machine1 = new OvchipkaartAutomaat(1, "rotterdam");// locatie blijft nog null ivm error,
									       // wordt aan
	// gewerkt
	System.out.println("wat is uw naam?");
	String naam = console.nextLine();
	System.out.println("hoeveel saldo zou u willen toevoegen");
	double saldo = console.nextDouble();
	Kaart mijnKaart = new Kaart(naam, saldo);
	System.out.println("\nUw OV-chipkaart is succesvol aangemaakt!");

	while (isOver)
	{
	    System.out.println("1. Toon uw kaartinfo / saldo verhogen");
	    System.out.println("2. wil je inchecken");
	    System.out.println("3. exit");
	    console.nextLine();// extra nextline ivm fout in Eclipse, houd rekening in terminal!!
	    String keuze = console.nextLine();
	    switch (keuze)
	    {
	    case "1":
		System.out.println("1. wilt u uw saldo verhogen?");
		System.out.println("2. kaart informatie");
		String subKeuze = console.nextLine();
		switch (subKeuze)
		{
		case "1":
		    System.out.println("Hoeveel euro toevoegen?");
		    double newSaldo = console.nextDouble();
		    console.nextLine();
		    mijnKaart.voegSaldoToe(newSaldo);
		    break;
		case "2":
		    mijnKaart.kaartInfo();
		    break;
		}
		break;
	    case "2":

		System.out.println("Waar begint uw reis?");
		for (String i : machine1.getLocaties().keySet())
		{
		    System.out.println(i);
		}
		String vertrek = console.nextLine();
		for (String i : machine1.getLocaties().keySet())
		{
		    System.out.println(i);
		}
		System.out.println("Wat is uw bestemming?");
		String bestemming = console.nextLine();
		double tarief = machine1.tariefBerekenen(vertrek, bestemming);
		System.out.println("Het tarief voor deze reis is: €" + tarief);
		machine1.checkIn(mijnKaart);
		if (poortje1.checkKaart(mijnKaart))
		{
		    System.out.println("Kaart goedgekeurd. Je kunt passeren.");
		}

		poortje1.close();

		break;
	    case "3":
		System.out.println("Bedankt en doei!");
		isOver = false;
		break;
	    }
	}
	console.close();
    }

}
