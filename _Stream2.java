import java.util.*;
import java.util.stream.*;
class Vechile	{
	
	String type;
	int mof;
	String model;

	public Vechile(String type,int mof,String model)	{
		this.type=type;
		this.mof=mof;
		this.model=model;
	}

}
class _Stream2{

	public static void main(String[] args) {
		
		List<Vechile> list = List.of(new Vechile("car",1923,"XC234-23"),
									 new Vechile("BIke",1924,"BGS62s"),
									 new Vechile("Car",2002,"H9873-3"),
									 new Vechile("Bus",2012,"SDDJF-df")
									);
	
	List result = list.stream()
				  .map(lists -> lists.type)
				  .filter(list1 -> list1.startsWith("C"))
				  .collect(Collectors.toList());
	System.out.println(result);			  

	int total = list.stream()
							 .map(vech -> vech.mof)
							 .mapToInt(s -> s)
							 .reduce(122	0,(v,tot)-> v+tot);
	System.out.println(total);						 
	}
}