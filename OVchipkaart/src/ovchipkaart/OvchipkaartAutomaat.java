package ovchipkaart;


public class OvchipkaartAutomaat
{
    private int machineID;
    public String locatie;
    public String[] locaties;


    public OvchipkaartAutomaat(int machineID, String[] locatie)
    {
	this.machineID = machineID;
	this.locaties = new String[]{"test", "rotterdam", "utrecht", "eindhoven", "groningen", "maastricht", "arnhem", "leiden", "zwolle" };
    }

    // Getters
    public int getMachineID()
    {
	return machineID;
    }

    public String getLocatie()
    {
	return locatie;
    }

    public void checkIn(Kaart kaart)
    {
	if (kaart.checkOvGeldigheid())
	{
	    System.out.println("Check-in succesvol op locatie: " + locatie + ". Kaartnummer: " + kaart.getKaartnummer());
	} else
	{
	    System.out.println("Check-in mislukt. De kaart is ongeldig.");
	}
    }

    public void checkUit(Kaart kaart)
    {
	if (kaart.checkOvGeldigheid())
	{
	    System.out.println("Check-uit succesvol op locatie: " + locatie + ". Kaartnummer: " + kaart.getKaartnummer());
	} else
	{
	    System.out.println("Check-uit mislukt. De kaart is ongeldig.");
	}
    }
    public String[] getAlleLocaties() {
        return locaties;
    }
}
