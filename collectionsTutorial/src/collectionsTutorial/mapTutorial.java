package collectionsTutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapTutorial {

	public static void main(String[] args) {
		//hashmap - can have null k/v, not thread safe, not ordered, faster
		//It uses equals() method of the Object class to compare keys
		
		
		//treemap - natural order by keys, not thread safe TreeMap 
		//does not allow null keys but can have multiple null values.
		//It uses the compareTo() method to compare keys.
		
		Map<String, Integer> people = new HashMap<>();
		
		//insertion order not guaranteed for hashmap
		people.put("Peter", 21);
		people.put("Paul", 12);
		people.put("Anthony", null);
		people.put("Lacy",61);
		
		//read
		System.out.println(people.get("Paul"));
		people.entrySet();
		
		//iteration
		
		for ( Map.Entry<String, Integer> entry : people.entrySet()) {
			System.out.println("Keys :" + entry.getKey());
			System.out.println("Values : " + entry.getValue());
			
		}
		
		//modifying values
		people.replace("Peter", 1000);
		
		//delete values
		people.remove("Peter");
		
		
		
		
		
		
	
		

	}

}
