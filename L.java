import java.util.ArrayList;

public class L {



    public ArrayList<String> merge(String[] array1,String[] array2)
    {

        ArrayList<String> sentence=new ArrayList<String>();
        for(String a:array1)
        sentence.add(a);
        for(String a:array2)
        sentence.add(a);

        return sentence;
    }
    public static void main(String[] args) {
        String arr[]={"hello","world"};
        String arr2[]={"no","yes"};
        System.out.println(new L().merge(arr,arr2 ));
        Integer a=121;
        System.out.println(a.toString());

        
    }
    
}
