package oop1;


public class SavingsAccount
{
    private double saldo;
    private String name;

    public SavingsAccount(String name, double saldo)
    {
	this.name = name;
	this.setSaldo(saldo);
    }

    public double getSaldo()
    {
	return saldo;
    }

    public String getName()
    {
	return name;
    }

    public void withdraw(double amount)
    {
	if (amount < 0)
	{
	    System.out.println("het saldo kan niet negatief zijn");
	} else if (amount > getSaldo())
	{
	    System.out.println("Je hebt geen saldo");
	} else
	{
	    setSaldo(getSaldo() - amount);
	    System.out.println("Je huidige saldo is nu " + getSaldo());
	}

    }

    public void setSaldo(double saldo)
    {
	this.saldo = saldo;
    }
}

