package ovreizen;

import java.util.Scanner;

public class Ov
{
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	OvChipkaart mijnKaart = new OvChipkaart(12345, 15.0);
	OvPoortje poortje1 = new OvPoortje(1);
	OvMachine machine1 = new OvMachine(1, "Utrecht Centraal");

	while (!mijnKaart.isGeldig)
	{
	    System.out.println("Welkom bij het ov");
	    System.out.println("1. Wil je inchecken?");
	    System.out.println("2. Wil je je kaartinfo zien/saldo opladen?");
	    System.out.println("3. Wil je uitchecken");
	    String keuze = console.nextLine();
	    switch (keuze)
	    {
	    case "1":
		machine1.checkIn(mijnKaart);
		if (poortje1.checkKaart(mijnKaart))
		{
		    System.out.println("Kaart goedgekeurd. Je kunt passeren.");
		}

		poortje1.sluitPoort();
		break;
	    case "2":
		mijnKaart.toonKaartInfo();
		break;
	    case "3":
		mijnKaart.setGeldigheid(false);
		machine1.checkUit(mijnKaart);
		break;
	    }

	}
    }
}
