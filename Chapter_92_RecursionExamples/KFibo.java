/*
 * Write a recursive Fibonacci-like function where each term is the sum of the previous three terms. Eg.:

1, 1, 1, 3, 5, 9, 17, 31, 57, ...
 */
public class KFibo {
    public static int kFib(int n) {
        if(n <= 0) return 0;
        else if(n <= 3) return 1;
        else{
            return kFib(n - 1) + kFib(n - 2) + kFib(n - 3);
        }
    }

    public static void main(String[] args){
        int num = 9;
        for(int i = 1; i < num; i++){
            System.out.println(kFib(i));
        }
    }
}
