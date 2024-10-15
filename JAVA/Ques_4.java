public class Ques_4 
{
    public static void main ( String [] args ) 
    {
        // System.out.println ( "5" + "6" ) ; // 56 

        outerLoop :
        for ( int i = 0 ; i < 5 ; i++ )
        {
            for ( int j = 0 ; j < 5 ; j++ )
            {
                if ( i == 1 && j == 1 )
                {
                    break outerLoop ;
                }
                System.out.println ( "i = " + i + " j = " + j ) ;
            }
        }

        System.out.println ( "--------------------------------" ) ;

        for ( int i = 0 ; i < 5 ; i++ )
        {
            for ( int j = 0 ; j < 5 ; j++ )
            {
                if ( i == 1 && j == 1 )
                {
                    break ;
                }
                System.out.println ( "i = " + i + " j = " + j ) ;
            }
        }
    }
}
