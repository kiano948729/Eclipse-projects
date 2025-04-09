package ovchipkaart;

import java.util.Random;

public class Kaart
{
    private static final Random random = new Random();
    public String naam;
    public int kaartnummer;
    public double saldo;
    public boolean isGeldig;
    

    public Kaart(String naam, double saldo)
    {
	this.naam = naam;
	this.kaartnummer = setKaartnummer();
	this.saldo = saldo;
	this.isGeldig = true;
    }

    public String getNaam()
    {
	return naam;
    }

    public double getSaldo()
    {
	return saldo;
    }

    public void voegSaldoToe(double bedrag)
    {
	if (bedrag > 0)
	{
	    this.saldo += bedrag;
	    System.out.println("Saldo verhoogd met €" + bedrag);
	    System.out.println("Huidige saldo: €" + saldo);
	} else
	{
	    System.out.println("Fout: Bedrag moet positief zijn.");
	}
    }

    public static int setKaartnummer()
    {
	return random.nextInt(90000) + 10000;
	// nog betere optimalisatie!! 
    }

    public boolean checkOvGeldigheid()
    {
	return isGeldig;
    }
    public void kaartInfo()
    {
	System.out.println("Naam: " + naam);
	System.out.println("Kaartnummer: " + kaartnummer);
	System.out.println("Saldo: €" + saldo);
	System.out.println("Geldigheid: " + isGeldig);
    }
}
