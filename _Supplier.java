import java.util.function.Supplier;

class _Supplier	{

	public static void main(String[] args) {
		
		System.out.println(getDbc());

		//Supplier are used to return something 
		System.out.println(getDbc_fp.get());
	}

	//Normal function
	public static String getDbc(){
		return "jdbc://locahost://";
	}


	static Supplier<String> getDbc_fp = () -> "jdbc://locahost://";
}