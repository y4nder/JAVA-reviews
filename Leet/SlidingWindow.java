public class SlidingWindow {
    public static void main(String[] args){
        int[] arr = {2, 1, 0, -1};
        int k = 2; 
        int total = 0, maxTotal;

        for(int i = 0; i < k; i++) 
            total += arr[i];
        maxTotal = total;
        
        for(int i = 1; i < arr.length - k + 1; i++){
            total -= arr[i-1];
            total += arr[i+k-1];
            if(maxTotal < total) maxTotal = total;
        }

        System.out.println(maxTotal);

    }
}
