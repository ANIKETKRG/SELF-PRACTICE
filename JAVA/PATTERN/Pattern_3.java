/*

*
**
***
****
 
*/


import java.util.Scanner ;

public class Pattern_3 
{
    public static void main ( String [] args ) 
    {
        int row , col ;

        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        row = sc.nextInt() ;

        System.out.println ( " Enter Number Of Columns : " ) ;
        col = sc.nextInt() ;

        for ( int i = 1 ; i <= row ; i++ )
        {
            for ( int j = 1 ; j <= i ; j++ )
            {
                System.out.print ( "*" ) ;
            }
            System.out.println () ;
        }
    }
}