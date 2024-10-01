/*

* * * * * * * * 
* *         * * 
*   *     *   * 
*     * *     * 
*     * *     * 
*   *     *   * 
* *         * * 
* * * * * * * *

*/

import java.util.Scanner ;

public class Pattern_30
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        for ( int i = 1 ; i <= n ;  i++ )
        {
            for ( int j = 1 ; j <= n ; j++ )
            {
                if ( j == 1 || j == n || i == n || i == 1 || i + j == n + 1  || i == j )
                {
                    System.out.print ( "* " ) ;
                }
                else
                {
                    System.out.print ( "  " ) ;
                }
            }
            System.out.println() ;
        }
    }
}