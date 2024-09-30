/*

*       *
 *     *
  *   *
   * *
    *

*/

import java.util.Scanner ;

public class Pattern_27
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        for ( int i = n ; i >= 1 ;  i-- )
        {
            for ( int j = n ; j > i ; j-- )
            {
                System.out.print ( " " ) ;
            }
            for ( int j = 1 ; j < ( i * 2 ) ; j++ )
            {
                if ( j > 1 && j < ( i * 2 ) - 1 )
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