/*

* * * * 
* * * * 
* * * *

*/

import java.util.Scanner ;

public class Pattern_1 
{
   public static void main ( String args [] )
   {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter Number Of Rows : " ) ;
        int rows = sc.nextInt() ;

        System.out.println (" Enter Number Of Columns : " ) ;
        int col = sc.nextInt() ;

       for ( int i = 1 ; i <= rows ; i++ )
       {
           for ( int j = 1 ; j <= col ; j++ )
           {
               System.out.print ( "* " ) ;
           }
           System.out.println() ;
       }
   }     
}
