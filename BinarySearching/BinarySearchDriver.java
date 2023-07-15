public class BinarySearchDriver {
    public static void main(String[] args){
        int[] arr = {1, 2, 5, 8, 9, 11};

        Search a1 = new Search(arr);
        System.out.println(a1.binarySearch(9));
        System.out.println(a1.linearSearch(9));

    }       
}
