public class SlidingWindow {
    public SlidingWindow(){}

    public int findMaxTotal(int[] a, int k){
        int total = 0, maxTotal;

        for(int i = 0; i < k; i++){
            total += a[i];
        }

        maxTotal = total;

        for(int i = 1; i < a.length - k + 1; i++){
            total -= a[i-1];
            total += a[i+k-1];

            if(maxTotal < total) maxTotal = total;
        }

        return maxTotal;
    }
}
