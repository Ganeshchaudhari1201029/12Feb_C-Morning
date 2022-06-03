package Arrey;

import java.util.Arrays;

public class Intarrayasc2 {
	public static void main(String[] args) 
    {
		
 	      // Array declartion
          int[] ar=new int[5];

         //Array Initilisation
            ar[0]=300;
            ar[1]=100;
            ar[2]=200;
            ar[3]=500;
            ar[4]=400;   
 	   
            Arrays.sort(ar);;
            
            for (int i=ar.length-1;i>=0;i--)
            {
 	   System.out.println(ar[i]);
	}     
	
}
}