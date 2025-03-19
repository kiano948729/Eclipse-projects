package ovchipkaart;

import java.util.Arrays;
import java.util.Scanner;

import ovreizen.OvChipkaart;
import ovreizen.OvMachine;
import ovreizen.OvPoortje;

public class Ovchipkaart
{

    public static void main(String[] args)
    {
	boolean isOver = true;
	Scanner console = new Scanner(System.in);
	Ovpoortje poortje1 = new Ovpoortje(1);
	System.out.println("Welkom bij het Ovchipkaart");
	OvchipkaartAutomaat machine1 = new OvchipkaartAutomaat(1, null);
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
	    console.nextLine();
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
		machine1.checkIn(mijnKaart);
		if (poortje1.checkKaart(mijnKaart))
		{
		    System.out.println("Kaart goedgekeurd. Je kunt passeren.");
		}

		poortje1.closeOvpoort();
		System.out.println("Alle locaties: " + String.join(" ", machine1.locaties));
		System.out.println("waar wilt u uitchecken");
		String toLocatie = console.nextLine();
		boolean gevonden = false;
		for (int i = 0; i < machine1.locaties.length; i++)
		{
		    if (toLocatie.trim().equalsIgnoreCase(machine1.locaties[i]))
		    {
			machine1.checkUit(mijnKaart);
			System.out.println("oke tot dan : " + toLocatie);
			gevonden = true;
		    }

		}
		if (!gevonden)
		{
		    System.out.println("Locatie niet gevonden: " + toLocatie);
		}

		break;
	    case "3":
		System.out.println("Bedankt en doei!");
		isOver = false;
		break;
	    }
	}
    }

}
