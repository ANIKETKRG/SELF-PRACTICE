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