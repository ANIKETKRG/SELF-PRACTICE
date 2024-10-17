class Ex
{
    void fun1()
    {
        System.out.println("fun1");
    }
    void fun2()
    {
        System.out.println("fun2");
    }

    static void test()
    {
        System.out.println("Ex");
    }
}

class Test 
{
    static void test ( )
    {
        System.out.println ( "int" ) ;
    }    

    public static void main(String[] args) 
    {
        Ex.test();
        
    }
}
