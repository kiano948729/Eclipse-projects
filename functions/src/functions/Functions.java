package functions;

import java.util.Scanner;

public class Functions
{

    public static void main(String[] args)
    {
	System.out.println("test");
	Scanner scanner = new Scanner(System.in);
	Functoins functoins = new Functoins();
	String userWord = functoins.input();
	functoins.generateCode(userWord);
	System.out.println("het word is nu " + functoins.scramble);
    }
}
