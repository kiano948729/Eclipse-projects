package ovchipkaart;

public class Ovpoortje
{
    private int poortjeNummer;
    private boolean isOpen;

    public Ovpoortje(int poortjeNummer)
    {
	this.poortjeNummer = poortjeNummer;
	this.isOpen = false;
    }

    public int getPoortjeNummer()
    {
	return poortjeNummer;
    }

    public void Open()
    {
	isOpen = true;
	System.out.println("het poortje " + poortjeNummer + " is open");
    }

    public void close()
    {
	isOpen = false;
	System.out.println("het poortje " + poortjeNummer + " is gesloten");
    }

    public boolean checkKaart(Kaart kaart)
    {
	if (kaart.checkOvGeldigheid())
	{
	    Open();
	    return true;
	} else
	{
	    System.out.println("Ongeldige kaart bij poortje " + poortjeNummer);
	    return false;
	}
    }
}
