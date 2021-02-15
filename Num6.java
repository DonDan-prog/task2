public class Num6 
{
    public static void main(String[] args)
    {
        System.out.println("Fibonacci(3) -> " + Fibonacci(3));
        System.out.println("Fibonacci(7) -> " + Fibonacci(7));
        System.out.println("Fibonacci(12) -> " + Fibonacci(12));
    }

    /** Simple recursive Fibonacci function */
    public static int Fibonacci(int n)
    {
        if(n == 1 || n == 0)
            return 1;
        else
            return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
}
