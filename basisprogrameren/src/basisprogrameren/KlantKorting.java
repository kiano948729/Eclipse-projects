package basisprogrameren;

import java.util.Scanner;

public class KlantKorting
{
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	System.out.println("wat is je leeftijd");
	int leeftijd = console.nextInt();
	System.out.println("ben je lid true/false");
	boolean lid = console.nextBoolean();
	if (leeftijd < 18 || leeftijd >= 65)
	{
	    System.out.println("je krijgt 10 procent korting");
	} else if (leeftijd > 18 && leeftijd < 65 && lid == true)
	{
	    System.out.println("je krijgt 15 procent korting");
	} else
	{
	    System.out.println("je krijgt geen korting");
	}
    }
}