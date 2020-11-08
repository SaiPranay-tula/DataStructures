package ALGO;

public class MV_EN {

    public static void main(String[] args) {
        //int arr[]={2,1,3,2,1,2,2,2};
        int arr[]={1,3,2,4,2,2,2};
        int sr=2;
        int sta=0,last=arr.length-1;

        while(sta<last){
            if(arr[sta]==sr){
                if(arr[last]!=sr)
                {
                    int temp=arr[sta];
                    arr[sta] =arr[last];
                    arr[last]=temp;
                    last--;
                    sta++;
                }
                else
                {
                    last--;   
                }
            }
            else{
                sta++;
            }
        }
        
        for(int a:arr)
        System.out.println(a);
    }
    
}
