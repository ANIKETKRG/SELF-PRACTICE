/*

12345
1234
123
12
1

*/

import java.util.Scanner;

public class Pattern_7 
{
    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int n = sc.nextInt() ;

        for ( int i = n ; i >= 1 ; i-- )
        {
            for ( int j = 1 ; j <= i ; j++ )
            {
                System.out.print ( j ) ;
            }
            System.out.println() ;
        }
    }
}
