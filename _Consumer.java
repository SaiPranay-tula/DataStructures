import java.util.function.Consumer;
import java.util.function.BiConsumer;

import java.util.function.*;


class _Consumer{



	public static void main(String[] args) {
		
		//normal way of function
		//print_cust(new Customer("Ps",1234));

		//Consumer way FP
		Consumer <Customer> print_cust_fp = customer -> 
										System.out.print(customer.name +"  Welcome to &&&&- "+ 
											customer.phone_number);
		print_cust_fp.accept(new Customer("MYnamw",3456656) );

		//Function returns a value but Consumer doesnt return value
		/*Function<Customer,Integer> print_cust_fp1 = customer -> 
										System.out.print(customer.name +"  Welcome to &&&&- "+ 
											customer.phone_number);
										return 1;
		print_cust_fp1.apply(new Customer("MYnamw",3456656) );	
		*/							
		//BiConsumer
		BiConsumer<Customer,Boolean> print_cust_fp_1 = (customer,bool) -> System.out.println("Welcome "+customer.name+"  "+
	
																			(bool ?customer.phone_number:"****"));
		print_cust_fp_1.accept(new Customer("ME",7665666),true);
	}	

	//Normal function
	public static void print_cust(Customer custom)	{
		System.out.print(custom.name +"Welcome to &&&&- "+custom.phone_number);
	}

	static class Customer{

		String name;
		int phone_number;
		Customer(String name, int phone_number)	{
			this.name=name;
			this.phone_number=phone_number;
		}
	}
}