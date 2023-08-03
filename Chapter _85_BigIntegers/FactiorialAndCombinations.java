import java.math.BigInteger;
import java.util.Scanner;

public class FactiorialAndCombinations {
    public static BigInteger factorial(BigInteger start, BigInteger max){
        BigInteger fact = start;
        BigInteger i = start.add(BigInteger.ONE);
        while(i.compareTo(max) < 0 || i.equals(max)){
            fact = fact.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return fact;
    }

    public static BigInteger factorial(BigInteger max){
        BigInteger fact = BigInteger.ONE;
        BigInteger i = BigInteger.ONE;
        while(i.compareTo(max) < 0 || i.equals(max)){
            fact = fact.multiply(i);
            i = i.add(BigInteger.ONE);
        }
        return fact;
    }

    public static long factorial(long max){
        long fact = 1;
        for(int i = 1; i <= max; i++){
            fact *= i;
        }
        return fact;
    }

    public static BigInteger combination(BigInteger n, BigInteger r){
        BigInteger comb = BigInteger.ZERO;
        if(n.compareTo(r) < 0){
            System.out.println("n must be greater than r");
            return comb;
        }
        BigInteger max = n.subtract(r);
        comb = factorial( max.add(BigInteger.ONE), n).divide( factorial(n.subtract(max)) );
        return comb;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input n: ");
        String num1 = scan.nextLine();
        System.out.print("Input r: ");
        String num2 = scan.nextLine();
        scan.close();
        BigInteger n = new BigInteger(num1.trim());
        BigInteger r = new BigInteger(num2.trim());
        System.out.println(num1 + " things taken " + num2 + " at a time = " + combination(n, r));
        
    }
}
