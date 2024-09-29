/*

666666
55555
4444
333
22
1

*/

import java.util.Scanner;

public class Pattern_8 
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
                System.out.print ( i ) ;
            }
            System.out.println() ;
        }
    }
}
