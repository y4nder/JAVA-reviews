public class Search {
    private int[] a;

    public Search(int[] a){
        this.a = a;
    }

    public int binarySearch(int key){
        int start = 0;
        int end = a.length - 1;
        int steps = 0;
        while(start <= end){
            steps++;
            int mid = (start + end)/2;
            if(a[mid] == key) return steps;
            if(a[mid] > key) end = mid - 1;
            else start = mid + 1;
        }
        return steps;
    }

    public int linearSearch(int key){
        int steps = 0;
        for(int i = 0; i < a.length; i++){
            steps++;
            if(a[i] == key) return steps;
        }
        return -1;
    }
}
