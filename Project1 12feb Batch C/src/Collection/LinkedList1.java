package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList L1=new LinkedList();
		// To add information
		L1.add("Ganesh");
		L1.add(200);
		L1.add('A');
		L1.add(90.18f);
		L1.add(100);
		L1.add(200);
		L1.add(null);
		L1.add(null);
		L1.add(100);
		
		System.out.println(L1);
		
		System.out.println(L1.size());
		System.out.println(L1.isEmpty());
		System.out.println(L1.contains(100));
		//to add information in between linked list---->Right shift operation
		L1.add(3, "Rahul");
		System.out.println(L1);
		//to remove information-->left shift operations 
		L1.remove(9);
		System.out.println(L1);

		//update information
		L1.set(6,100);
		System.out.println(L1);
		//to find index of information
		System.out.println(L1.indexOf(100));
		//to get the data by providing index
		System.out.println(L1.get(5));
		
		System.out.println("----iterator curser-----");
		
		Iterator Itr=L1.iterator();
		while (Itr.hasNext())
		{ System.out.println(Itr.next());
		
		}
		System.out.println("----Listiterator curser-----");       
		
        ListIterator litr=L1.listIterator();

     while(litr.hasNext()) 
     {
  	  System.out.println(litr.next()); 
     }
     System.out.println("-------for each loop------------");
		
		for(Object S2:L1)
		{
			System.out.println(S2);
		}
			
			
		}
		
	}


