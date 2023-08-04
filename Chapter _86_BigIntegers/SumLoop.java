import java.math.BigInteger;

class SumLoop
{
  public static void main ( String[] args )
  {
    BigInteger count = new BigInteger( "2000000000" );
    BigInteger end   = new BigInteger( "3000000000" );
    BigInteger seven = new BigInteger( "7" );
    BigInteger sum   = BigInteger.ZERO;
    
    while ( count.compareTo( end ) <= 0 )
    {
      if ( !count.mod( seven ).equals( BigInteger.ZERO ) )
        sum = sum.add( count );
      count = count.add( BigInteger.ONE );
    }
    
    System.out.println( "The sum: " + sum );
  }
}
