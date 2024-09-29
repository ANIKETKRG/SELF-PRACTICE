import java.util.Scanner ;

public class Armstrong_Number 
{
    int AN ( int n )
    {
        int rev , num2 = 0 ;

        int temp = n ;

        while ( n > 0 )
        {
            rev = n % 10 ;
            num2 = num2 + ( rev * rev * rev ) ;
            n /= 10 ;
        }
        
        return num2 ;
    }

    public static void main ( String args [] )
    {
        int n ;

        Scanner sc = new Scanner ( System.in ) ;

        System.out.println ( " Enter A Number : " ) ;
        n = sc.nextInt() ;

        Armstrong_Number obj = new Armstrong_Number() ;
        
        int num2 = obj.AN ( n ) ;

        if ( n == num2 )
            System.out.println("Armstrong Number") ;
        else
            System.out.println("Not a Armstrong Number") ;
    }
}
