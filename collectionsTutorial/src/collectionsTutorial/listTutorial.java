package collectionsTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


class Cat {
	String name;
	int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Cat(int age) {
		super();
		this.age = age;
	}
	
	
	
	
}

public class listTutorial {
	
	
	

	public static void main(String[] args) {
		//collections interface has a list interface that has various class implementation
		//arraylist, linkedlist, vector - have dup values
		
		List<Integer> numList = new ArrayList<>();
		List<Integer> numLinkedList = new LinkedList<>();
		List<String> stringVector = new Vector<>();
		List<Integer> intStack = new Stack<>();
		
		
		//insertion
		
		for ( int i = 0; i < 10; i++) {
			numList.add(i);
			numLinkedList.add(i);
			stringVector.add(String.valueOf(i));
			intStack.add(i);
		}
	
		//indexing element by index
//		
//		System.out.println(numList.get(1));
//		System.out.println(numLinkedList.get(1));
//		System.out.println(stringVector.get(0));
		
		
		// Modifying set() or remove()
		
		numList.set(0, 8952200);
		numList.remove(9);
	
		
		//calling elements get()

		//iterating 
		
		Iterator iterator = numList.iterator();
		
		while ( iterator.hasNext() ) {
			System.out.println(iterator.next());
		}
		
		
		
		//which is faster when inputting numbers -> arraylist
		
//		long initialTime = System.currentTimeMillis();
//		add1000000(numList);
//		long endTIme = System.currentTimeMillis();
//		System.out.println("Time it took to add 1000 ints into Arraylist : " + (endTIme - initialTime));
//		
//		initialTime = System.currentTimeMillis();
//		add1000000(numLinkedList);
//		endTIme = System.currentTimeMillis();
//		System.out.println("Time it took to add 1000 ints into Linkedlist : " + (endTIme - initialTime));
//		
//		
//		
//		//adding 1M Cats -> arraylist
//		
//		initialTime = System.currentTimeMillis();
//		add100Cats(catList);
//		endTIme = System.currentTimeMillis();
//		System.out.println("Time it took to add 100 cat into Arraylist : " + (endTIme - initialTime));
//		
//		initialTime = System.currentTimeMillis();
//		add100Cats(catLinkedList);
//		endTIme = System.currentTimeMillis();
//		System.out.println("Time it took to add 100 cat into Linkedlist : " + (endTIme - initialTime));
//		
		
		
		

	}
	
	static void add1000000(List<Integer> list) {
		
		for(int i = 0; i < 1_000_000; i++) {
			list.add(i);
		}
		
		
	}
	
	static void add100Strings() {
		
	}
	
	static void add100Cats(List<Cat> list) {
		
		for(int i = 0; i < 1_000_00; i++) {
			Cat newCat = new Cat(i);
			list.add(newCat);
		}
	}

}
