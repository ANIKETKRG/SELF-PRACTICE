/*

    1
   121
  12321
 1234321
123454321

*/

import java.util.Scanner ;


public class Pattern_39
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        int c = 1 ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        for ( int i = 1 ; i <= n ; i++ )
        {
            for ( int j = n - 1 ; j >= i ; j-- )
            {
                System.out.print ( " " ) ;
            }
            for ( int j = ( i - 1 ) ; j >= -( i - 1 ) ; j-- )
            {
                System.out.print ( i - ( Math.abs ( j ) ) ) ;
            }
            c += 2 ;
            System.out.println() ;
        }
    }
}