import java.io.*;
public class EXC {
    void m() 
    {
 try{   
b();
 }
 catch(Exception c)
 {

 }
    }

    void b()  throws IOException
    {
throw new IOException("HELLO WORLD");
    }
  

void h(){


    m();
}



    public static void main(String[] args) {
    
        try{

            new EXC().h();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("Main");

    }
}
