package POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class collection1 {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(6);
		myList.add(7);
		myList.add(5);
		myList.add(10);
		
		for (Integer elementList:myList) {
			
			System.out.println(elementList);
		}
		
		System.out.println("\nRemovendo um elemento da minha lista");
		System.out.println();
		myList.remove(0);
		
		for(Integer elementList:myList) {
			
			System.out.println(elementList);
		}
		
		int firstElement = myList.get(0);
		System.out.println("\nO primeiro elemento da lista é: "+firstElement);
		
		System.out.println();
		
		for(int i=0;i<myList.size();i++) {
			
			System.out.println("\nElemento: "+myList.get(i));
		}
		
		Collections.sort(myList);
		System.out.println("\nDepois de ordenado, vai ficar assim...");
		System.out.println(myList);
		
		System.out.println();
		
		Set<Integer> mySet = new HashSet<Integer>();
		
		
		mySet.add(4);
		mySet.add(3);
		mySet.add(12);
		mySet.add(4);
		mySet.add(3);
		mySet.add(8);
		
		Iterator<Integer> iMySet = mySet.iterator();
		
		while(iMySet.hasNext()) {
			
			System.out.println(iMySet.next());
		}

	}

}
