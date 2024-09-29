/*

    *
   *
  *
 *
*

*/

import java.util.Scanner ;

public class Pattern_20
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        for ( int i = 1 ; i <= n ; i++ )
        {
            for ( int j = n ; j >= i ; j-- )
            {
                if ( j > i )
                {
                    System.out.print ( " " ) ;
                }
                else
                {
                    System.out.print ( "*" ) ;
                }
            }
            System.out.println() ;
        }
    }
}