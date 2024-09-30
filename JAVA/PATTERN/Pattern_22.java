/*

     *
    ***
   *****
  *******
 *********

*/

import java.util.Scanner ;

public class Pattern_22
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        // for ( int i = 1 ; i <= n ;  i++ )
        // {
        //     for ( int j = n ; j >= i ; j-- )
        //     {
        //         System.out.print ( " " ) ;
        //     }

        //     for ( int k = 1 ; k <= i ; k++ )
        //     {
        //         System.out.print ( "*" ) ;
        //     }

        //     for ( int k = 2 ; k <= i ; k++ )
        //     {
        //         System.out.print ( "*" ) ;
        //     }
        //     System.out.println() ;
        // }


        for ( int i = 1 ; i <= n ;  i++ )
        {
            for ( int j = n ; j >= i ; j-- )
            {
                System.out.print ( " " ) ;
            }

            for ( int k = 1 ; k < ( i * 2 ) ; k++ )
            {
                System.out.print ( "*" ) ;
            }
            System.out.println() ;
        }
    }
}