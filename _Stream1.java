import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
class School{
	String name;
	int year;

	public School(String name,int year)	{
		this.year=year;
		this.name=name;
	}
}
class _Stream1{

	public static void main(String[] args) {
		
		List<School> list = List.of(
									new School("PHS",1292),
									new School("PLF",1234),
									new School("Apllo",2342)
									);



		Function<School,Integer> year = lists -> lists.year;

		int a=year.apply(new School("PRF",1234));

		System.out.println(a);

		Predicate<School> name = lists -> lists.name.contains("P");

		System.out.println(name.test(new School("Per",123)));


		Consumer<School> age_name = lists -> System.out.println("Name is "+lists.name+"year establised in "+lists.year);
		age_name.accept(new School("MY SCHOOL", 1925));
			
		Supplier<String> ptr = () -> "Nothing";
		System.out.println(ptr.get());
			}
}