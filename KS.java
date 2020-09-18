import java.util.*;
public class KS {
    
    public static List<Long> distinctNumbers(List<Long> arr) 
{ 
    List<Long> res=new ArrayList<>();
    int n=arr.size();
    long[] a=new long[n];
    a[0]=arr.get(0);
    for(int i=1;i<n;i++)
    {
        a[i]=a[i-1]+arr.get(i);
    }


    for(long a1:a)
    System.out.print(a1+" ");
    System.out.println();

    res.add(arr.get(0)*0);
    for(int i=1;i<n;i++)
    {
        long count=(arr.get(i)*i)-a[i-1];
        System.out.println(arr.get(i)*i+"  "+a[i-1]+"   count  "+count);
        res.add(count);
    }
    return res;
}
public static void main(String[] args) {
    LinkedList<Long> list=new LinkedList<Long>();
    list.add(1l);
    list.add(2l);
    list.add(2l);
    list.add(3l);
    System.out.println(distinctNumbers(list));

}
}
