package basisprogrameren;

import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
	Scanner console = new Scanner(System.in);
        System.out.print("Enter the movie ticket price \n");
	int price = console.nextInt();
	if(price >=12) {
	    System.out.println("I’m interested in watching the movie”");
	}
	else if(price ==5){
	    System.out.println("I’m not interested in watching the movie”");
	}


    }
}
