package selenium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert; 

public class javastream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sana"); 
		names.add("Adithi"); 
		names.add("Avinash"); 
		names.add("kalpana"); 
		names.add("Anaju"); 
		//filtering and getting the count of names starts with A using streams 
		Long count = names.stream().filter(s->s.startsWith("A")).count(); 
		System.out.println(count); 
		
		
		//Creating arraylist, filtering and getting the count of names starts with S using streams 
		Long c = Stream.of("Saga", "Saru", "Avi", "Saroja", "Amar").filter(s->
		{
			s.startsWith("A"); 
			return(true); 
		}).count(); 
		
		System.out.println(c); 
		//printing all the names in arraylist 
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//only limiting to print 2 names 
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		
		//getting the names ends with "a" and print them in uppercase 
		Stream.of("Saga", "Saru", "Avi", "Saroja", "Amar").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//getting print the names as first letter a with upper case sorted
		Stream.of("Saga", "Saru", "Avi", "Saroja", "Amar").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Concating the two strings
		List<String> namesPeople = Arrays.asList("Sana", "Sudeep", "Pinki", "Radika", "Suparna");
		List<String> namesPeople1 = Arrays.asList("Aparna", "Anu", "Kamala", "Nayana", "Sadhana");
		Stream<String> toatalName= Stream.concat(namesPeople.stream(), namesPeople1.stream()); 
		//toatalName.forEach(s->System.out.println(s));
		
		boolean flag = toatalName.anyMatch(s->s.equalsIgnoreCase("Anu")); 
		Assert.assertTrue(flag);
		System.out.println(flag); 
		//note that once the stream is sorted we cannot modifiy or use to other operation 
		
		//collecting the lists 
		List<String> ls= Stream.of("Saga", "Saru", "Avi", "Saroja", "Amar").filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));
		
		
		//print unique number from the array list 
		List<Integer> values = Arrays.asList(3, 2, 4, 2, 4, 7, 8, 9, 0); 
		values.stream().distinct().forEach(s->System.out.println(s));
		//sort the array 
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		values.stream().distinct().sorted().limit(2).forEach(s->System.out.println(s));
		List<Integer> numbers = values.stream().sorted().collect(Collectors.toList()); 
		System.out.println(numbers.get(3)); 
	
		
	}
	

}
