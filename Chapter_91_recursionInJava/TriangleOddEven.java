public class TriangleOddEven {
    public static int T(int n){
        if(n == 0) return 0;
        if(n == 1)  return 1;
        if( n % 2 != 0){
            n--;
        }
        return n + T(n - 1);        

    }

    public static void main(String[] args){
        int n = 3;
        System.out.println(T(n));
    }
}
