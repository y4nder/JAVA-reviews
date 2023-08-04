/*
 * Write a program that asks the user for N and M and adds up the integers between N and M (inclusive). Print out the result. Do this in a loop.

Then, use the formula

SUM(N to M) = SUM( 1 to M ) - SUM( 1 to N-1 )  
to compute the same thing. Print out that result. Hopefully your results are the same for both methods.

? java Exercise02
M (start): 10
N (end)  : 100
Series  Sum: 5005
Formula Sum: 5005

? java Exercise02
M (start): 1000
N (end)  : 2000
Series  Sum: 1501500
Formula Sum: 1501500

? java Exercise02
M (start): 10000000
N (end)  : 23000000
Series  Sum: 214500016500000
Formula Sum: 214500016500000

? java Exercise02
M (start): -1000
N (end)  : 1000
Series  Sum: 0
Formula Sum: 0
 */

import java.math.BigInteger;
import java.util.Scanner;

public class AddUpInRange {

    public static BigInteger addRange(BigInteger n, BigInteger m){
        BigInteger sum = BigInteger.ZERO;
        while( n.compareTo(m) < 0 || n.equals(m)){
            sum = sum.add(n);
            n = n.add(BigInteger.ONE);
        }
        return sum;
    }

    public static BigInteger addRangeFormula(BigInteger n, BigInteger m){
        BigInteger sum ;
        //SUM(N to M) = SUM( 1 to M ) - SUM( 1 to N-1 )  
        sum = m.multiply(m.add(BigInteger.ONE)).divide(new BigInteger("2")).subtract(n.subtract(BigInteger.ONE)
                .multiply(n.subtract(BigInteger.ONE).add(BigInteger.ONE)).divide(new BigInteger("2")));
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input start: ");
        String input1 = scan.nextLine();
        System.out.print("Input end: ");
        String input2 = scan.nextLine();
        scan.close();
        BigInteger n = new BigInteger(input1.trim());
        BigInteger m = new BigInteger(input2.trim());
        System.out.println("Series Sum: " + addRange(n, m));
        System.out.println("Series Sum: " + addRangeFormula(n, m));
    }
}
