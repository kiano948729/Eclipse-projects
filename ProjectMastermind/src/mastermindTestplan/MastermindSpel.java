package mastermindTestplan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MastermindSpel
{
    public static void main(String[] args)
    {
        SpelFuncties functies = new SpelFuncties();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> spelers = new ArrayList<>();
        int[] scorebord = new int[2];
        String[] beschikbareKleuren = {"blauw", "groen", "bruin", "grijs", "roze", "oranje"};

        for (int i = 0; i < 2; i++)
        {
            System.out.print("Voer de naam van speler " + (i + 1) + " in: ");
            spelers.add(scanner.nextLine().trim().toLowerCase());
        }

        boolean[] actief = {true};

        while (actief[0])
        {
            String[] geheimeCode = new String[4];
            String[] poging = new String[4];

            Random random = new Random();
            int makerBreaker = random.nextInt(2);

            String codeMaker = spelers.get(makerBreaker);
            String codeBreaker = spelers.get(1 - makerBreaker);

            System.out.println(codeMaker + " is de codemaker.");
            System.out.println(codeBreaker + " is de codekraker.");

            System.out.println("Typ op elk moment 'stop' om het spel te beëindigen.");

            functies.genereerCode(scanner, beschikbareKleuren, geheimeCode, actief);

            if (!actief[0])
                break;

            functies.wisConsole();
            System.out.println("De code is ingevoerd. Tijd voor de codekraker!");

            boolean gewonnen = false;
            int beurten = 0;

            while (!gewonnen && beurten < 10 && actief[0])
            {
                beurten++;
                System.out.println("\nBeurt " + beurten + " van 10:");
                functies.verwerkPoging(scanner, beschikbareKleuren, poging, actief);

                if (!actief[0])
                    break;

                int zwartePinnen = functies.telZwartePinnen(geheimeCode, poging);
                int wittePinnen = functies.telWittePinnen(geheimeCode, poging);

                System.out.println("Zwarte pinnen (juiste kleur en positie): " + zwartePinnen);
                System.out.println("Witte pinnen (juiste kleur, verkeerde positie): " + wittePinnen);

                if (zwartePinnen == geheimeCode.length)
                {
                    gewonnen = true;
                    System.out.println("Gefeliciteerd " + codeBreaker + "! Je hebt de code gekraakt in " + beurten + " beurt(en)!");
                    scorebord[1 - makerBreaker]++;
                }
                else
                {
                    System.out.println("Probeer het opnieuw...");
                }
            }

            if (!gewonnen && actief[0])
            {
                System.out.println("\nHelaas, " + codeBreaker + " heeft de code niet gekraakt binnen 10 beurten.");
                System.out.println("De geheime code was: " + Arrays.toString(geheimeCode));
            }

            if (actief[0])
            {
                System.out.println("\nScorebord:");
                for (int i = 0; i < spelers.size(); i++)
                {
                    System.out.println(spelers.get(i) + ": " + scorebord[i] + " keer gewonnen");
                }

                System.out.print("Wil je opnieuw spelen? (ja/nee): ");
                String antwoord = scanner.nextLine().trim().toLowerCase();
                if (antwoord.equals("nee"))
                    actief[0] = false;
            }
        }

        System.out.println("Bedankt voor het spelen!");
        scanner.close();
    }
}
