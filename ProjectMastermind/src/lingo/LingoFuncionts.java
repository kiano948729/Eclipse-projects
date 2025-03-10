package lingo;

import java.util.Scanner;

public class LingoFuncionts
{
    public String lingoCode;
    public int turnCount;
    public boolean isGameOver = false;

    public LingoFuncionts()
    {
	this.turnCount = 0;
	this.isGameOver = false;
    }

    // Generate a random word as the secret code
    public void generateLingo()
    {
	this.lingoCode = generateSecretLingo();
    }

    public String generateSecretLingo()
    {
	String[] words =
	{ "tafel", "lader", "stoel", "appel", "bomen", "koken", "slaap", "varen" };
	return words[(int) (Math.random() * words.length)];
    }

    public String getUserInput()
    {
	Scanner console = new Scanner(System.in);
	System.out.print("Voer je gok in (vijf-letter woord): ");
	System.out.println(lingoCode);
	return console.nextLine().trim().toLowerCase();
    }

    public boolean checkWin(String guess)
    {
	return guess.equals(lingoCode);
    }

    public void FirstFeedback(String guess)
    {
	StringBuilder feedback = new StringBuilder("Feedback: ");
	for (int i = 0; i < guess.length(); i++)
	{
	    if (i < lingoCode.length() && guess.charAt(i) == lingoCode.charAt(i))
	    {
		feedback.append(guess.charAt(i)).append(" ");
	    } else
	    {
		feedback.append("_ ");
	    }
	}
	if (!isGameOver || turnCount <= 5)
	{
	    System.out.println(feedback.toString().trim());
	}
    }

    public void SecondFeedback(String guess)
    {
	int correctButWrongPosition = 0;
	boolean[] codeMatched = new boolean[lingoCode.length()];
	boolean[] guessMatched = new boolean[guess.length()];

	for (int i = 0; i < guess.length(); i++)
	{
	    if (i < lingoCode.length() && guess.charAt(i) == lingoCode.charAt(i))
	    {
		codeMatched[i] = true;
		guessMatched[i] = true;
	    }
	}

	for (int i = 0; i < guess.length(); i++)
	{
	    if (!guessMatched[i])
	    {
		for (int j = 0; j < lingoCode.length(); j++)
		{
		    if (!codeMatched[j] && guess.charAt(i) == lingoCode.charAt(j))
		    {
			correctButWrongPosition++;
			codeMatched[j] = true;
			break;
		    }
		}
	    }
	}
	System.out.println("Aantal letters correct maar op de verkeerde positie: " + correctButWrongPosition);
    }

    // Reset the game
    public void resetGame()
    {
	this.turnCount = 0;
	this.isGameOver = false;
	this.lingoCode = generateSecretLingo();
	System.out.println("Het spel is gereset. Een nieuwe geheime code is gegenereerd.");
    }

    // Display the game rules
    public void regels()
    {
	System.out.println("Dit zijn de regels van Lingo:");
	System.out.println("1. Raad het geheime vijf-letterige woord.");
	System.out.println("2. Na elke gok krijg je feedback op letters op de juiste en verkeerde posities.");
	System.out.println("3. Je hebt maximaal 10 pogingen om het woord te raden.");
    }
}
