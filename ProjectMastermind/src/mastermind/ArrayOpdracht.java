package mastermind;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayOpdracht
{

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
//	int[] klas = { 0, 0, 0, 0, 0 };
//	int toets = 1;
//	for (int i = 0; i < klas.length; i++)
//	{
//	    System.out.println("voer toets " + toets + " in");
//	    System.out.println("score 0-100");
//	    toets++;
//	    klas[i] = console.nextInt();
//	}
//	int gemiddelde = 0;
//	gemiddelde = gemiddelde / klas.length;;
//	System.out.println(gemiddelde);
	ArrayList<String> students = new ArrayList<>();
	
	students.add("amy");
	students.add("bob");
	students.add("cindy");
	students.add("david");
	System.out.println(students.size());
	System.out.println(students);
	students.add(0, "nick");
	students.add(1, "mike");
	students.remove(3);
	System.out.println(students.size());
	System.out.println(students);
	for(int idx = 0; idx < students.size(); idx++) {
	    System.out.println(students.get(idx));
	}
	
//	ArrayList<Integer> num = new ArrayList<>();
//	num.add(1);
//	num.add(2);
//	num.add(9);
//	num.add(22);
//
//	for (int i = num.size() - 1; i >= 0; i--) {
//	    System.out.println(num.get(i));
//	    if (num.get(i) % 2 == 0) {200
//	        num.remove(i);
//	    }
//	}
//	for(int number : num) {
//	    System.out.println("nummer: "+ number);
//	}
//	int[] x = new int[4];
//	for (int i = 0; i < 4; i++)
//	{
//	    x[i] = (int) (Math.random() * 10) + 1;
//	}
//	int sum = 0;
//	for (int i = 0; i < x.length; i++)
//	{
//	    sum += x[i];
//	}
//	System.out.println("som is: " +sum);

	double Fahrenheit, Celsius, Kelvin;
	for (Fahrenheit = 0; Fahrenheit <= 200; Fahrenheit += 10)
	{
	    Celsius = (Fahrenheit - 32) * 5 / 9;
	    Kelvin = Celsius + 273.15;
	    System.out.printf("%10.1f | %7.1f | %7.2f\n", Fahrenheit, Celsius, Kelvin);
	}
    }
}
