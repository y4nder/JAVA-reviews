/*
 * The greatest common divisor GCD of two integers a and b is the largest integer k that divides both a and b evenly. (That is, k divides both a and b without leaving a remainder.)

For example, GCD( 6, 9 ) == 3 because 3 evenly divides both 6 and 9 and no greater integer does so. Another example, GCD( 25, 55 ) == 5.

Here is a math-like definition of GCD:

GCD(0,N) = N

GCD(A,B) = GCD( B%A, A )     % is the remainder after integer division B/A
For example,

GCD( 6, 9 ) = GCD( 9%6, 6 ) = GCD( 3, 6 )
GCD( 3, 6 ) = GCD( 6%3, 3 ) = GCD( 0, 3 )
GCD( 0, 3 ) = 3
Translate the math-like definition of GCD into a Java method. Write a main() method to test it.
 */
public class GCDRecur {
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        else{
            return gcd(b % a, a);
        }
    }

    public static void main(String[] args){
        System.out.println(gcd(6, 9));
    }
}
