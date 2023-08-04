/*
    Write a program that asks the user for M and N and computes their gcd. The integers might be very large, so use BigInteger

    The greatest common divisor of two positive integers is the largest integer that divides them both with no remainder. For example,

    gcd( 25, 15 ) == 5, because 5 is the largest integer that divides both 25 and 15

    gcd( 36, 24 ) == 12

    gcd( 21, 10 ) == 1, because 1 is the only divisor 21 and 10 have in common

    gcd( 28, 7 ) == 7

    gcd( N, 0 ) == N, because  N divides N and N also divides 0 (with result 0)
    To calculate the gcd( M, N ) do this:

    while M not equal N
    {
    if M > N
        M = M - n
    else
        N = N - M
    }   
    return M
    For example, say M=36 and N=24

    M=36 not equal N=24
    M = 26-24 = 12
    
    M=12 not equal N=24
    N = 24 - 12 = 12
    
    M and N are equal, gcd = 12
    Write a program that asks the user for M and N and computes their gcd. (There is a faster algorithm for computing the gcd.)

    The class BigInteger has a gcd( BigInteger N) method. Use this in your program to see if your code is working.
 */

import java.math.BigInteger;

public class GCD {
    public static BigInteger gcdLoop(BigInteger n, BigInteger m){
        while(m.compareTo(n) != 0){
            if(m.compareTo(n) > 0){
                m = m.subtract(n);
            }
            else{
                n = n.subtract(m);
            }
        }
        return m;
    }

    public static void main(String[] args){
        BigInteger n = new BigInteger("400");
        BigInteger m = new BigInteger("3");
        System.out.println(gcdLoop( n, m ));
        System.out.println(n.gcd(m));
    }
}
