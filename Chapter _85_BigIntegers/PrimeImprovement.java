/*
Make the two improvements to the prime number detection method of the chapter:

  public static Boolean isPrime( BigInteger N )
  {
    BigInteger trial;
    
    trial = new BigInteger( "2" );
    while ( trial.compareTo( N ) < 0 )
    {
      if ( N.mod(trial).equals( BigInteger.ZERO ) )
        return false;
      trial = trial.add( BigInteger.ONE );
    } 
    return true;    
  }
1. If N is even, immediately return false. Otherwise, there is no need to test if any multiple of two divides the number. So, after testing if the number is even, start the trial divisor at three and increment by two each iteration.

2. Trial divisors need not be any larger than the square root of the number, since if the number equals the product N*M, one of N or M must be equal or smaller than the square root.

To implement this, you don't need to calculate the square root of N. The loop generates a sequence of trial divisors. As soon as the square of the current trial divisor exceeds the suspected prime, end the loop.
 */
import java.math.BigInteger;

public class PrimeImprovement{
    public static Boolean isPrime( BigInteger N ){
        BigInteger trial = new BigInteger( "2" );
        if(N.mod(trial).equals(BigInteger.ZERO)){
            System.out.println("num is even");
            return false;
        }
        else trial = trial.add(BigInteger.ONE); //add one to make trial start at value 3.
        while ( trial.compareTo( N ) < 0 ){
            // if(N % trial == 0 || (trial * trial) >= N ) return false;
            if ( trial.multiply(trial).compareTo(N) >= 0 || N.mod(trial).equals( BigInteger.ZERO)  ){
                System.out.println("Num is not prime");
                return false;
            }
            trial = trial.add( BigInteger.ONE );
        } 
        System.out.println("num is prime");
        return true;    
    }

    public static void main(String[] args){
        System.out.println(isPrime(new BigInteger("16")));
    }
}