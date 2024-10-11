/*

    1
   123
  12345
 1234567
123456789

*/

import java.util.Scanner ;


public class Pattern_37
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
            for ( int j = ( i - 1 ) ; j >= - ( i - 1 ) ; j-- )
            {
                System.out.print ( Math.abs ( j - i ) ) ;
            }
            c += 2 ;
            System.out.println() ;
        }
    }
}