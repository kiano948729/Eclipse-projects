package mastermind;

import java.util.Scanner;
import java.util.Timer;

public class MasterMindFunctions
{
    Scanner console = new Scanner(System.in);

    public String[] secretCode;
    public String[] exempleCode;
    public int turnCount;
    public boolean isGameOver;
    public int difficult;
    public int countdownSeconds;

    public MasterMindFunctions()
    {
	this.turnCount = 0;
	this.isGameOver = false;
    }

    public void generateCode()
    {
	this.secretCode = generateSecretCode();
    }

    public void setDifficult()
    {
	System.out.println("Welke moeilijkheid wil je kiezen (easy, medium, hard, (extreme(klassement)");
	String inputDifficult = console.nextLine().toLowerCase();
	if (inputDifficult.equals("easy"))
	{
	    this.exempleCode = new String[]
	    { "rood", "rood", "rood" };
	    this.difficult = 3;
	} else if (inputDifficult.equals("medium"))
	{
	    this.exempleCode = new String[]
	    { "rood", "rood", "rood", "rood" };
	    this.difficult = 4;
	} else if (inputDifficult.equals("hard"))
	{
	    this.exempleCode = new String[]
	    { "rood", "rood", "rood", "rood", "blauw" };
	    this.difficult = 5;
	} else if (inputDifficult.equals("extreme"))
	{
	    System.out.println("je hebt extreme gekozen kies uit (Nightmare, Insane, Legendary)");
	    String inputExtreme = console.nextLine().toLowerCase();

	    if (inputExtreme.equals("nightmare"))
	    {
		this.exempleCode = new String[]
		{ "rood", "rood", "rood", "rood", "blauw", "blauw" };
		this.difficult = 6;
		this.countdownSeconds = 30;
	    } else if (inputExtreme.equals("insane"))
	    {
		this.exempleCode = new String[]
		{ "rood", "rood", "rood", "rood", "blauw"};
		this.difficult = 6;
		this.countdownSeconds = 20;
	    }
	    else if(inputExtreme.equals("legendary"))
	    {
		this.exempleCode = new String[]
		{ "rood", "rood","rood", "blauw", "blauw" };
		this.difficult = 6;
		this.countdownSeconds = 15;
	    }
	}

    }

    private String[] generateSecretCode()
    {
	String[] colors =
	{ "rood", "blauw", "groen", "paars", "geel", "oranje" };
	String[] code = new String[difficult];
	for (int i = 0; i < difficult; i++)
	{
	    code[i] = colors[(int) (Math.random() * colors.length)];
	}
	return code;
    }

    public String[] getUserInput()
    {
	System.out.println(
		"Geef een code met een spatie ertussen. De code kan meerdere keren dezelfde kleur hebben, bijvoorbeeld: "
			+ String.join(" ", exempleCode));
	System.out.println("Je hebt keuze uit rood, blauw, groen, paars, geel en oranje.");
	System.out.println("De geheime code is: " + String.join(" ", secretCode));
	if (this.difficult > 5)
	{
	    System.out.println("Je hebt " + countdownSeconds + " seconden om je input te geven.");

	    // Start de timer
	    Thread timerThread = new Thread(() ->
	    {
		for (int i = countdownSeconds; i >= 0; i--)
		{
		    if (i == 10)
		    {
			System.out.println("\nNog 10 seconden!");
		    }
		    if (i == 5)
		    {
			System.out.println("Nog 5 seconden!");
		    }
		    try
		    {
			Thread.sleep(1000);
		    } catch (InterruptedException e)
		    {
			Thread.currentThread().interrupt();
			return;
		    }
		}
		System.out.println("Tijd is om! Je hebt geen invoer gegeven.");
		System.out.println("herstart het spel om opnieuw te spelen");
	    });

	    timerThread.start();

	    while (true) 
	    {
		
		String userInput = console.nextLine();
		String[] inputArray = userInput.split(" ");

		if (inputArray.length != difficult) 
		{
		    System.out.println("Ongeldige invoer! Je moet precies " + difficult + " kleuren invoeren. Probeer opnieuw:");
		    continue;
		}

		timerThread.interrupt(); 
		return inputArray;
	    }

	} else 
	{
	    while (true) 
	    {
		String userInput = console.nextLine();
		String[] inputArray = userInput.split(" ");

		if (inputArray.length != difficult)
		{
		    System.out.println("Ongeldige invoer! Je moet precies " + difficult + " kleuren invoeren. Probeer opnieuw:");
		    continue;
		}

		return inputArray;
	    }
	}
    }

    public boolean checkWin(String[] guessCode)
    {
	for (int i = 0; i < difficult; i++)
	{
	    if (!guessCode[i].equals(secretCode[i]))
	    {
		return false;
	    }
	}
	return true;
    }

    public void FirstFeedback(String[] guessCode)
    {
	int correctColorAndPosition = 0;
	boolean[] codeMatched = new boolean[difficult];
	boolean[] guessMatched = new boolean[difficult];

	for (int i = 0; i < difficult; i++)
	{
	    if (guessCode[i].equals(secretCode[i]))
	    {
		correctColorAndPosition++;
		codeMatched[i] = true;
		guessMatched[i] = true;
	    }
	}

	System.out.println("Juiste kleur en positie: " + correctColorAndPosition);
    }

    public void SecondFeedback(String[] guessCode)
    {
	int correctColorWrongPosition = 0;
	boolean[] codeMatched = new boolean[difficult];
	boolean[] guessMatched = new boolean[difficult];

	for (int i = 0; i < difficult; i++)
	{
	    if (!guessMatched[i])// Controleert of deze kleur al is gematcht
	    {
		for (int j = 0; j < difficult; j++)
		{
		    if (!codeMatched[j] && guessCode[i].equals(secretCode[j]))
		    {
			correctColorWrongPosition++;
			codeMatched[j] = true;
		    }
		}
	    }
	}

	System.out.println("Juiste kleur maar foute positie: " + correctColorWrongPosition);
    }

    public void resetGame()
    {
	this.turnCount = 0;
	this.isGameOver = false;
	this.secretCode = generateSecretCode();
    }

    public void regels()
    {
	System.out.println("Dit zijn de regels:");
	System.out.println("je vult een viercijferige code in in woorden bijvoorbeeld rood blauw blauw oranje");
	System.out.println("je hebt keuze uit rood blauw groen paars geel oranje");
    }

//    public void clearScreen()
//    {
//        for (int i = 0; i < 50; ++i) {
//            System.out.println();
//        }
//    }
}