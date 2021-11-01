 import java.util.function.Predicate;
class _Predicate{


	public static void main(String[] args) {
		
		System.out.println(isvalidPhone("07122334561"));
		System.out.println(isvalidPhone("7122334561"));
		System.out.println(isvalidPhone_fp.test("07122334561"));
		System.out.println(isvalidPhone_fp.test("097122334561"));

		boolean ans=isvalidPhone_fp.and(containsNumber3).test("07122334561");
		System.out.println(ans);

	}	

	//Normal function
	static boolean isvalidPhone(String phonenumber)	{
		return phonenumber.startsWith("07") && phonenumber.length()==11;
	}

	//Predicate returns boolean
	static Predicate<String> isvalidPhone_fp = phonenumber -> 
										phonenumber.startsWith("07") && phonenumber.length()==11;

	static Predicate<String> containsNumber3 = phonenumber ->
										phonenumber.contains("3");		
	//BiPredicate																	
}