package ovchipkaart;

public class Kaart 
{
    public String naam;
    public int kaartnummer;
    public double saldo;
    public boolean isGeldig;
    public Kaart(String naam, int kaartnummer, double saldo) {
	this.naam = naam; 
	this.kaartnummer = kaartnummer;
	this.saldo = saldo;
	this.isGeldig = false;
    }
    public String getNaam() {
	return naam;
    }
    public int getKaartnummer() {
	return kaartnummer;
    }
    public double getSaldo() {
	return saldo;
    }
    public void voegSaldoToe(double bedrag) {
	this.saldo =+bedrag;
    }
    public void setGeldigheid(boolean geldig)
    {
	this.isGeldig = geldig;
    }
    public boolean checkOvGeldigheid()
    {
	return isGeldig;
    }
}
