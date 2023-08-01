package streamsPratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class SP {

	public static void main(String[] args) {
		//streams are wrappers around a data source, 
		//allowing us to operate with that data source and making bulk processing convenient and fast.
		
		//creating empoty stream
		
		Stream<String> emptyStringStream = Stream.empty();
		
		// Creating Streams from Arrays
		
		int[] intArray = {2,4,6,8,10};
		Stream.of(intArray);
		
		//from list
		List<Integer> intList = new ArrayList<>();
		intList.add(2);
		intList.add(4);
		intList.add(6);
		intList.add(8);
		intList.add(10);
		
		Stream<Integer> streamInteger = intList.stream();
		
		//streambuilder
		
		Stream.Builder<Integer> sb = Stream.builder();
		sb.accept(0);
		sb.accept(2);
		sb.accept(4);
		sb.accept(6);
		sb.accept(8);
		
		Stream<Integer> numStream = sb.build();
		
		
		//foreach
		
		streamInteger.forEach(num -> System.out.println(num));
		
		
		
		
		

	}

}
