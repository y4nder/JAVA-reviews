/*
 Consider this definition of the sum of the elements in an integer array:

sum( array, index ) = 0, if index == array.length 

sum( array, index ) = array[index] + sum( array, index+1), if index < array.length
Write a Java method that implements this definition and a program to test it. The method should look something like:

int sum ( int[] array, int index )
{
 . . .
}
The testing program will call sum( testArray, 0 ).

Improve the previous program by extending the definition of sum() so that the user does not need to include that odd-looking zero in the first call to the function:

sum( array ) = sum( array, 0 ) 

sum( array, index ) = 0, if index == array.length 

sum( array, index ) = array[index] + sum( array, index+1), if index < array.length
To implement this, write a second method sum( int[] array) that overloads the method of exercise 1. The testing program will call sum( testArray ).
 */
public class SumArray {
    public static int sum(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }
        else{
            return arr[index] + sum(arr, index + 1);
        }
    }

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }
}
