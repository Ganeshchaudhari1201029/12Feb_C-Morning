package Arrey;

public class StringArray1 {
public static void main(String[] args) {
	
	
	String ar[]=new String [6];
	      ar[0]="Ganesh";
	      ar[1]="Rahul";
	      ar[2]="Shubhm";
	      ar[3]="Sumesh";
	      ar[4]="Akshay";
	      System.out.println(ar.length); 
	      System.out.println(ar[0]);
	      System.out.println(ar[1]);
	      System.out.println(ar[2]);
	      System.out.println(ar[3]);
	      System.out.println(ar[4]);
	      System.out.println(ar[5]);
	      
	      //OR
	      System.out.println("------------------");
	
	      
	      for (int i=0;i<=ar.length-1;i++) {
	    	  System.out.println(ar[i]);
	      }
	
}
}
