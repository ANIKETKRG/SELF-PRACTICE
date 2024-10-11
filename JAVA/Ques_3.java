import java.util.Scanner;

public class Ques_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in ) ;
        
        String str1 [] = new String [ 5 ] ;

        System.out.println("Enter 5 strings: ");
        StringBuilder str2 = new StringBuilder () ;

        for ( int i = 0 ; i < 5 ; i++ )
        {
            str2.append ( " " + str1 [ i ] ) ;
        }
        System.out.println ( str2 ) ;
    }
}
