package collection_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Revanth", 1997, "civil", 71, true);
		Student s2 = new Student("SanthiPrasad", 1964, "tamil", 68, true);
		Student s3 = new Student("Malini", 1971, "civil", 79, false);
		Student s4 = new Student("Moni", 2004, "IT", 92, false);
		Student s5 = new Student("Rupa", 2009, "Accounts", 95, false);
		
		ArrayList <Student> std = new ArrayList <> () ;
		std.add(s1); std.add(s2); std.add(s3); std.add(s4); std.add(s5); 
		System.out.println("=========all the details by using for loop===========");
		for(int i=0; i<std.size(); i++) {
			System.out.println(std.get(i));
		}
		
		
		System.out.println("=========Creating another List to store the mark data of all Student======");
		List <Integer> mark = std.stream().map(x -> x.getMark()).collect(Collectors.toList());
		mark.forEach(z ->  {  System.out.println(z);  }  );
		
		
		System.out.println("======================================");
		List<String>li=	std.stream().filter(z -> z.getMark() >= 75).map(x -> x.getName()).collect(Collectors.toList());
		li.forEach(c -> System.out.println(c));
		
		
		System.out.println("======================================");
		List <String> abc = std.stream().filter(x -> x.getIsMale()==true).map(h -> h.getName()).collect(Collectors.toList());
		abc.forEach(a -> System.out.println(a));
		
		
		System.out.println("========Another method without using collect & Collectors===========");
		std.stream().filter(x -> x.getIsMale() == false).forEach(z -> System.out.println(z.getName())); 
		std.stream().filter(x -> x.getIsMale() == false).forEach(z -> System.out.println(z));
		
		
		System.out.println("========Count of all constructors===========");
		long longs = std.stream().count();
		System.out.println(longs);
		
		
		System.out.println("========Count of all constructors by using conditions===========");
		long c = std.stream().filter(x -> x.getMark()>75).count();
		System.out.println(c);
	}
}
