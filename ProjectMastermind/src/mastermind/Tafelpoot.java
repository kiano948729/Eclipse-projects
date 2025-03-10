package mastermind;

import java.util.Scanner;

public class Tafelpoot
{
    private String naam;
    private int prijs;
    private boolean scheef;

    public Tafelpoot(String naam, int prijs, boolean scheef)
    {
	this.naam = naam;
	this.prijs = prijs;
	this.scheef = scheef;
    }

    public int prijs()
    {
	return prijs * 100;
    }

    public boolean scheef()
    {
	return scheef = false;
    }

    public static void main(String[] args)
    {
	Tafelpoot tafelpoot = new Tafelpoot("wilco", 60, true);
    }
}
