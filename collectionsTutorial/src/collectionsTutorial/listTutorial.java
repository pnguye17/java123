package collectionsTutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


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
		
		List<Integer> numList = new ArrayList<>();
		List<Integer> numLinkedList = new LinkedList<>();
		List<Cat> catList = new ArrayList<>();
		List<Cat> catLinkedList = new LinkedList<>();
		
		//which is faster when inputting numbers -> arraylist
		
		long initialTime = System.currentTimeMillis();
		add1000000(numList);
		System.out.println(numList.size());
		long endTIme = System.currentTimeMillis();
		System.out.println("Time it took to add 1000 ints into Arraylist : " + (endTIme - initialTime));
		
		initialTime = System.currentTimeMillis();
		add1000000(numLinkedList);
		System.out.println(numLinkedList.size());
		endTIme = System.currentTimeMillis();
		System.out.println("Time it took to add 1000 ints into Linkedlist : " + (endTIme - initialTime));
		
		
		
		//adding Cats
		
		initialTime = System.currentTimeMillis();
		add100Cats(catList);
		System.out.println(catList.size());
		endTIme = System.currentTimeMillis();
		System.out.println("Time it took to add 100 cat into Arraylist : " + (endTIme - initialTime));
		
		initialTime = System.currentTimeMillis();
		add100Cats(catLinkedList);
		System.out.println(catLinkedList.size());
		endTIme = System.currentTimeMillis();
		System.out.println("Time it took to add 100 cat into Linkedlist : " + (endTIme - initialTime));
		
		
		

	}
	
	static void add1000000(List<Integer> list) {
		
		for(int i = 0; i < 1_000_000; i++) {
			list.add(i);
		}
		
		
	}
	
	static void add100Strings() {
		
	}
	
	static void add100Cats(List<Cat> list) {
		
		for(int i = 0; i < 100; i++) {
			Cat newCat = new Cat(i);
			list.add(newCat);
		}
	}

}
