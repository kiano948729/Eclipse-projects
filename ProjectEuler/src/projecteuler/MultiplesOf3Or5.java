
package projecteuler;

public class MultiplesOf3Or5 extends Fibonacci
{

    public static void main(String[] args)
    {
	int number = 1000;
	System.out.println(Num(number));
    }
    public static int Num(int number) {
        int sum = 0;
        
        for ( int i = 1; i < number; i++)
            if ( (i % 3 == 0) || (i % 5 == 0) ) sum += i;
            
        return sum;
    }

}
