/*

*********
 *******
  *****
   ***
    *

*/

import java.util.Scanner ;

public class Pattern_24
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        // for ( int i = 1 ; i <= n ;  i++ )
        // {
        //     for ( int j = 2 ; j <= i ; j++ )
        //     {
        //         System.out.print ( " " ) ;
        //     }
        //     for ( int j = n ; j >= i ; j-- )
        //     {
        //         System.out.print ( "*" ) ;
        //     } 
        //     for ( int j = n - 1 ; j >= i ; j-- )
        //     {
        //         System.out.print ( "*" ) ;
        //     }
        //     System.out.println() ;
        // }

        // for ( int i = 1 ; i <= n ;  i++ )
        // {
        //     for ( int j = 2 ; j <= i ; j++ )
        //     {
        //         System.out.print ( " " ) ;
        //     }
        //     for ( int j = n + 5 ; j >= ( i *  2 ) ; j-- )
        //     {
        //         System.out.print ( "*" ) ;
        //     } 
        //     System.out.println() ;
        // }

        for ( int i = n ; i >= 1 ;  i-- )
        {
            for ( int j = n ; j > i ; j-- )
            {
                System.out.print ( " " ) ;
            }
            for ( int j = 1 ; j < ( i *  2 ) ; j++ )
            {
                System.out.print ( "*" ) ;
            } 
            
            System.out.println() ;
        }
    }
}