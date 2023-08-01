class TestCompareTo
{
  public static void main ( String[] args )
  {
    String appleA = new String("apple"); // these are two distinct objects 
    String appleB = new String("Apple"); // these are two distinct objects
    String berry  = new String("berry");
    //String cherry = new String("cherry");
    String A, B;
    
    A = appleA; B = appleB;
    System.out.print(  A + ".compareTo(" + B + ") returns ");
    if ( A.compareTo(B) == 0) System.out.println("Zero");
    if ( A.compareTo(B) < 0 ) System.out.println("Negative");
    if ( A.compareTo(B) > 0 ) System.out.println("Positive");
    System.out.println(  A + ".equals(" + B + ") is " + A.equals(B) );
    System.out.println();
    
    A = appleA; B = berry;
    System.out.print(  A + ".compareTo(" + B + ") returns ");
    if ( A.compareTo(B) == 0) System.out.println("Zero");
    if ( A.compareTo(B) < 0 ) System.out.println("Negative");
    if ( A.compareTo(B) > 0 ) System.out.println("Positive");
    System.out.println(  A + ".equals(" + B + ") is " + A.equals(B) );
    System.out.println();
    
    A = berry; B = appleA;
    System.out.print(  A + ".compareTo(" + B + ") returns ");
    if ( A.compareTo(B) == 0) System.out.println("Zero");
    if ( A.compareTo(B) < 0 ) System.out.println("Negative");
    if ( A.compareTo(B) > 0 ) System.out.println("Positive");
    System.out.println(  A + ".equals(" + B + ") is " + A.equals(B) );
 }
}