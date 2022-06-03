package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
public static void main(String[] args) {

	//create object of arraylist1
	
	//add the information
	ArrayList al=new ArrayList();
	al.add("Ganesh");
	al.add(200);
	al.add('G');
	al.add(90.18f);
	al.add("Sushil");
	al.add(null);
	al.add(null);
	
	
	
	
	
	System.out.println(al);
	//verify arraylist is empty or not
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	//verify information is present in the object or not
	System.out.println(al.contains(200));
	//add information inbetween arraylist-->Right shift operation
	al.add(4,500);

	System.out.println(al);
	//remove information-->Left shift operation
	al.remove(4);
	System.out.println(al);
	//update information
	al.set(3, 80.5f);
	System.out.println(al);
	//to find index of data
	System.out.println(al.indexOf("Rahul"));
	//to get data/information by providing index
	System.out.println(al.get(2));
	System.out.println("----------------iterator curser-----------------------------------");
	//iterator curser
	   Iterator itr=al.iterator();
	 
	 while(itr.hasNext())
	{
		System.out.println(itr.next());
		
		
	}
	 
	
	
	System.out.println("-----------------Listiterator curser------------");
	
	//iterator curser
	ListIterator Itr=al.listIterator();
	
	while(Itr.hasNext())
	{
		System.out.println(Itr.next());
	}
	//for each loop
	System.out.println("----For Each Loop------");
	for(Object S1:al)
	{
		System.out.println(S1);
	}
	}


}
