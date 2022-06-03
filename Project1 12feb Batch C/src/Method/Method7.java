package Method;

public class Method7 {
	public static void main(String[]args) {
		//Static regular method Call From Same Class
		Ganesh10();
		//MethodName();
		//Create Object Of Same/Current Class 
		Method7 B1=new Method7();
		//Classname ObjectName=New Classname();
		//Call The Method
		B1.Shubham12();
		B1.Rahul13();
		
		Method8.M12(); //Classname.methodnme();
		//Non static regular method from diffrent class
		Method8 C1=new Method8();
		//classname objectname=new Classname();
		//Call The Method
		C1.M13();
		C1.M14();
		//Objectname.Methodname();
		
		
		
		
		}

	//Static Regular Method
	public static void Ganesh10() {
		System.out.println("Hi Ganesh");
		System.out.println("I am An Indian");
		
	}
	//Non Static Regular Method
	public void Shubham12() {
		System.out.println("Hello Shubham ");
		
	}
	//Non Static Regular Method
	public void Rahul13() {
		System.out.println("MY name Is Rahul Shivaji Ghodake");
		
	}
}
