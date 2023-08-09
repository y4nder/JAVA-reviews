public class EqualsTester
{
  public static boolean myEquals( String strA, String strB )
  {
    if ( strA.isEmpty() && strB.isEmpty() ) 
      return true;
    else if ( strA.isEmpty() || strB.isEmpty() ) 
      return false;
    else if ( strA.charAt(0) != strB.charAt(0) )
      return false;
    else
      return myEquals( strA.substring(1), strB.substring(1));
  }
   
  public static void main (String[] args)
  {
    String strA = "applecart";
    String strB = "appleCart";
    
    if ( myEquals( strA, strB ) )
      System.out.println(  "\"" + strA + "\" == \"" + strB  + "\"");
    else
      System.out.println(  "\"" + strA + "\" != \"" + strB  + "\"");
    
  }
}