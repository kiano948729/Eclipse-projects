/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifElseEx;

import java.util.Scanner;

public class AgeValidity
{

    public static void main(String[] args)
    {
	while(true) {
	    
	Scanner myObj = new Scanner(System.in);
	System.out.println("vul je leeftijd");
	int x = myObj.nextInt();
	
	boolean drivingUnderAge = false;
	drivingUnderAge = x >= 18;
	
	if (drivingUnderAge == true) {
		System.out.println("je mag rijden");
	}
	else {
	    System.out.println("je mag niet rijden");
	}
	
	}
    }
}
