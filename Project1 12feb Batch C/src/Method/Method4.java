package Method;

public class Method4 {
	public static void main(String[]args) {
		System.out.println("Main Method Started");
		
		Rahul1();    //static regular method from same class
		Ganesh1();
		Shubham1();
		Method2.Ganesh1(); //static regular method from Diffrent Class
		Method2.Rahul1();
		Method4 G1=new Method4(); //Create A New Object
		G1.Ganesh2(); //Non Static Regular Method 
		G1.Rahul2(); //ObjectName.Method Name();
		
		
		
		
		
		
		
		System.out.println("Main Method Ended");
		
	
	}
	
	public static void Rahul1() {
		System.out.println("Public static Void Main Method In Same Class is Present");
		
		
		
	}
	public static void Ganesh1() {
		System.out.println("Public Static Void Main Method From Ganesh1");
	
		
	}
	public static void Shubham1() {
	System.out.println("Public Sttic Void Main Method From Shubham");
	
		
	}
	public void Ganesh2() {
		System.out.println("I am a IT Engineer");
			
	}
	public void Rahul2() {
		System.out.println("I Am a Civil Engineer");
		
	}
}
