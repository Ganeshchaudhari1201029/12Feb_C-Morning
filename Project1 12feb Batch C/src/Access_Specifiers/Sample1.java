package Access_Specifiers;


import Method.Method8;

      
public class Sample1 {
	public int a=12;
	public static void main(String[] args) {
		Method8.M12(); 
		Sample1 A1=new Sample1();
		A1.G1();
		A1.G2();
		System.out.println(A1.a);
		Method8 C1=new Method8();
		        C1.M13();
		        C1.M14();
		       
	}
	public void G1() {
		System.out.println("Ganesh Chaudhari");
	}
public void G2() {
	
	System.out.println("Rahul Ghodake");
}
}
