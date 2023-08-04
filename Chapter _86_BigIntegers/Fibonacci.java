/*
 * If factorial is here, can Fibonacci be far behind? Like factorial, the Fibonacci sequence grows rapidly. It is a sequence of integers that starts out as

1, 1
The next term in the series is the sum of the previous two:

1, 1, 2
This keeps going as long as you want:

1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
The rule for the N'th term of the sequence is is:

Fib( 1 ) = 1
Fib( 2 ) = 1
Fib( N ) = Fib( N-2 ) + Fib( N-1 )
Write a program that asks the user for N and prints out the N'th term of the series.

? java Exercise05
N  : 10
Fibonacci = 55

? java Exercise05
N  : 20
Fibonacci = 6765

? java Exercise05
N  : 100
Fibonacci = 354224848179261915075
N can be a long and the counting loop that calculates the terms can be an ordinary for loop that counts up to N. It is unlikely that anyone will want to calculate Fibonacci for an N that takes a BigInteger to express. This is similar to the pow() method, that takes an int argument for the same reason.

If you compute this recursively, it will be very much slower and your program will likely run out of memory:
 */

import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger fib(BigInteger n){
        BigInteger fibo = BigInteger.ONE;
        BigInteger i = BigInteger.ZERO;
        for(BigInteger j = BigInteger.ONE; j.compareTo(n) < 0; j = j.add(BigInteger.ONE)){
            fibo = fibo.add(i);
            i = fibo.subtract(i);
        }
        return fibo;
    }
    public static void main(String[] args){
        BigInteger n = new BigInteger("10");
        BigInteger fibo = fib(n.subtract(new BigInteger("2"))).add(fib(n.subtract(BigInteger.ONE)));
        System.out.println(fibo);
    }
}
