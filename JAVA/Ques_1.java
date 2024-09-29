import java.util.Scanner ;

// public class Ques_1 
// {
//     static void Num ( int num )
//     {
//         if ( num == 1 )
//         {
//             System.out.println (" Entered Number Is Neither Even Nor Divisible By 3. " ) ;
//         }

//         else if ( num % 2 == 0 && num % 3 != 0 )
//         {
//             System.out.println (" Entered Number Is Even But Not Divisible By 3. " ) ;
//         }

//         else if ( num % 2 != 0 && num % 3 == 0 )
//         {
//             System.out.println (" Entered Number Is Not Even But Divisible By 3. " ) ;
//         }

//         else if ( num % 2 == 0 && num % 3 == 0 )
//         {
//             System.out.println (" Entered Number Is Even And Divisible By 3. " ) ;
//         }

//         else
//         {
//             System.out.println (" Entered Number Is Not Even And Not Divisible By 3. " ) ;
//         } 
//     }


//     public static void main ( String [] args ) 
//     {
//         Scanner sc = new Scanner ( System.in ) ;

//         int choice ;

//         do
//         {
//             System.out.println ( " 1. Enter A Number. " ) ;
//             System.out.println ( " 2. Exit. " ) ;
//             System.out.println ( " Enter Your Choice : " ) ;
//             choice = sc.nextInt() ;

//             switch ( choice )
//             {
//                 case 1 : 
//                     System.out.println ( " Enter A Number : " ) ;
//                     int num = sc.nextInt() ;

//                     Num ( num ) ;
//                     break ;

//                 case 2 :
//                     System.out.println ( " Exiting... " ) ;
//                     break ;

//                 default :
//                     System.out.println ( " Invalid Choice " ) ;
//             }
//         } while ( choice != 2 ) ;
//     }
// }


public class Ques_1
{
    static void Num ( int num )
    {
        int ec = 0 ;
        int oc = 0 ;

        if ( num % 2 == 0 )
        {
            ec++ ;
        }

        if ( num % 3 == 0 )
        {
            oc++ ;
        }

        if ( ec == 1 && oc == 0 )
        {
            System.out.println (" Entered Number Is Even But Not Divisible By 3. " ) ;
        }

        else if ( ec == 0 && oc == 1 )
        {
            System.out.println (" Entered Number Is Not Even But Divisible By 3. " ) ;
        }

        else if ( ec == 1 && oc == 1 )
        {
            System.out.println (" Entered Number Is Even And Divisible By 3. " ) ;
        }

        else
        {
            System.out.println (" Entered Number Is Not Even And Not Divisible By 3. " ) ;
        }
    }

    public static void main ( String [] args ) 
    {
        Scanner sc = new Scanner ( System.in ) ;

        int choice ;

        do
        {
            System.out.println ( " 1. Enter A Number. " ) ;
            System.out.println ( " 2. Exit. " ) ;
            System.out.println ( " Enter Your Choice : " ) ;
            choice = sc.nextInt() ;

            switch ( choice )
            {
                case 1 : 
                    System.out.println ( " Enter A Number : " ) ;
                    int num = sc.nextInt() ;

                    Num ( num ) ;
                    break ;

                case 2 :
                    System.out.println ( " Exiting... " ) ;
                    break ;

                default :
                    System.out.println ( " Invalid Choice " ) ;
            }
        } while ( choice != 2 ) ;
    }
}