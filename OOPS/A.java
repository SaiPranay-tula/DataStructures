class A{

	/*public int add(int a,int b)	{
		System.out.println("int");
		return a+b;
	}
	*/
	public double add(float a , double b)	{
		System.out.println("double");
		return a+b;
	}

	public int add(double a,float  b)	{
		System.out.println("double,int");
		return a+b;
	}
	public static void main(String ars[])	{

		new A().add(2,1);

	}
}