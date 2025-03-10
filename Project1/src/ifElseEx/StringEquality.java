/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

import java.util.Scanner;

public class StringEquality
{
    public static void main(String[] args)
    {
	while (true)
	{

	    Scanner myObj = new Scanner(System.in);
	    System.out.println("vul een naam in");
	    String name = myObj.next();
	    System.out.println(name);

	    if (name.equals("Moe"))
	    {
		System.out.println("you are the king of rock and roll");
	    } else
	    {
		System.out.println("you are not the king");
	    }
	}
    }
}
