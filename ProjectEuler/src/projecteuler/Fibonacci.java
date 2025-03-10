package projecteuler;

public class Fibonacci
{

    static long Fib(long n)
    {
	if (n <= 2)
	{
	    return 1;
	} else
	{
	    return Fib(n - 1) + Fib(n - 2);
	}
    }

    public static void main(String[] args)
    {
	long value = 8;
	System.out.println(Fib(value));
    }
}
