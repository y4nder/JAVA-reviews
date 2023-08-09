public class ReverseTester
{
  public static String reverse( String str )
  {
    if ( str.isEmpty() )       // use str.equals("") for older version of Java 
      return "";
    else 
      return reverse( str.substring(1) ) + str.charAt(0) ;
  }
   
  public static void main (String[] args)
  {
    String strA = "Applecart";  
    System.out.println(  "Reverse of \"" + strA + " is \"" + reverse( strA ) + "\"");
  }
}