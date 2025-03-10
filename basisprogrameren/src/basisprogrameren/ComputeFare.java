/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basisprogrameren;

import java.util.Scanner;

public class ComputeFare
{

    public static void main(String args[])
    {
	System.out.print("Enter the age \n");
	Scanner console = new Scanner(System.in);
	int age = console.nextInt();
	int fare;
//        Als de age minder dan 11 is, dan fare = 3
	if (age < 11)
	{
	    fare = 3;
	} else if (age > 11 || age < 65)
	{
	    fare = 5;
	}
	else {
	    fare=3;
	}

    }
}
