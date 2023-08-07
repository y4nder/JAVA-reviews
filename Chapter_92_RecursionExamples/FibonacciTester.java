public class FibonacciTester{
  public static void main ( String[] args)
  {
    int argument = 2;  // Get N from the command line.
    
    FibonacciCalc f = new FibonacciCalc();
    int result = f.fib( argument );
    System.out.println("fib(" + argument + ") is " + result );
  }
}