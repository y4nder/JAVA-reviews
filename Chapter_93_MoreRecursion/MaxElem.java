public class MaxElem {
    public static int max(int[] arr, int index){
        //max initialized to the number at its index
        int max = arr[index]; 

        //activation chain if index is at the last element
        if(index == arr.length - 1){
            //return last index as max
            return max;
        }
        else{
            //compare returned element with current max
            if(max < max(arr, index + 1)){
                //return the value at index + 1 if larger
                return max(arr, index + 1);
            }
            else{
                //other wise return the current max 
                return max;
            }
        }
    }

    //main method
    public static void main(String[] args){
        int[] arr = {1, 3, 12, 6, 15, -1, 2};
        //return maximum element from array using recursion
        System.out.println(max(arr,0)); 
    }  
}
