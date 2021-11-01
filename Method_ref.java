import java.util.function.Function;
interface Addition{
	int add(int a,int b);
}

interface Print{
	void ptr(String str);
}





class Method_ref{
	public static int add_num(int a,int b)	{
		return a+b;
	}
	public int add_num1(int a,int b)	{
		return a+b;
	}
	public static void main(String[] args) {
		

		Addition addition = (a,b) -> a+b;

		Addition addi = Method_ref::add_num;		//static method refernce

		Method_ref ref = new Method_ref();			// instance method reference
		Addition addit = ref::add_num1;

		System.out.println(addition.add(10,20));
		System.out.println(addi.add(10,20));
		System.out.println(addit.add(10,20));

		Function<String ,Integer> len = s1 -> s1.length();
		System.out.println(len.apply("Hello") );

		Function<String ,Integer> lengt = String::length;  //Method ref

		System.out.println(lengt.apply("help"));

		int a=10;

		new Method_ref().play((a1,b) ->56);
		new Method_ref().play((c,d) ->a);


		Print p = (str)->System.out.println(str);
		Print pp = System.out::println;
		p.ptr("Its bame");
		pp.ptr("ITS NONE");

	}

	public void play(Addition ad)	{
		System.out.println(ad.add(5,6));
	} 
}



















