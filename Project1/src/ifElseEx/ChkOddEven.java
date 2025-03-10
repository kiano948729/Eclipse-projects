/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

import java.util.Scanner;

public class ChkOddEven
{

    public static void main(String args[])
    {
	while (true)
	{
	    Scanner in = new Scanner(System.in);
	    int num = 0;
	    System.out.println("Enter a number between 1-10: ");
	    num = in.nextInt();
	    if ((num % 2) == 0)
	    {
		System.out.println("het getal is even");
	    } else
	    {
		System.out.println("het getal is oneven");
	    }
	}
    }
}
