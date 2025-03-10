package ovreizen;

public class OvPoortje
{
    private int poortjeNummer;
    private boolean isOpen;

    public OvPoortje(int poortjeNummer)
    {
	this.poortjeNummer = poortjeNummer;
	this.isOpen = false;
    }

    public int getPoortjeNummer()
    {
	return poortjeNummer;
    }

    public void openPoort()
    {
	isOpen = true;
	System.out.println("Poortje " + poortjeNummer + " is geopend.");
    }

    public void sluitPoort()
    {
	isOpen = false;
	System.out.println("Poortje " + poortjeNummer + " is gesloten.");
    }

    public boolean checkKaart(OvChipkaart kaart)
    {
	if (kaart.checkGeldigheid())
	{
	    openPoort();
	    return true;
	} else
	{
	    System.out.println("Ongeldige kaart bij poortje " + poortjeNummer);
	    return false;
	}
    }
}
