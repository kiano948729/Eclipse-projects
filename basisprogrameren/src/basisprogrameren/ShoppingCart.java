package basisprogrameren;

import java.util.Iterator;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        char[] chars = custName.toCharArray();
        for (int i = 0; i < chars.length; i++)
	{
            if(chars[i] == ' ') {
        	System.out.println("spatie gevonden op plaats " + i);
            }
	}

        // Use the substring method parse out the first name and print it.


    }

    
}
