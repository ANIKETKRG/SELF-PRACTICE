/*

*****
 ****
  ***
   **
    *

*/

import java.util.Scanner ;

public class Pattern_23
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        for ( int i = 1 ; i <= n ;  i++ )
        {
            for ( int j = 2 ; j <= i ; j++ )
            {
                System.out.print ( " " ) ;
            }
            for ( int j = n ; j >= i ; j-- )
            {
                System.out.print ( "*" ) ;
            }
            System.out.println() ;
        }
    }
}