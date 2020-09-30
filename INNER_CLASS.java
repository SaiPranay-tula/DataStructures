interface As{
 void happy();
}


public class INNER_CLASS {
    public static void main(String[] args) {
        
        As a=new As(){
            public void happy()
            {
                System.out.println("HAPPY");
            }
        };
        a.happy();
    }
    

}
