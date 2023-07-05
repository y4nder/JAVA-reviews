import java.util.Arrays;

class ArrayDemoOne
{
  public static void main ( String[] args )
  {
    int[] scramble = {148, -23, 67, 110, -17, 44, 103, -12, -8, 91, -12, 43, 0, 9, 80, 34, 21, 44, 15, 11};
    
    System.out.print("Scrambled array:  ");
    for ( int j=0; j < scramble.length; j++ )
      System.out.print( scramble[j] + " ");
      
    System.out.println();
    
    Arrays.sort( scramble );
    
    System.out.print("Sorted    array:  ");
    for ( int j=0; j < scramble.length; j++ )
      System.out.print( scramble[j] + " ");
      
    System.out.println();
       
  }
}