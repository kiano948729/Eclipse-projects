package mastermind;

import java.util.Scanner;

public class MastermindGame
{
    private String[] secretCode;
    private int turnCount;
    private boolean isGameOver;

    public void generateCode()
    {
	this.secretCode = generateSecretCode();
	this.isGameOver = false;
	this.turnCount = 0;
    }

    private String[] generateSecretCode()
    {
	String[] colors =
	{ "rood", "blauw", "groen", "paars" };
	String[] code = new String[4];
	for (int i = 0; i < 4; i++)
	{
	    code[i] = colors[(int) (Math.random() * colors.length)];
	}
	return code;
    }

    public void startGame()
    {
	Scanner console = new Scanner(System.in);

	while (turnCount != 10)
	{
	    turnCount++;
	    System.out.println("Geef een code met een spatie er tussen voorbeeld: rood rood rood rood ");
	    for (String color : secretCode)
	    {
		System.out.print(color + " ");
	    }
	    String[] guessCode = console.nextLine().split(" ");
	    if (isGuessCorrect(guessCode))
	    {
		System.out.println("je hebt de code goed geraden");
		for (String color : secretCode)
		{
		    System.out.print(color + " ");
		}
	    } else
	    {
		geefFeedback(guessCode);
		System.out.println("je hebt het nog niet goed," + (10 - turnCount));
	    }
	}
    }

    private boolean isGuessCorrect(String[] guessCode)
    {
	for (int i = 0; i < 4; i++)
	{
	    if (!guessCode[i].equals(secretCode[i]))
	    {
		return false;
	    }
	}
	return true;
    }

    private void geefFeedback(String[] guessCode)
    {
	int correctColorAndPosition = 0;
	int correctColorWrongPosition = 0;

	boolean[] codeMatched = new boolean[4];
	boolean[] guessMatched = new boolean[4];

//dit is voor het checken of het de juiste kleur en positiw is 
	for (int i = 0; i < 4; i++)
	{
	    if (guessCode[i].equals(secretCode[i]))
	    {
		correctColorAndPosition++;
		codeMatched[i] = true;
		guessMatched[i] = true;

	    }
	}
//dit is voor eht checken if het de juiste kleur heeft maar niet de juiste postie

	for (int i = 0; i < 4; i++)
	{
	    if (guessMatched[i])
	    {
		for (int j = 0; j < 4; j++)
		{
		    if (!codeMatched[j] && guessCode[i].equals(secretCode[j]))
		    {
			correctColorWrongPosition++;
			codeMatched[j] = true;
		    }
		}
	    }
	}

	System.out.println("juiste kleur en positie: " + correctColorAndPosition);
	System.out.println("juiste kleur maar foute positie  : " + correctColorWrongPosition);
    }

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);

	while (true)
	{
	    System.out.println("welkom bij het spel Mastermind");
	    System.out.println("1. wil je beginnen");
	    System.out.println("2. wil je stoppen");
	    String keuze = console.nextLine();
	    switch (keuze)
	    {
	    case "1":
		MastermindGame game = new MastermindGame();
		game.generateCode();
		game.startGame();

		break;
	    case "2":
		System.out.println("doei!");
		break;
	    }
	}

    }
}
