package mastermind;

import java.util.Scanner;

public class CoinfFlip
{
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	boolean gameStart = true;

	while (gameStart)
	{
	    boolean gameOver = false;
	    System.out.println("Welkom bij het spel CoinFlip!");
	    System.out.println("1. Wil je beginnen?");
	    System.out.println("2. Wil je de regels bekijken?");
	    System.out.println("3. Wil je stoppen?");

	    String keuze = console.nextLine();
	    while (!gameOver)
	    {
		String[] words =
		{ "kop", "munt" };
		String randomChoice = words[(int) (Math.random() * words.length)];
		switch (keuze)
		{
		case "1":
		    System.out.println("Maak een keuze kop of munt");
		    String guess = console.nextLine();
		    if (guess.equals(randomChoice))
		    {
			System.out.println("je hebt het goed");
		    } else
		    {
			System.out.println("je hebt het fout");
		    }
		    if (guess.equals(randomChoice))
		    {
			System.out.println("Wil je nog een keer spelen? (ja/nee)");
			String verder = console.nextLine();

			if (verder.equals("nee"))
			{
			    System.out.println("Bedankt voor het spelen! ;)");
			    gameOver = true;
			}
		    }
		    break;
		case "2":
		    System.out.println("je hebt kop of munt");
		    System.out.println("als kop == kop: gewonnen");
		    System.out.println("als munt == munt: gewonnen");
		    System.out.println("als kop == munt: je hebt verloren");
		    break;
		case "3":
		    System.out.println("bedankt voor het spelen");
		    gameOver = true;
		    break;

		}
	    }
	}
    }
}
