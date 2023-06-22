public class inserter2 {
    private int[] list;
    private int MAX;
    private int counter;

    private String[] stringList;
    private int SMAX;
    private int SCounter;

    public inserter2(){
        this.MAX = 10;
        this.list = new int[this.MAX];
        this.counter = 0;

        this.SMAX = 10;
        this.stringList = new String[this.SMAX];
        this.SCounter = 0;
    }
    
    public inserter2(int n){
        this.MAX = n;
        this.list = new int[this.MAX];
        this.counter = 0;

        this.SMAX = 10;
        this.stringList = new String[this.SMAX];
        this.SCounter = 0;
    }
    
    //methods for string array
    public boolean insert(String string){
        boolean flag = false; 
        if(SCounter < MAX){
            SCounter++;
            stringList[SCounter - 1] = string;
            if(SCounter > 1) arrangeString(); 
            flag = true;
            return flag;
        }
        else return flag;
    }

    private void arrangeString(){
        for(int i = 1; i < SCounter; i++){
            int j = i;
            while(j > 0 && alphaSort(stringList[j-1], stringList[j] ) == true){
                swap(stringList, j-1, j);
                j--;
            }
        }
    }

    private boolean alphaSort(String string1, String string2){
        if(string1.equals(string2)) return false;

        for(int i = 0; i < string1.length() && i < string2.length(); i++){
            if(string1.charAt(i) != string2.charAt(i)){
                if(string1.charAt(i) < string2.charAt(i) ) return false;
                else return true;
            }
        }
        if(string1.length() < string2.length()) return false;
        else return true;
    }

    private void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //methods for integer array
    public boolean insert(int n){
        boolean flag = false;
        if(counter < MAX){
            counter++;
            list[counter - 1] = n;
            if(counter > 1) arrange();
            flag = true;
            return flag;
        }
        else return flag;
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

    public void displayNum(){
        for(int i = 0; i < counter; i++){
            System.out.print(list[i] + ", ");
        }
    }

    public void displayStr(){
        for(int i = 0; i < SCounter; i++){
            System.out.print(stringList[i] + ", ");
        }
    }
}

