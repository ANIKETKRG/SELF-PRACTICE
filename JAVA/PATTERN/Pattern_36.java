/*

    1
   333
  55555
 7777777
999999999

*/

import java.util.Scanner ;

public class Pattern_36
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
                System.out.print ( c ) ;
            }
            c += 2 ;
            System.out.println() ;
        }
    }
}