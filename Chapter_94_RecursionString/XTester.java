public class XTester
{
    public static int xLength( String str )
    {
        if ( str.isEmpty() ) 
        return 0;

        else if ( str.charAt(0) == 'X' )
            return 1 + xLength( str.substring(1) );

        else
            return 0 + xLength( str.substring(1) );
    }

    public static void main (String[] args)
    {
        String str = "XabcaXvw, tuwXcbXXXw, qityrsmnX; XXX123eryiop[X]";

        System.out.println( "Number of Xs in " + str + " is: " + xLength( str ) );
    }
}