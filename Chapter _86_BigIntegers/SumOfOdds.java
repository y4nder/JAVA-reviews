/*
Exercise 3 — Sum of Odds
Write a program that asks the user for N and adds up the first N odd integers. Print out the result. Do this in a loop. Use the fact that the N'th odd number is 2*N + 1

Then, write out N2 and compare the two results.
 */

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfOdds {
    public static BigInteger sumOfOdds(BigInteger n){   
        BigInteger sum = BigInteger.ZERO;
        BigInteger i = BigInteger.ZERO;
        while(i.compareTo(n) < 0){
            sum = sum.add(new BigInteger("2").multiply(i).add(BigInteger.ONE));
            i = i.add(BigInteger.ONE);
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input num: ");
        String input = scan.nextLine();
        scan.close();
        BigInteger n = new BigInteger(input.trim());
        System.out.println("Series sum: " + sumOfOdds(n));
        System.out.println("Formula sum: " + n.pow(2));
    }
}
