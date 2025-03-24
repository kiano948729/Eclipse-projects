package ovchipkaart;

public class Kaart
{
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

    public int setKaartnummer()
    {
	for (int i = 0; i < 5; i++)
	{
	    kaartnummer = kaartnummer * 10 + (int) (Math.random() * 10);
	}
	return kaartnummer;

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
