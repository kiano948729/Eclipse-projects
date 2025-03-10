package ovreizen;

import java.util.Scanner;

public class OvChipkaart
{
    private int kaartNummer;
    private double saldo;
    public boolean isGeldig;

    // Constructor
    public OvChipkaart(int kaartNummer, double saldo)
    {
	this.kaartNummer = kaartNummer;
	this.saldo = saldo;
	this.isGeldig = false;
    }

    public int getKaartNummer()
    {
	return kaartNummer;
    }

    public double getSaldo()
    {
	return saldo;
    }

    public void voegSaldoToe(double bedrag)
    {
	this.saldo += bedrag;
    }

    public boolean checkGeldigheid()
    {
	return isGeldig;
    }

    public void setGeldigheid(boolean geldig)
    {
	this.isGeldig = geldig;
    }

    public void toonKaartInfo()
    {
	Scanner console = new Scanner(System.in);
	System.out.println("Kaartnummer: " + kaartNummer + ", Saldo: " + saldo + ", Geldig: " + isGeldig);
	if (saldo < 20)
	{
	    System.out.println("Het saldo moet opegeladen worden");
	    System.out.println("wil je je saldo opladen (ja/nee)");
	    String verder = console.nextLine();
	    if (verder.equals("ja"))
	    {
		System.out.println("hoeveel wil je je saldo opladen in euro's?");
		double saldoInput = console.nextDouble();
		saldo = saldo + saldoInput;
		System.out.println("Saldo " + saldo);

	    } else if (verder.equals("nee"))
	    {
		System.out.println("OK");
	    }
	}
    }
}
