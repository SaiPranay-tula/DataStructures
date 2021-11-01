class B{

	public int[]fin = new int[2];
	public int[] min_max(int arr[],int low,int high)	{


		if(low==high)	{
			int a[]={arr[low],arr[low]};
			return a;
		}

		if(high==low+1)	{
			int a[]=new int[2];
			if(arr[high]>arr[low])	{
				a[0]=arr[low];
				a[1]=arr[high];
			}
			else{
				a[0]=arr[high];
				a[1]=arr[low];
			}
			return a;
		}

		int mid=(low+high)/2;
		int min_ml[]=min_max(arr,low,mid);
		int min_mh[]=min_max(arr,mid+1,high);

		fin[1]=Math.max(min_ml[1],min_mh[1]);
		fin[0]=Math.min(min_ml[0],min_mh[0]);

		return fin;

	} 


	public static void main(String args[])	{

		B b = new B();
		int arr[] = {1000, 11, 445, 1, 330, 30001};
		int z[]=b.min_max(arr,0,arr.length-1);
		System.out.println(z[0]+"  "+z[1]);
	}
}