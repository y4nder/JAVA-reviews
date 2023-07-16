public class Quicksorter{
    static void quicksort(int[] a){
        qs(a, 0, a.length - 1);
    }

    static void qs(int[] a, int l, int r){
        if(l >= r) return;

        int p = partition(a, l, r);

        qs(a, l, p - 1);
        qs(a, p + 1, r);
    }

    static int partition(int[] a, int l, int r){
        int pivot = a[r];
        int i = l - 1;
        for(int j = l; j < r; j++){
            if(a[j] < pivot){
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, r);
        return  i + 1;
    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void display(int[] a){
        System.out.println("");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {2, -1, 5, 0};

        display(arr);

        quicksort(arr);

        display(arr);
    }
}