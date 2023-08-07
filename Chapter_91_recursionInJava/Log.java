/*
  Write a program that implements this definition of log base 2 for positive integers N:

log(1) = 0
log(N) = 1 + log(N/2)
Use only integer math for this. Of course, you will not get the same value as given by log function for floating point math. The integer log function is useful when dealing with things that do not exist in fractional amounts.

Compute log(32) using this method. You should find that log(32) = 5. Draw a diagram similar to the one on page 17 of this chapter that shows how this works. You will also find that log(48) = 5. You may be less than happy with this result, but when calculations are restricted to the domain of integers this is the best you can do


added
Write a program that implements this definition of pow base 2 for positive integers N:

pow(0) = 1
pow(N) = 2*pow(N-1)
Use only integer math for this. You should find that pow(5) = 32. So pow( log(32) ) = 32. Sadly, pow( log(48) ) = 32.
 */

public class Log {
    public static int log(int num){
        if(num == 1){
            return 0;
        }
        else{
            return 1 + log(num/2);
        }
    }

    public static int pow(int num){
        if(num == 0){
            return 1;
        }
        else{
            return 2*pow(num-1);
        }
    }

    public static void main(String[] args){
        System.out.println( pow(3) );
    }
}
