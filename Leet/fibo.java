public class fibo {
    public static void main(String[] args){
        int sum = 0;
        int n = 20;
        int i = 1;

        do{
            System.out.print(sum + " ");
            sum+=i;
            i = sum - i;
        }while(sum < n);

    }
}
