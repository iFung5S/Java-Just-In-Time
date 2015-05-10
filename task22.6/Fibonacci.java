// A program to calculate Fibonacci with a memo function.
public class Fibonacci
{
  // Class variable to store the fibonacci on the way of calculation.
  private static int[] fibonacci;

  public static void main(String[] args) throws RuntimeException
  {
    int number = Integer.parseInt(args[0]);
    fibonacci = new int[number + 1];
    System.out.println("The fibonacci of " + number + " is " + fibonacci(number));
  } // main

  // Find the Fibonacci of n which must be positive.
  public static int fibonacci(int n)
  {
    // Base case when n is 1 or 2.
    fibonacci[1] = 1;
    try { fibonacci[2] = 1; } catch(Exception e) {}

    // Recurisive case when n > 2.
    if(fibonacci[n] != 0)
      return fibonacci[n];
    else
      return fibonacci[n] = fibonacci(n - 1) + fibonacci (n - 2);
  } // fibonacci
} // class Fibonacci
