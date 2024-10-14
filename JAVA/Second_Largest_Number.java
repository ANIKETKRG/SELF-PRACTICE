
import java.util.Scanner;

/*

import java.util.Scanner ;

public class Second_Largest_Number
{
    public static void main ( String [] args )
    {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.println ("Enter The Number Of Elements : " ) ;
        int n = sc.nextInt() ;

        int[] arr = new int [ n ] ;

        System.out.println ("Enter The Elements : " ) ;

        for ( int i = 0 ; i < n ; i++ )
        {
            arr [ i ] = sc.nextInt() ;
        }

        int max = Integer.MIN_VALUE ;
        int second_max = Integer.MIN_VALUE ;

        for ( int i = 0 ; i < n ; i++ )
        {
            if ( arr [ i ] > max )
            {
                second_max = max ;
                max = arr [ i ] ;
            }
            else if ( arr [ i ] > second_max && arr [ i ] != max )
            {
                second_max = arr [ i ] ;
            }
        }

        System.out.println ( second_max ) ;
    }
}

 */

class Second_Largest_Number 
{
    static int getSecondLargest ( int [] arr ) 
    {
        int n = arr.length ;

        int largest = -1 , secondLargest = -1 ;

        for ( int i = 0 ; i < n ; i++ ) 
        {
            if ( arr [ i ] > largest ) 
            {
                largest = arr [ i ] ;
            }
        }

        for ( int i = 0 ; i < n ; i++ ) 
        {
            if ( arr [ i ] > secondLargest && arr [ i ] != largest ) 
            {
                secondLargest = arr [ i ] ;
            }
        }
        return secondLargest ;
    }

    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( "Enter The Number Of Elements : " ) ;
        int n = sc.nextInt() ;

        int [] arr = new int [ n ] ;

        System.out.println ( "Enter The Elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) 
        {
            arr [ i ] = sc.nextInt() ;
        }

        System.out.println ( getSecondLargest ( arr ) ) ;
    }
}
