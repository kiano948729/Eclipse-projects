package basisprogrameren;
import java.util.Scanner;

public class SwitchEx1
{

    public static void main(String args[])
    {
	Scanner console = new Scanner(System.in);
	System.out.print("Voer een maandnummer in (1-12): ");
        int maandNummer = console.nextInt();

        String maandNaam;
        switch (maandNummer) {
            case 1:
                maandNaam = "Januari";
                break;
            case 2:
                maandNaam = "Februari";
                break;
            case 3:
                maandNaam = "Maart";
                break;
            case 4:
                maandNaam = "April";
                break;
            case 5:
                maandNaam = "Mei";
                break;
            case 6:
                maandNaam = "Juni";
                break;
            case 7:
                maandNaam = "Juli";
                break;
            case 8:
                maandNaam = "Augustus";
                break;
            case 9:
                maandNaam = "September";
                break;
            case 10:
                maandNaam = "Oktober";
                break;
            case 11:
                maandNaam = "November";
                break;
            case 12:
                maandNaam = "December";
                break;
            default:
                maandNaam = "Invalid Month";
        }
        System.out.println("De maand is: " + maandNaam);
    }
}
