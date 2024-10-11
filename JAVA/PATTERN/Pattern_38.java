/*

    1
   321
  54321
 7654321
987654321

*/

import java.util.Scanner ;

public class Pattern_38
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
            for ( int j = c ; j >= 1 ; j-- )
            {
                System.out.print ( j ) ;
            }
            c += 2 ;
            System.out.println() ;
        }
    }
}