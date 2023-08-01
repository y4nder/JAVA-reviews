public class SortAlgo {
    public SortAlgo(int[] arr){
    }

    public SortAlgo(){
    }
    
    //quicksorting algorithms
    public void quicksort(int[] arr){
        qs(arr, 0, arr.length-1);
    }

    private void qs(int[] arr, int l, int r){
        if(l >= r) return;

        int pivot = partition(arr, l, r);

        qs(arr, l, pivot-1);
        qs(arr, pivot+1, r);
    }

    private int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l - 1;

        for(int j = l; j < r; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, r);
        return i+1;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            swap(arr, i , smallest(arr, i));
        }
    }

    private int smallest(int[] arr, int index){
        int small = index;
        for(int i = index + 1; i < arr.length; i++){
            if(arr[i] < arr[small]) small = i;
        }
        return small;
    }

    public void display(int[] arr){
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
