import java.util.function.*;
interface car{
	void bookcab();
	
}

class CAB implements car{

	public void bookcab(){
			System.out.println("BOOKING CAB");
		}
	public static void main(String arhs[])	{

		/*car c = new CAB();
		c.bookcab();  POLYMORPHISM*/

		/*  ANYNOMOUS CLASS
		car c = new car(){
			//@Override
			public void bookcab(){
				System.out.println("BOOKING CAB");
			}

			
		};
		c.bookcab();
		*/
		car c = ()->{
			System.out.println("BOOKING CAB IN LAMBDA");
		};
		//c.bookcab();
		//Function 1 arg for input and 1 arg to output
		Function<Integer,Integer> addition = a ->  a+1;
		int ad = addition.apply(11);
		//System.out.println(ad);
		Function<Integer,Integer> multiply = number -> number * 20;


		//function Chaining
		Function<Integer,Integer> add_multiply = addition.andThen(multiply);
		int ans = add_multiply.apply(5);
		//System.out.println(ans);
		//ans = addition.andThen(multiply).apply(5);
		//System.out.println(ans);


		//Bifunction takes 2 args for input and 1 argh for output
		BiFunction<Integer,Integer,Integer> add_multiply_one = (inc_number,mul_number) -> (inc_number+1) * mul_number;
		System.out.println(add_multiply_one.apply(10,5));
	}
}