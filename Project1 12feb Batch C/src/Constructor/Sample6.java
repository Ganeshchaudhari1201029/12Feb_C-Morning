package Constructor;

public class Sample6 {
	//Step-I: Variable declaration (Non-static global variable)
			//Use-I:It copies the member of class into an object---->after creation of object
			//Use-II: Initialize non-static global variable
			
			      int Num1;    //15       //datatype variablename;
			      int Num2;    //20            //datatype variablename;
			
	      String StudentName;
	     
	      // Step-II:Veriable initilization
	
	      Sample6() {     //  Without parameter user difine constructor 
	    	  Num1=40;
	    	  Num2=20;
	    	  StudentName=("Ganesh Sarjerao Chaudhari");
	    	    }
	      Sample6(int a ,int b ) {    //  With parameter user difine constructor ..> int
	    	  Num1=a;
	    	  Num2=b;
	    	  StudentName=("Ganesh Sarjerao Chaudhari");
	    	 
	    	  
	      } 
	      Sample6(String Sname){  //  With parameter user difine constructor ..> String
	    	  
	    	  StudentName=Sname;
	      }
	      

	// Usage
	public void addition() {
		int sum=Num1+Num2;
		System.out.println(sum);
		
	}
	
	public void multiplication() {
		
		int Mvalue=Num1*Num2;
		System.out.println(Mvalue);
	}
	public void Divide() {
		int Di=Num1/Num2;
		System.out.println(Di);
	}
public void Substract() {
	int Sub=Num1-Num2;	
	System.out.println(Sub);
}
public void Studentinfo() {
	System.out.println(StudentName);
	
}

}
