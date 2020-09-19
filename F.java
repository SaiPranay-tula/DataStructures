import java.util.*;
import java.lang.Math;

class F {

    public static void main(String[] args) {
        
        long a[]={1,2,2,3};
        List<Long> list=new ArrayList<>();
       // List a1=Arrays.asList(a);
       // list.addAll(a1);

        LinkedList<Long> vect=new LinkedList<Long>();
        vect.add(0,0l);

        
        for(int i=1;i<a.length;i++)
        {   int count=0;
            long ans=0;
            long curr=list.get(i);
            
            for(count=i-1;count>=0;count--)
            {
                long next=list.get(count);

            if(curr>=next)
            {
                ans=ans+Math.abs(curr-next);
            }
            else{
                ans=ans-Math.abs(curr-next);
            }

            }

vect.add(i,ans);

        }

System.out.println(vect);
    }
    
}
