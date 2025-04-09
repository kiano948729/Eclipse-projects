package ovchipkaart;

import java.util.HashMap;

public class OvchipkaartAutomaat
{
    private int machineID;
    public String locatie;
    public String[] bestemming;
    public int afstand;
    private HashMap<String, Integer> locaties;

    public OvchipkaartAutomaat(int machineID, String string)
    {
	this.machineID = machineID;
	this.setLocaties(new HashMap<>());
	this.getLocaties().put("rotterdam", 50);
	this.getLocaties().put("utrecht", 60);
	this.getLocaties().put("eindhoven", 30);
	this.getLocaties().put("groningen", 70);
	this.getLocaties().put("maastricht", 80);
	this.getLocaties().put("arnhem", 90);
	this.getLocaties().put("leiden", 20);
	this.getLocaties().put("zwolle", 60);

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
	    System.out
		    .println("Check-in succesvol op locatie: " + locatie + ". Kaartnummer: " + Kaart.setKaartnummer());
	} else
	{
	    System.out.println("Check-in mislukt. De kaart is ongeldig.");
	}
    }

    public void checkUit(Kaart kaart)
    {
	if (kaart.checkOvGeldigheid())
	{
	    System.out
		    .println("Check-uit succesvol op locatie: " + locatie + ". Kaartnummer: " + Kaart.setKaartnummer());
	} else
	{
	    System.out.println("Check-uit mislukt. De kaart is ongeldig.");
	}
    }

    public String[] getAlleLocaties()
    {
	return bestemming;
    }
    

    public double tariefBerekenen(String vertrek, String bestemming) {
	    afstand = Math.abs(getLocaties().get(vertrek) - getLocaties().get(bestemming));
	    double prijsPerKm = 0.25;
	    return afstand * prijsPerKm;
	}

    public HashMap<String, Integer> getLocaties()
    {
	return locaties;
    }

    public void setLocaties(HashMap<String, Integer> locaties)
    {
	this.locaties = locaties;
    }

}
