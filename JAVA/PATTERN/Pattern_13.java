/*

1
23
456
78910
1112131415

*/

import java.util.Scanner;

public class Pattern_13
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        int count = 0 ;

        for ( int i = 1 ; i <= n ; i++ )
        {
            for ( int j = 1 ; j <= i ; j++ )
            {
                System.out.print ( ++count ) ;
            }
            System.out.println() ;
        }
    }
}