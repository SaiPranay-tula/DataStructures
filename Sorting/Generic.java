package Sorting;

public class Generic<T> {                          //Generic class
    T num;
    Generic(T n)
    {
        this.num=n;
    }
    public static <T> T add(T a,T b)               //Generic Function
    {
        //System.out.printf("%d ->a,%d ->b",a,b);
        System.out.println(a+"  "+b);
        return a;


    }
    public static void main(String[] args) {
        
        Generic<Integer> obj=new Generic<>(10);
        System.out.println(obj.num);
        add(10,10);
        add("string","STRING");
    }
    
}