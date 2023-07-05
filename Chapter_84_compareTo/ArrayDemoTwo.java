import java.util.Arrays;

class ArrayDemoTwo
{
  public static void main ( String[] args )
  {
    String[] animals = {"bat", "fox", "gnu", "eel", "ant", "dog", "fox", "gnat" };
    
    System.out.print("Scrambled array:  ");
    for ( String anm : animals )
      System.out.print( anm + " ");
      
    System.out.println();
    
    Arrays.sort( animals );
    
    System.out.print("Sorted    array:  ");
    for ( String anm : animals )
      System.out.print( anm + " ");
      
    System.out.println();
       
  }
}