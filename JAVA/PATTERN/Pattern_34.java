/*

    1
   222
  33333
 4444444
555555555

*/

import java.util.Scanner ;

public class Pattern_34
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
                System.out.print ( i ) ;
            }
            c += 2 ;
            System.out.println() ;
        }
    }
}