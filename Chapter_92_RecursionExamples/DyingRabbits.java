public class DyingRabbits {
    public static int fib(int n) {
        if (n <= 2) return 1;
        else if (n == 3) return 2;
        else{
            return fib(n-1) - fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
