class TT{

    static long[] solve(int [][]a ,long [][] query){

        long arr[]=new long [a[0].length+a.length];
        int z=0;
        long f[]=new long[query.length];
        for(int i=0;i<a[0].length ;i++){
        int sum=0;
        int sum1=0;
        for(int j=0;j<a.length;j++)
        {
        sum+=a[i][j];
        sum1+=a[j][i];

        }
        arr[z++]=sum;
        arr[z++]=sum1;
        }
        /*for(int i=0;i<a[0].length ;i++){
            int sum=0;
            for(int j=0;j<a.length;j++)
            sum+=a[j][i];
            arr[z++]=sum;
            }
            */
        z=0;    
        for(int i=0;i<query.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if (query[i][0]<=arr[j]&& arr[j]<=query[i][1])
                {
                    count++;
                }
            }
            f[z++]=count;
        }  


return f;

    }
    public static void main(String[] args) {

        int a[][]=new int[][] { {1,4},{2,5} };
        long [][]query =new long[][]{{3,7},{3,9}};
        long app[]=solve(a, query);
        for(long g:app)
        System.out.println(g);

        
    }
    
}