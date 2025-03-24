package ovchipkaart;

public class OvchipkaartAutomaat
{
    private int machineID;
    public String locatie;
    public String[] bestemming;

    public OvchipkaartAutomaat(int machineID, String[] locatie)
    {
	this.machineID = machineID;
	this.bestemming = new String[]{ "test", "rotterdam", "utrecht", "eindhoven", "groningen", "maastricht", "arnhem", "leiden", "zwolle" };
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
	    System.out.println("Check-in succesvol op locatie: " + locatie + ". Kaartnummer: " + kaart.setKaartnummer());
	} else
	{
	    System.out.println("Check-in mislukt. De kaart is ongeldig.");
	}
    }

    public void checkUit(Kaart kaart)
    {
	if (kaart.checkOvGeldigheid())
	{
	    System.out.println("Check-uit succesvol op locatie: " + locatie + ". Kaartnummer: " + kaart.setKaartnummer());
	} else
	{
	    System.out.println("Check-uit mislukt. De kaart is ongeldig.");
	}
    }

    public String[] getAlleLocaties()
    {
	return bestemming;
    }

    public double tariefBerekenen(String vertrek, String bestemming)
    {
	double prijsPerKM = 1.00; 
	int afstand = afstandInKm(vertrek, bestemming);
	return afstand * prijsPerKM;    
	}

    private int afstandInKm(String vertrek, String bestemming)
    {
	// TODO Auto-generated method stub
	return 0;
    }
}
