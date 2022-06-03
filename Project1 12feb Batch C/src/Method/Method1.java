package Method;



public class Method1 {
	
	// Class body
	
	public static void main(String[]args) {
		
		//main method body
		System.out.println("Main Method Started");
		
		
		
		
		//call static regular method
		M1();  //methodname();
		M2();   //methodname(); //static regular method from same class;
		M3();  //methodname();
		M4();   //methodname();
		Method2.Ganesh1();     //Classname.MethodName();
		Method2.Rahul1();      //Classname.MethodName();   //static regular method from diffrent class;
		Method2.Shubham1();    //Classname.MethodName();
		Method2.Akshay1();      //Classname.MethodName();
		System.out.println("Main Method Ended");	
		
	}
	
	// static regular method
	public static void M1(){
		System.out.println("Static Regular method Is Started from Class1 M1");			
	}
	public static void M2() {
		System.out.println("Ganesh Sarjerao Chaudhari ");
		System.out.println("AP kangaon Tal Daund Dist Pune");
		
		
	}
	
	public static void M3() {
		String StudentName;
		int StudentRoll;
		char StudentGrade;
		float StudentPercentage;
		StudentName=("Ganesh");
		StudentRoll=(12345);
		StudentGrade=('A');
		StudentPercentage=(80.13f);
		
		System.out.println("StudentName="+StudentName);
		System.out.println("StudentRollNo="+StudentRoll);
		System.out.println("StudentGrade="+StudentGrade);
		System.out.println("StudentPercentage="+StudentPercentage+("%"));
		
	}
	public static void M4() {
		String  StudentName;
		int   StudentRollNo;
		byte StudentN;
		short StudentNOO;
		long StudentNooo;
		char StudentGrade;
		float StudentPercentage;
		double StudentpercentG;
		
		
		StudentName=("Rahul Shivaji Ghodake");
		StudentRollNo=(1000011111);
		StudentN=(111);
		StudentNOO=(11111);
		StudentNooo=(2222222222222222222L);	
		StudentGrade=('B');
		StudentPercentage=(91.12f);
		StudentpercentG=(81.11111111f);
		
		
		System.out.println("StudentName="+StudentName);
		System.out.println("StudentRollNo="+StudentRollNo);
		System.out.println("StudentN="+StudentN);
		System.out.println("StudentNOO="+StudentNOO);
		System.out.println("StudentNooo="+StudentNooo);
		System.out.println("StudentGrade="+StudentGrade);
		System.out.println("StudentPercentage="+StudentPercentage+"%");
		System.out.println("StudentpercentG="+StudentpercentG+"%");
		

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
			
		
				
		
	
	
	
	
	
	
	
	
	
	
	


