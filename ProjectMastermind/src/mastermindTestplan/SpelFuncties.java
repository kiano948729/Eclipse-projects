package mastermindTestplan;

import java.util.Arrays;
import java.util.Scanner;

public class SpelFuncties
{
    // Genereer geheime code
    public void genereerCode(Scanner scanner, String[] beschikbareKleuren, String[] geheimeCode, boolean[] actief)
    {
        System.out.println("Kies uit de volgende kleuren: " + Arrays.toString(beschikbareKleuren));

        for (int i = 0; i < geheimeCode.length; i++)
        {
            if (!actief[0])
                break; // Stop als 'stop' wordt ingevoerd
            boolean geldigeKeuze = false;
            while (!geldigeKeuze)
            {
                System.out.println("Kies de " + (i + 1) + "e kleur:");
                String keuze = scanner.nextLine().trim().toLowerCase();

                if (keuze.equals("stop"))
                {
                    actief[0] = false; // Spel stoppen
                    break;
                }
                else if (Arrays.asList(beschikbareKleuren).contains(keuze))
                {
                    geheimeCode[i] = keuze; // Kleur opslaan
                    geldigeKeuze = true;
                }
                else
                {
                    System.out.println("Ongeldige kleur. Kies een van de volgende: " + Arrays.toString(beschikbareKleuren));
                }
            }
        }
    }

    // Console opschonen
    public void wisConsole()
    {
        for (int i = 0; i < 30; i++)
        {
            System.out.println();
        }
    }

    // Aantal zwarte pinnen tellen (juiste kleur op juiste plek)
    public int telZwartePinnen(String[] geheimeCode, String[] poging)
    {
        int zwartePinnen = 0;
        boolean[] codeGebruikt = new boolean[geheimeCode.length];
        boolean[] pogingGebruikt = new boolean[poging.length];

        for (int i = 0; i < geheimeCode.length; i++)
        {
            if (geheimeCode[i].equals(poging[i]))
            {
                zwartePinnen++;
                codeGebruikt[i] = true;
                pogingGebruikt[i] = true;
            }
        }
        return zwartePinnen;
    }

    // Aantal witte pinnen tellen (juiste kleur, verkeerde plek)
    public int telWittePinnen(String[] geheimeCode, String[] poging)
    {
        int wittePinnen = 0;
        boolean[] codeGebruikt = new boolean[geheimeCode.length];
        boolean[] pogingGebruikt = new boolean[poging.length];

        for (int i = 0; i < geheimeCode.length; i++)
        {
            if (geheimeCode[i].equals(poging[i]))
            {
                codeGebruikt[i] = true;
                pogingGebruikt[i] = true;
            }
        }

        for (int i = 0; i < poging.length; i++)
        {
            if (!pogingGebruikt[i])
            {
                for (int j = 0; j < geheimeCode.length; j++)
                {
                    if (!codeGebruikt[j] && poging[i].equals(geheimeCode[j]))
                    {
                        wittePinnen++;
                        codeGebruikt[j] = true;
                        pogingGebruikt[i] = true;
                        break;
                    }
                }
            }
        }
        return wittePinnen;
    }

    // Poging van de speler verwerken
    public void verwerkPoging(Scanner scanner, String[] beschikbareKleuren, String[] poging, boolean[] actief)
    {
        System.out.println("Raad de code door kleuren te kiezen uit: " + Arrays.toString(beschikbareKleuren));

        for (int i = 0; i < poging.length; i++)
        {
            if (!actief[0])
                break;
            boolean geldigeKeuze = false;
            while (!geldigeKeuze)
            {
                System.out.println("Kies de " + (i + 1) + "e kleur:");
                String keuze = scanner.nextLine().trim().toLowerCase();

                if (keuze.equals("stop"))
                {
                    actief[0] = false;
                    break;
                }
                else if (Arrays.asList(beschikbareKleuren).contains(keuze))
                {
                    poging[i] = keuze;
                    geldigeKeuze = true;
                }
                else
                {
                    System.out.println("Ongeldige kleur. Kies een van de volgende: " + Arrays.toString(beschikbareKleuren));
                }
            }
        }
    }
}
