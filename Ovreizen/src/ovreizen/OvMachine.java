package ovreizen;

public class OvMachine {
    private int machineID;
    private String locatie;

    public OvMachine(int machineID, String locatie) {
        this.machineID = machineID;
        this.locatie = locatie;
    }

    // Getters
    public int getMachineID() {
        return machineID;
    }

    public String getLocatie() {
        return locatie;
    }

    public void checkIn(OvChipkaart kaart) {
        if (kaart.checkGeldigheid()) {
            System.out.println("Check-in succesvol op locatie: " + locatie + ". Kaartnummer: " + kaart.getKaartNummer());
        } else {
            System.out.println("Check-in mislukt. De kaart is ongeldig.");
        }
    }

    public void checkUit(OvChipkaart kaart) {
        if (kaart.checkGeldigheid()) {
            System.out.println("Check-uit succesvol op locatie: " + locatie + ". Kaartnummer: " + kaart.getKaartNummer());
        } else {
            System.out.println("Check-uit mislukt. De kaart is ongeldig.");
        }
    }
}

