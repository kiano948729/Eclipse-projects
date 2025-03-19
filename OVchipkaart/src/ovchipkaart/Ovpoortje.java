package ovchipkaart;

public class Ovpoortje 
{
    private int poortjeNummer;
    private boolean isOpen;
    
    public Ovpoortje(int poortjeNummer) {
	this.poortjeNummer= poortjeNummer;
	this.isOpen=false;
    }
    public int getPoortjeNummer()
    {
	return poortjeNummer;
    }
    public void OpenOvpoort(){
	isOpen =true;
	System.out.println("het poortje " + poortjeNummer + " is open");
    }
    public void closeOvpoort() {
	isOpen =false;
	System.out.println("het poortje " + poortjeNummer + " is gesloten");
    }
    public boolean checkKaart(Kaart kaart)
    {
	if (kaart.checkOvGeldigheid())
	{
	    OpenOvpoort();
	    return true;
	} else
	{
	    System.out.println("Ongeldige kaart bij poortje " + poortjeNummer);
	    return false;
	}
    }
}
