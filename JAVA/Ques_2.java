class Ques
{
    Ques()
    {
        System.out.println("Default Constructor");
    }
}


class A extends Ques
{
    A()
    {
        System.out.println("A's Constructor");
    }
}

class Ques_2 extends A
{

    public Ques_2()
    {
        System.out.println("Ques_2 Constructor");
    }

    public static void main(String[] args)
    {
        A obj = new A();
    }
}