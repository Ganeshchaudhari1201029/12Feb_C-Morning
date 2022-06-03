package Constructor;

	public class Sample_1 
	{
	    //default constructor
		//Use-I:It copies the member of class into an object---->after creation of object
		public static void main(String[] args) 
		{
			// Create object of same class
			Sample_1 S1=new Sample_1();               //classname objname=new classname();
			// call the method
			   S1.multiplication();
			   
		 //Create object of different class
			  Sample2 S2=new Sample2();   
			   //call the method
			     S2.addition();
		}
		
		// non-static regular method
		public void multiplication()
		{
			int a=10;
			int b=20;
			int mulvalue=a*b;
			System.out.println(mulvalue);
		}
		
		
		
	


	
		
		
		
		
		
	}
	
	
	


