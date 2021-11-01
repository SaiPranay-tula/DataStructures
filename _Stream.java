import java.util.*;

class People{
	String name;
	int age;

	People(String name,int age)	{
		this.name=name;
		this.age=age;
	}
}
class _Stream{
	
	public static void main(String[] args) {
		


		List<People> list = List.of(
			new People("ABC",12),
			new People("Me",123),
			new People("You",12312)

			);

		list.stream()
					.map(people -> people.name)
					.forEach(name -> System.out.println(name));
		
		list.stream()
					.filter(people -> people.age>100)
					.count();

		System.out.println(list.stream().
					  allMatch(people -> people.age>10));

		list.stream().distinct().forEach(people -> System.out.println(people.age));

		

	}




}