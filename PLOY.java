
class A{

void method1()
{
    System.out.println("A;s");
}

}


public class PLOY{

    void method1()
{
    System.out.println("PLOYs");
}

    public static void main(String[] args) {
        

        PLOY a =new A();
        a.method1();

    }
}
