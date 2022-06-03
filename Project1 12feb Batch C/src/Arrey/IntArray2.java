package Arrey;

public class IntArray2 {
	public static void main(String[] args) {
		

		//Array declartion
		int[] ar=new int[5];  //Size of Array is 5
		
	//Arrray initilisation
		ar[0]=100;
		ar[1]=200;
		ar[2]=300;
		ar[3]=400;
		ar[4]=500;
		
		//Usage
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		//OR
		System.out.println("-------------------------");
		
		
		//i=0 0<=4   1
		     //1<=4  2
		     //2<=4  3
		     //3<=4  4
		     //4<=4  5  
		     //5<=4
		for (int i=0;i<=4;i++) {
			System.out.println(ar[i]);
			
			
		}
			
			
	}

}
