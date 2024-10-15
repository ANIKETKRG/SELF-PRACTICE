import java.util.Scanner ;

class Array_String_1
{
    public static void main ( String [] args)
    {
        Scanner sc = new Scanner ( System.in ) ;

        int size ;

        System.out.println ( "Enter The Size Of Array : " ) ;
        size = sc.nextInt() ;

        String arr [] = new String [ size ] ;

        System.out.println ( "Enter The Elements Of Array : " ) ;
        for ( int i = 0 ; i < size ; i++ )
        {
            arr [ i ] = sc.next() ;
        }
    }
}