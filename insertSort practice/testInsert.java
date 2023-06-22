public class testInsert {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String []args){
        int[] list = {2, 1, 56, 0};

        for(int i = 1; i < list.length; i++){
            int j = i;    
            while(j > 0 && list[j-1] > list[j]){
                swap(list, j-1, j);
                j--;
            }
        }

        System.out.println("arranged");

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }


}
