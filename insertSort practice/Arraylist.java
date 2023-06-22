public class Arraylist{
    private int[] list;
    private int counter;
    private int MAX;

    public Arraylist(){
        this.MAX = 10;
        this.list = new int[this.MAX];
        this.counter = 0;
    }

    public Arraylist(int n){
        this.MAX = n;
        this.list = new int[this.MAX];
        this.counter = 0;
    }

    public void insert(int x){
        if(counter < MAX){
            counter++;
            list[counter - 1] = x;

            if(counter > 1){
                arrange(list);
            }
        }
        else{
            System.out.println("list is full");
        }
    }

    private void arrange(int[] l){
        for(int i = 1; i < counter; i++){
            int j = i;
            while(j > 0 && list[j-1] > list[j]){
                swap(list, j-1, j);
                j--;
            }
        }
    }

    private void swap(int[] l, int i, int j){
        int temp = l[i];
        l[i] = l[j];
        l[j] = temp;
    }

    public void display(){
        for(int i = 0; i < counter; i++){
            System.out.print(list[i] + " ");
        }
    }
}