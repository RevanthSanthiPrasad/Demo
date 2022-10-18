package collection_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile (12000, "Samsung", true, "white", "M21");
		Mobile m2 = new Mobile (15000, "Lenovo", true, "gold", "K5 Note");
		Mobile m3 = new Mobile (18000, "Mi", true, "blue", "C12");
		Mobile m4 = new Mobile (21000, "Oppo", false, "red", "O-30");
		Mobile m5 = new Mobile (49000, "OnePlus", true, "SkyBlue", "Nord");
		
		// ArrayList <ObjectClass> li = new ArrayList <> () ;
		
		ArrayList <Mobile> li = new ArrayList <> () ;
		li.add(m1); li.add(m2); li.add(m3); li.add(m4); li.add(m5); 
		
		System.out.println("========Price more than 15000 print all the details===========");
		
		List <Mobile> m = li.stream().filter(a -> a.getPrice() > 15000).collect(Collectors.toList());
		
		m.forEach(x -> { System.out.println(x); } );
		
		System.out.println("========Enhanced for===========");
		for(Mobile mobiles : m) {
			System.out.println(mobiles);
		}
		System.out.println("========Warranty===========");
		List <Mobile> warranty = li.stream().filter(z -> z.getWarranty() == true).collect(Collectors.toList());
		warranty.forEach(x1 -> {System.out.println(x1);  }  );
		
		System.out.println("========Brand contains s or not===========");
		
		List <Mobile> contain = li.stream().filter(y -> y.getBrand().contains("S")).collect(Collectors.toList());
		contain.forEach(x2 -> { System.out.println(x2);  }  );
		
		System.out.println("=========Warranty is true reduce price by 999==========");
		List <Mobile> discout = li.stream().filter(x -> x.getWarranty() == true).collect(Collectors.toList());
		for(Mobile  z1 : discout) {
			System.out.println(z1.getPrice()-999);
		}
		
		System.out.println("========Another method without using collect & Collectors===========");
		li.stream().filter(a -> a.getBrand().startsWith("O")).forEach(b -> { System.out.println(b); } );
		
		System.out.println("=============Color.equals() ===============");
		li.stream().filter(z -> z.getColor().equals("white")).forEach(x -> { System.out.println(x); } );
		
		System.out.println("===========directly creating a new ArrayList =============");
		
		ArrayList <Mobile> z3 = li.stream().filter(z -> z.getModel().equals("Nord")).collect(Collectors.toCollection(ArrayList::new));
		z3.forEach(d ->  {  System.out.println(d);  }  );
		
		System.out.println("=========List to map conversion, Printing all the details=====================");
		Map <Integer,Mobile> kv = li.stream().filter(x -> x.getColor().equals("SkyBlue")).collect(Collectors.toMap(Mobile :: getPrice, Function.identity()));
		kv.forEach((k,v) -> System.out.println(k+ " "+v));
		
		System.out.println("=========List to map conversion, Printing the brand name only=====================");
		Map <Integer,String> sm = li.stream().filter(x -> x.getColor().equals("SkyBlue")).collect(Collectors.toMap(Mobile :: getPrice,Mobile::getBrand));
		sm.forEach((k,v) -> System.out.println(k+ " "+v));
		
		
		System.out.println("=========List to map conversion, BrandName & Warranty =====================");
		Map <String, Boolean> bn = li.stream().filter(b -> b.getBrand().equals("Oppo")).collect(Collectors.toMap(Mobile :: getBrand, Mobile :: getWarranty));
		bn.forEach((k,v) ->  {   System.out.println(k+" "+v);  }  );
		
		System.out.println("-----------Map  Second Last letter of a String --------------");
		li.stream().map(x -> x.getBrand().charAt(x.getBrand().length()-2)).forEach(y -> System.out.println(y));
		
		System.out.println("---------------except white color and print remaining details--------------------");
		List <Mobile> colour = li.stream().filter(c -> !c.getColor().equalsIgnoreCase("white")).collect(Collectors.toList());
		colour.forEach(d -> System.out.println(d));
		
		System.out.println("---------------except white color and print remaining details --- Another method--------------------");
		List <Mobile> colours = li.stream().filter(c -> c.getColor()!="white").collect(Collectors.toList());
		colours.forEach(d -> System.out.println(d));
		
		
		System.out.println("-----------by using map() & forEach   ans =  boolean-----------------");
		li.stream().map(z -> z.getWarranty()).forEach(x -> System.out.println(x));
		
	}
}
