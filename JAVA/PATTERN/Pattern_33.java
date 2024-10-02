/*

1
22
333
4444
55555

*/

import java.util.Scanner ;

public class Pattern_33
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        for ( int i = 1 ; i <= n ; i++ )
        {
            for ( int j = 1 ; j <= i ; j++ )
            {
                if ( j <= i )
                {
                    System.out.print ( i ) ;
                }
            }
            System.out.println() ;
        }
    }
}