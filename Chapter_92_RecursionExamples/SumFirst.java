/*
 * Write a recursive function that computes the sum of the first N integers. The base case is sum(0) = 0
 */
public class SumFirst {
    public static int sum(int n) {
        if(n == 0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }

    public static void main(String[] args){
        System.out.println(sum(5));
    }
}
