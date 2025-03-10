package oop1;

import java.util.Scanner;


public class AccountTest
{
    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
	SavingsAccount account = new SavingsAccount("wilco", 30000.0);

	System.out.println("Account van: " + account.getName());
	System.out.println("Saldo: " + account.getSaldo());

	System.out.println("hoeveel wil je eraf halen in hele getallen");
	System.out.println("jij krijgt 5% rente");
	System.out.println("hoeveel jaar wil je stilstaan");
	int jaar = console.nextInt();
	for (int i = 0; i < jaar; i++)
	{
	    account.setSaldo(account.getSaldo() * 1.05);
	}
	System.out.println(account.getSaldo());

	double keuze = console.nextDouble();
	account.withdraw(keuze);
	console.close();
    }
}



