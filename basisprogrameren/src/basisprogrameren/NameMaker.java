package basisprogrameren;

import java.util.Scanner;

public class NameMaker
{

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	String firstName;
	String middleName = null;
	String lastName;
	String fullName;
	String space;
	System.out.println("welkom voornaam");
	firstName = console.nextLine();
	System.out.println("heb je een middlenaam");
	String keuze = console.nextLine();
	if (keuze.equals("ja"))
	{
	    middleName = console.nextLine();
	}
	lastName = console.nextLine();

	if (middleName == null)
	{
	    space = "";
	} else
	{
	    space = " ";
	}
	fullName = firstName + " " + middleName + space + lastName;
	System.out.println(fullName);
    }

}
