package Constructor;

//import Constructor.Sample_3.Sample4;

public class Sample_4 {//Step-I: Variable declartion (Non-static global variable)
	//Use-I:It copies the member of class into an object---->after creation of object
	//Use-II: Initialize non-static globle variable
	
	      int c;               //datatype variablename;
	      int d;  
	      
	      //datatype variablename;
	
      //Variable initialisation      
	  Sample_4()                     //user defined constructor
	 {
		 c=50;
		 d=10;
		int p=400;
		int q=500;
		 int G=p+q;
		 System.out.println(G);
		 
	 }

	  //usage
	  public void division() 
	  {      
	         
		     int divvalue=c/d;
		     System.out.println(divvalue);
		    
	  }
	  
	public static void main(String[] args) 
	{
		//create object of same class
		Sample_4 S4=new Sample_4();
		     S4.division(); 
		     
		  //create object of different class
		   Sample_3 S3=new Sample_3();   
		   S3.addition();
		  S3.multiplication();
		  
		  
		  
		  Sample5 B1=new Sample5();
		  B1.A();
		  Sample_1  G1=new Sample_1 ();
		         G1.multiplication();
		      
		  
		  
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

