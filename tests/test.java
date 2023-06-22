public class test {
    private int counter;
    private int[] arr;
    public test(){
        this.counter = 0;
        this.arr = new int[5];
    }
    
    public boolean tester(int x){
        if(x > 1){
            counter++;
            arr[counter-1] = x;
            return true;
        }
        else return false;
    }

    public int getcount(){
        return counter;
    }

    public void display(){
        for(int i = 0; i < counter; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
