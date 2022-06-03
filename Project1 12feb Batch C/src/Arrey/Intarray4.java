package Arrey;

public class Intarray4 {
	public static void main(String[] args) {
		// Array declartion
	    int[] ar=new int[6];
	   
	  //Array Initilisation
	    ar[0]=300;
	    ar[1]=100;
	    ar[2]=200;
	    ar[3]=500;
	    ar[4]=400;
	    ar[5]=800;
	 
		//usage
	
		 System.out.println(ar.length);  //Size
	
	System.out.println("----------------------------------------");
	
		for(int i=0; i<=5; i++) 
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------------------------------------");

		           //OR
		     //i=0       0<=5               1
		                //1<=5              2
		                //2<=5               3
		                //3<=5                4
		                //4<=5                5
		                //5<=5                6
		               //6<=5
		                
		for(int i=0;    i<=ar.length-1;     i++) 
		{
			System.out.println(ar[i]);  //300  100  200   500   400 800
		}
		
		
		
		
	}
	
	
	
	
	}


