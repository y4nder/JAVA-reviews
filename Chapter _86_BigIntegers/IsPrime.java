import java.math.BigInteger;
import java.util.Scanner;
public class IsPrime {
        public static boolean IsPrime(BigInteger n){
        BigInteger i = new BigInteger("2");
        while( i.compareTo(n) < 0){
            if( ( i.mod(n) ).equals(BigInteger.ZERO)){
                return false;
            }
            i = i.add(BigInteger.ONE);
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input num: ");
        String input = scan.nextLine();
        scan.close();
        BigInteger n = new BigInteger(input.trim());
        if(IsPrime(n)){
            System.out.println(input + " is a prime.");
        }
        else {
            System.out.println(input + " is a not a prime.");
        }
    }
}
