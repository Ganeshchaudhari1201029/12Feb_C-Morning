package Interface;

public class Implementationclass implements InterfaceX,InterfaceY  {
	
	public void m1() {
		
		System.out.println("Method m1 is completed in implementation class");
	}
	
public void  m2() {
	
	System.out.println("method m2 is completed in implementation class");
	
}
public void m3() {
	
	System.out.println("Method m3 is completed in implementation class");
	
	
	
}
public void m4() {
	
	System.out.println("Method m4  is completed in implementation class");
	
	
}
public static void main(String[] args) {
	
	Implementationclass A1=new Implementationclass();
	                    A1.m1();
	                    A1.m2();
	                    A1.m3();
	                    A1.m4();
	
	
	
}

}
