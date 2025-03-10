package lingo;

import java.util.Scanner;

public class Lingo
{
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	LingoFuncionts game = new LingoFuncionts();
	String beurt = "beurten";

	System.out.println("Welkom bij het spel Lingo!");

	while (!game.isGameOver || game.turnCount <= 5)
	{
	    if (!game.isGameOver)
	    {
		System.out.println("Kies een optie:");
		System.out.println("1. Wil je beginnen?");
		System.out.println("2. Wil je de regels bekijken?");
		System.out.println("3. Wil je stoppen?");
	    }
	    String keuze = console.nextLine();

	    switch (keuze)
	    {
	    case "1":
		game.generateLingo();
		game.resetGame();

		System.out.println("Een geheime code van vijf letters is gegenereerd!");

		while (!game.isGameOver && game.turnCount <= 5)
		{
		    game.turnCount++;
		    System.out.println("\nPoging " + game.turnCount + " van 5:");

		    if (game.turnCount == 4)
		    {
			System.out.println("Heb je behoefte aan een hint (ja/nee)?");
			String hint = console.nextLine();
			if (hint.equalsIgnoreCase("ja"))
			{
			    System.out.println("Welke letterpositie wil je weten? Kies 1, 2, 3, 4");
			    int nummer = console.nextInt() - 1;
			    console.nextLine();
			    if (nummer >= 0 && nummer < game.lingoCode.length())
			    {
				System.out.println("Je hint: letter " + (nummer + 1) + " is "+ game.lingoCode.charAt(nummer) + ".");
			    } else
			    {
				System.out.println("Ongeldige positie.");
			    }
			}
		    }

		    String guess = game.getUserInput();

		    if (game.checkWin(guess))
		    {
			if (game.turnCount == 1)
			{
			    beurt = "beurt";
			}
			System.out.println(
				"Gefeliciteerd! Je hebt de code in " + game.turnCount + " " + beurt + " geraden!");
			System.out.println("De geheime code was: " + game.lingoCode);
			game.isGameOver = true;
		    } else
		    {
			game.FirstFeedback(guess);
			game.SecondFeedback(guess);

			if (game.turnCount >= 5)
			{
			    System.out.println("Game over! Het geheime word was: " + game.lingoCode);
			    game.isGameOver = true;
			} else
			{
			    System.out.println("Nog niet goed, je hebt nog " + (5 - game.turnCount) + " pogingen over.");
			}
		    }
		    
		    if (game.checkWin(guess))
		    {
			System.out.println("Wil je nog een keer spelen? (ja/nee)");
			String verder = console.nextLine();

			if (verder.equals("nee"))
			{
			    System.out.println("bedankt voor het spelen ;)");
			    game.isGameOver = true;
			} else if (verder.equals("ja"))
			{
			    game.resetGame();
			}
		    }
		}
		break;

	    case "2":
		game.regels();
		break;

	    case "3":
		System.out.println("Doei!");
		console.close();
		return;

	    default:
		System.out.println("Ongeldige keuze. Probeer opnieuw.");
		break;
	    }
	}
    }
}
