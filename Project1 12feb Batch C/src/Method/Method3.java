package Method;

public class Method3 {
	
	
	public static void main(String[]args) {
		
		System.out.println("Main Method Started");
		//Create Same Object Of Class
		Method3 S1=new Method3(); //ClassName ObjectName=new ClassName();
		// Call The Method
		S1.M3();      // ObjectName.MethodName();
		S1.Ganesh1(); //Object Name.MethodName();
		S1.Rahul1();   //Object Name.Method Name();
		S1.Shubham1();  //OblectName.MethodName();
		S1.Akshay1();   //ObjectName.MethodName();
		
		
		System.out.println("Main Method Ended");
		
	}
//Non Static Regular Method
	public void M3() {
		System.out.println("Ganesh Sarjerao Chadhari");
		System.out.println("Rahul Shivaji Ghodake");
		System.out.println("Shubham Vijay Turalkar");
		
	}
	public void Ganesh1() {
		String FullName;
	int PRNNo;
	char Grade;
	float Percentage;
	   
	FullName=("Ganesh Sarjerao Chaudhari");
	PRNNo=(1201029);
	Grade=('A');
	Percentage=(77.13f);
	System.out.println("Full Name="+FullName);
	System.out.println("PRNNo="+PRNNo);
	System.out.println("Grade="+Grade);
	System.out.println("Percentage="+Percentage+"%");
				
	}
	public void Rahul1() {
		String StudentName;
		int BikeEnginNo;
		char Grade;
		float percentage;
		StudentName=("Rahul Shivaji Ghodake");
		BikeEnginNo=(98765);
		Grade=('B');
		percentage=(90.18f);
		System.out.println("StudentName="+StudentName);
		System.out.println("BikeEnginNo="+BikeEnginNo);
		System.out.println("Grade="+Grade);
		System.out.println("Percentage="+percentage+"%");
		
	}
	public void Shubham1() {
		String StudentName;
		StudentName=("Shubham Vijay Turalkar");
		System.out.println("StudentName="+StudentName);
	}
	public void Akshay1() {
		String EngineerName;
		EngineerName=("Akshay Sanjay Chinchore");
		System.out.println("EngineerName="+EngineerName);
		
	}
}
