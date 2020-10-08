class A{


    public void prt()
    {
        System.out.println("P");
    }
}
public class H extends A{
    public void prt()
    {
        System.out.println("C");
    }

    
    public static void main(String hs[])
    {
H a=new H();
a.prt();

    }
}
