/*
 * A prime number is an integer that cannot be divided by any integer other than one and itself. For example, 7 is prime because its only divisors are 1 and 7. The integer 8 is not prime because its divisors are 1, 2, 4, and 8.

Another way to define prime is:

prime(N)    = false, if N < 2

prime(N)    = prime(N, 2)

prime(N, N) = true

prime(N, D) = if D divides N 
                 false
              else 
                 prime(N, D+1)           
Example:

prime(4)   = prime(4,2)
prime(4,2) = false
Another example,

prime(7)   = prime(7,2)
prime(7,2) = prime(7,3)
prime(7,3) = prime(7,4)
prime(7,4) = prime(7,5)
prime(7,5) = prime(7,6)
prime(7,6) = prime(7,7)
prime(7,7) = true
Another example,

prime(35)   = prime(35,2)
prime(35,2) = prime(35,3)
prime(35,3) = prime(35,4)
prime(35,4) = prime(35,5)
prime(35,5) = false
Translate the math-like definition of prime into two Java methods that return boolean. Use the % operator to test divisibility. Put your method into a class, write a testing class, and test your program. (Look at FactorialTester.java in this chapter.)

If you run your program for integers larger than about 12,000 (on a Windows system) you will run out of memory. Your program will stop running and report a StackOverflowError. This is because each activation in the activation chain requires some memory, and 12,000 activations uses up all the memory that has been reserved for this use.

The method can be improved by noting that if D*D is greater than N, no greater D will divide N. Modify the definition of prime and see what difference it makes.

This is not a good method for finding primes. If you really want to compute primes use iteration. Even better, use the Sieve of Eratosthenes.
 */

public class PrimeNumbersRecur {
    public static boolean prime(int n){
        if(n < 2){
            return false;
        }
        else{
            return prime(n, 2);
        }
    }

    public static boolean prime(int n, int d){
        if(n == d){
            return true;
        }
        else if(d % n == 0){
            return false;
        }            
        else{
            return prime(n, d+1);
        }
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        else{
            for(int i = 2; i < n; i++){
                if(n % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args){
        System.out.println(isPrime(13));
    }
}
