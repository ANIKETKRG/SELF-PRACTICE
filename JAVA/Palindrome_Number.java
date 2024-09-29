import java.util.Scanner;

class Palindrome_Number
{
    int PN ( int n )
    {
        int rev , num2 = 0 ;

        String s = Integer.toString ( n ) ;

        StringBuffer sb = new StringBuffer ( s ) ;

        System.out.println ( sb.reverse() ) ;

        // while (n > 0 )
        // {
        //     rev = n % 10 ;
        //     num2 = num2 * 10 + rev ;
        //     n /= 10 ;
        // }
        
        return num2 ;
    }

    public static void main ( String args [] )
    {
        Scanner sc = new Scanner(System.in) ;  

        System.out.println ( " Enter A Number : " ) ;
        int n = sc.nextInt() ;

        Palindrome_Number obj = new Palindrome_Number() ;
        
        int num2 = obj.PN ( n ) ;

        if ( n == num2 )
            System.out.println("Palindrome Number") ;
        else
            System.out.println("Not a Palindrome Number") ;
    }
}