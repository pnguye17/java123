package collectionsTutorial;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setTutorial {

	public static void main(String[] args) {
		//collections that has unique values HashSet, TreeSet, LinkedHashSet
		
		
		//HashSet - order not guaranteed, not thread safe, allows null
		//LinkedHashSet - insertion ordered, slow, not thread safe
		//treeset - natural order, not thread safe
		
		//C - add()
		//R - get()
		//U - remove(), add()
		//D - remove()
		
		System.gc();
		
		//create/post
		Set<Integer> n1 = new HashSet<>();
		Set<Integer> n2 = new LinkedHashSet<>();
		Set<Integer> n3 = new TreeSet<>();
		
		
		//insertion add()
		n1.add(10);
		n1.add(2);
		n1.add(3);
		n1.add(1);
		
		n2.add(19);
		n2.add(2);
		n2.add(39);
		n2.add(1);
		
		
		n3.add(10);
		n3.add(2);
		n3.add(3);
		n3.add(33);
	
		

		
////		for (Integer num :  n2) {
////			System.out.println(num);
////		}
//		
		//which one keeps insertion order - linkedlist
		//hashset ordering is by the hashcode...

		
		//update replacinng  a value with another value
		
		for (Integer num: n2) {
			if ( num == 39) {
				n2.remove(num);
				n2.add(1000);
			}
		}
		
	
		
		//deletion remove()
		
		n2.remove(1);
		
		
		//read
		Iterator<Integer> i = n2.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		//All of set implementations are not thread safe
		//wrap it ...will slow down processing 
		
		
		Set<Integer> n1Safe = Collections.synchronizedSet(n1);
		Set<Integer> n2Safe = (Set<Integer>) Collections.synchronizedCollection(n2);
	
		
		
		
		
	}
	

}
