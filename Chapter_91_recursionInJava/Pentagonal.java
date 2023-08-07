public class Pentagonal {
    //recursion
    public static int P(int num){
        if(num == 1){
            return 1;
        }
        else{
            return P(num - 1) + 4 + (3 * ( num - 2));
        }
    }

    //for loop
    public static int PLoop(int num){
        int res = 1;
        if(num == 1) return res;
        for(int i = 2; i <= num; i++){
            res += 4 + (3 * (i - 2));
        }
        return res;
    }

    //while loop
    public static int PWhile(int num){
        int res = 1;
        if(num == 1) return res;
        int i = 2;
        while(i <= num){
            res += 4 + ( 3 * (i - 2) );
            i++;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println("P(1) = "  + PWhile(1));
        System.out.println("P(2) = "  + PWhile(2));
        System.out.println("P(3) = "  + PWhile(3));
        System.out.println("P(4) = "  + PWhile(4));
        System.out.println("P(5) = "  + PWhile(5));
    }
}
