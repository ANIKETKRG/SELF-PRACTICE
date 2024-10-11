/*

    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE

*/

import java.util.Scanner ;


public class Pattern_41
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
            for ( int j = 1 ; j <= c ; j++ )
            {
                System.out.print ( ( char ) ( i + 64 ) ) ;
            }
            c += 2 ;
            System.out.println() ;
        }
    }
}