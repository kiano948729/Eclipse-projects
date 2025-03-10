
package ifElseEx;

public class ShoppingCart
{

    public static void main(String[] args)
    {
	String custName = "Mary Smith";
	String itemDesc = "Shirt";
	// numeric fields
	double price = 21.99;
	int quantity = 2;
	double tax = 1.04;
	double total;
	String message = custName + " wants to purchase " + quantity + " " + itemDesc;

	// Calculating total cost
	total = (price * quantity) * tax;

	// Declare outOfStock variable and initialize it
	boolean outOfStock = quantity < 1;
	// Test quantity and modify message if quantity > 1.
	if (quantity > 1)
	{
	    message = message + "s";
	    System.out.println(message);
	}

	// Test outOfStock and notify user in either case.
	if (outOfStock == true)
	{
	    System.out.println("artikel is niet meer beschikbaar");
	} else
	{
	    System.out.println(total);
	}

    }

}
