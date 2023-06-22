public class inserter {
    private int[] list;
    private int MAX;
    private int counter;

    public inserter(){
        this.MAX = 10;
        this.list = new int[this.MAX];
        this.counter = 0;
    }

    public inserter(int n){
        this.MAX = n;
        this.list = new int[this.MAX];
        this.counter = 0;
    }

    public void insert(int n){
        if(counter < MAX){
            counter++;
            list[counter - 1]= n;
            if(counter > 1) arrange();
        }
    }

    private void arrange(){
        for(int i = 1; i < counter; i++){
            int j = i;
            while(j > 0 && list[j-1] > list[j]){
                swap(list, j-1, j);
                j--;
            }
        }
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void display(){
        for(int i = 0; i < counter; i++){
            System.out.print(list[i] + " ");
        }
    }
}
