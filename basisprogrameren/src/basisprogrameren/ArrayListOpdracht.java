package basisprogrameren;

import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListOpdracht
{

    public static void main(String[] args)
    {
	Scanner console = new Scanner(System.in);
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
	for (int idx = 0; idx < students.size(); idx++)
	{
	    System.out.println(students.get(idx));
	}

	ArrayList<Integer> num = new ArrayList<>();
	num.add(1);
	num.add(2);
	num.add(9);
	num.add(22);

	for (int i = num.size() - 1; i >= 0; i--)
	{
	    System.out.println(num.get(i));
	    if (num.get(i) % 2 == 0)
	    {
		num.remove(i);
	    }
	}
	ArrayList<Double> epx = new ArrayList<>();
	epx.add(34.2);
	epx.add(32.0);
	epx.add(23.0);
	epx.add(50.6);

	for (Double d : epx)
	{
	    if (d % 1 != 0)
	    {
		epx.add(d);
	    }
	}
    }
}
