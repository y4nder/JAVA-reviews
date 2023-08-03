/*
 * Write a program that asks the user for N and adds up the integers between 1 and N. Print out the result. Do this in a loop.

Then, use the formula

SUM (1 to N) = N*(N+1)/2
to compute the same thing. Print out that result. Hopefully your results are the same for both methods.

? java Exercise01
N  : 1000
Series  Sum: 500500
Formula Sum: 500500

? java Exercise01
N  : 1000000000
Series  Sum: 500000000500000000
Formula Sum: 500000000500000000

? java Exercise01
N  : rats
Exception in thread "main" java.lang.NumberFormatException:
 */

import java.math.BigInteger;
import java.util.Scanner;

public class WarmUp {
    //add up 1 up to N using loop
    public static BigInteger sumLoop(BigInteger n){
        BigInteger i = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        while(i.compareTo(n) < 0 || i.equals(n)){
            sum = sum.add(i);
            i = i.add(BigInteger.ONE);
        }
        return sum;
    }
    //add up 1 up to N using formula
    public static BigInteger sumFormula(BigInteger n){
        BigInteger sum;
        sum = n.multiply(n.add(BigInteger.ONE)).divide(new BigInteger("2"));
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Input num: ");
        String input = scan.nextLine();
        scan.close();
        BigInteger n = new BigInteger(input.trim());
        
        //System.out.println("Series Sum: " + sumLoop(n));
        System.out.println("\n\nFormmula Sum: " + sumFormula(n));
    }
}
