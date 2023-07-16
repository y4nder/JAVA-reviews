public class AlgorithmDriver {
    public static void main(String[] args){
        SortAlgo sorter = new SortAlgo();
        int[] arr = {-1, 2, 0, 1, -2};
        int[] arr2 = {0, -2 , 0, 5, 9};

        sorter.display(arr2);
        sorter.quicksort(arr2);
        sorter.display(arr2);
    }    
}
