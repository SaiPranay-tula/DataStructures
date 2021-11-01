//import java.Math.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;
import java.util.function.*;
class _Stream3{

	public static void main(String[] args) {
		
		Stream<String> strr = Stream.of("Avdsfsd","DsdfsdfP","m3sdfsdfsdfds");
		//strr.forEach(System.out::println);

		//Stream<Double> random = Stream.generate(Math::random);
		//random.limit(5).forEach(System.out::println);
		//System.out.println(strr.max((a,b)->a.length()-b.length()));

		//reduce
		//String g=strr.reduce("",String::concat);
		//System.out.println(g);
		//System.out.println(strr.reduce((a,b)->a+b));

		Optional<String> a1 =strr.max((a,b)->a.length()-b.length());
		a1.ifPresent((aj)->System.out.println(aj));

		Predicate<String> pre = str-> str.startsWith("A");

		//strr.filter(pre).forEach(System.out::println);

		String letter="A";
		Function<String ,Predicate<String>>  startsN = 
			word -> {
				Predicate<String> words = chars-> chars.startsWith(letter);
				return words;
				}; 

		System.out.println(startsN.apply("AV").test("v"));		

		Stream<String> strm1 = Stream.of("HELLOW","HHEHE","GGDGGDGD","TTYTY");

		Map<Integer, List<String>>  arr= strm1.map(String::toLowerCase).collect(Collectors.groupingBy(String::length));
		System.out.println(arr);





	}	
}