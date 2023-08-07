/*
 * Implement the Fibonacci series modulo N. As with the usual series, each term is the sum of the previous two terms. But now the sum is the remainder after integer division by N

For example, if N is 10, the series is

1 1 2 3 5 8 13=3 11=1 4 5 9 14=4 13=3 7 10=0 ..
 */
public class RabbitsModN {
    public static int fibMod(int n, int m){
        if(n <= 2) return 1;
        else{
            return ( fibMod(n-1,m) + fibMod(n-2,m) ) % m;
        }
    }
    
    public static void main(String[] args){
        int m = 10;
        for(int i = 1; i <= 10; i++){
            System.out.print(fibMod(i,m) + " ");
        }
    }
}
