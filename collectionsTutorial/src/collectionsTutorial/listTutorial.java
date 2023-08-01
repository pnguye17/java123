package collectionsTutorial;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
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
		
		//C - add()
		//R - get()
		//U - remove(), set()
		//D - remove()
		
		//for 1 thread app use arraylist/linkedlist
		//for using only set/ get use arraylist
		//for modifyiing and deleting use linkedliist ( insertion order)
		
		List<Integer> numList = new ArrayList<>();
		
		//linked list and vector are the same except Vector is thread safe
		List<Integer> numLinkedList = new LinkedList<>(); 
		List<String> stringVector = new Vector<>();
		
		//LIFO, thread safe use deque instead
		List<Integer> intStack = new Stack<>();
		
		Deque<Integer> intDeque = new ArrayDeque<>();
		
		
		//insertion
		
		for ( int i = 0; i < 10; i++) {
			numList.add(i);
			numLinkedList.add(i);
			stringVector.add(String.valueOf(i));
			intStack.add(i);
		}
	
		//indexing element by index get()

//		System.out.println(numList.get(1));
//		System.out.println(numLinkedList.get(1));
//		System.out.println(stringVector.get(0));
		
		
		// Modifying set() or remove()
		
		numList.set(0, 8952200);
		numList.remove(9);

		//iterating best to use listIterator instead of iterator
		//Iterator interface can be applied to all collection classes 
		//but it can traverse only in single direction that is Forward direction.
		//listiterator goes front and back
		
		Iterator iterator = numList.iterator();
		ListIterator<Integer> i = numList.listIterator();
		
		
		for (Integer num: numList) {
			System.out.println(num);
		}
		
		while ( i.hasNext()) {
			System.out.println(i.next());
		}
		
//		while ( i.hasPrevious()) {
//			System.out.println(i.hasPrevious());
//		}
		
		
		// not thread safe : arraylist, linkedlist
		//wrapped  it with sync or concurrent methods
		
		List<Integer> threadSafelist = Collections.synchronizedList(numList);
		
		//if u do the above , performance will go down
		//should do 
		
		synchronized (numList) {
			while (i.hasNext()){
				//print
			}
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
	
	static void add100Cats(List<Cat> list) {
		
		for(int i = 0; i < 1_000_00; i++) {
			Cat newCat = new Cat(i);
			list.add(newCat);
		}
	}

}
