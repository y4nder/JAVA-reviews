public class StringTester
{
  public static int length( String str )
  {
    if ( str.isEmpty() ) 
      return 0;
    else
      return 1 + length( str.substring(1) );
  }
   
  public static void main (String[] args)
  {
    String snake = "rattlesnake";
    
    System.out.println( "Length of " + snake + " is: " + length( snake ) );
  }
}