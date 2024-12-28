public class Fibonacci
{
    public static void main(String[] args)
    {
        long number = 50;
        System.out.println(FibonacciIteratave(number));
        System.out.println(FibonacciRecursive(number));
    }

    public static long FibonacciRecursive(long n)
    {
        if (n == 1 || n == 2)
            return n - 1;
        return FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
    }
    public static long FibonacciIteratave(long n)
    {
        long NMinus1 = 0;
        long NMinus2 = 1;
        long CurrentN = 0;
        for(long i = 1; i < n; i++)
        {
            CurrentN = NMinus1 + NMinus2;
            NMinus2 = NMinus1;
            NMinus1 = CurrentN;
        }
        return CurrentN;
    }
}
