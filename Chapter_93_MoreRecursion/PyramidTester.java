public class PyramidTester{
  public static int Triangle( int N )
  {
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
  
  public static int Pyramid( int N )
  {
    if ( N == 1 ) 
      return 1;
    else
      return Pyramid ( N-1 ) + Triangle ( N );
  }
  public static void main ( String[] args){
    int argument = 9; 

    int result = Pyramid( argument );
    System.out.println("Pyramid(" + argument + ") is " + result );
  }
}