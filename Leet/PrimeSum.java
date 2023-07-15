public class PrimeSum {
    public static boolean checkPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static int reverseNum(int num){        
        int rev = 0, rem;
        while(num > 0){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        return rev;
    }

    public static void main(String[] args){
        int num = 100;
        for(int i = 2; i <= num; i++){
            if(checkPrime(i) && checkPrime(reverseNum(i)))
                System.out.print(i + " ");
        }
    }
}
