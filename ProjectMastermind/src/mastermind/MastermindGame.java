package mastermind;

import java.util.Scanner;

public class MastermindGame
{
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	MasterMindFunctions game = new MasterMindFunctions();
	String beurt = "beurten";
	while (!game.isGameOver || game.turnCount < 10)
	{
//	    voordat je begint ik heb de secretCode laten uitschrijven om het makkelijker te maken,
//	    verandeer de regel 78 in masterMindFunctions naar een comment om het spel in werkelijkheid te spelen
	    if (!game.isGameOver)
	    {
		System.out.println("Welkom bij het spel Mastermind!");
		System.out.println("1. Wil je beginnen?");
		System.out.println("2. Wil je de regels bekijken?");
		System.out.println("3. Wil je stoppen?");
		System.out.println("Kies een nummer.");
	    }
	    String keuze = console.nextLine();
	    switch (keuze)
	    {
	    case "1":
		game.setDifficult();
		game.generateCode();
		while (!game.isGameOver && game.turnCount < 10)
		{
		    game.turnCount++;
		    if (game.turnCount == 7)
		    {
			System.out.println("Heb je behoefte aan een hint (ja/nee)?");
			String hint = console.nextLine();
			if (hint.equals("ja"))
			{
			    System.out.println("Welk nummer van de code zou je willen hebben 1, 2, 3, of 4?");
			    int nummer = console.nextInt();
			    nummer --;
			    System.out.println("Je hint van de code is " + game.secretCode[nummer]);
			}		
		    }
		    String[] guessCode = game.getUserInput();

		    if (game.checkWin(guessCode))
		    {
			if (game.turnCount == 1)
			{
			    beurt = "beurt";
			}
			System.out.println("Je hebt de code in " + game.turnCount + " " + beurt + " geraden!");

			System.out.println("De geheime code was: " + String.join(" ", game.secretCode));
		    } else
		    {
			game.FirstFeedback(guessCode);
			game.SecondFeedback(guessCode);

			if (game.turnCount < 10)
			{
			    System.out.println("Je hebt het nog niet goed, je hebt nog " + (10 - game.turnCount)
				    + " beurten over.");
			} else
			{
			    System.out.println("Game over! De geheime code was: " + String.join(" ", game.secretCode));
			}
		    }
		    if (game.checkWin(guessCode))
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
		return;
	    default:
		System.out.println("Ongeldige keuze.");
		break;
	    }
	}
	console.close();
    }
}
