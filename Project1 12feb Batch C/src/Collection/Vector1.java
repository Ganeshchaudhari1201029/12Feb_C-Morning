package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		
		
		Vector G=new Vector();
		//add the information
		G.add("Ganesh");
		G.add(120);
		G.add('G');
		G.add(80.65f);
		G.add(500);
		G.add(null);
	
		System.out.println(G);
		//to verify object of vector class is empty or not
		System.out.println(G.isEmpty());
		System.out.println(G.size());
		//To verify information of an object
		System.out.println(G.contains("Ganesh"));
		System.out.println(G.contains(120));
		System.out.println(G.contains(100));
		
		//Add information in between Vector--> Right shift operation
		G.add(4,400);
		System.out.println(G);
		  
		   //remove/delete information in between Vector-->left shift operation
		    G.remove(4);
		    System.out.println(G);
		    //update information
		    G.set(5,400);
		    System.out.println(G);
		   
		    //to find index of data
		    System.out.println(G.indexOf("Ganesh"));
		    System.out.println(G.indexOf(500)); 
		    //to get data/information by providing index
		    System.out.println(G.get(3));
		    System.out.println(G.get(2));
		    
		    System.out.println("--------Iterator curser--------------");
		    
		    Iterator AB=G.iterator();
		    
		    while (AB.hasNext())
		    {
		    	System.out.println(AB.next());
		    }
		    System.out.println("--------ListIterator curser--------------");
		    ListIterator AAB=G.listIterator();
		    
		    while (AAB.hasNext())
		    {
		    	System.out.println(AAB.next());
		    }
		       
		    System.out.println("--------Enumeration curser--------------");
		    Enumeration  Enu= G.elements();
		    while(Enu.hasMoreElements())
		    {System.out.println(Enu.nextElement());
		    	}
		      //for each loop
		     System.out.println("-----------for each loop-----------");  
		           for (Object A1:G) 
		           {System.out.println(A1);
		        	   
		           }
		     
		     
		    
		    
}
}