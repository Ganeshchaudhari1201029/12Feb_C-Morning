package Types_Of_Veriables;

public class Static_Global1 {
	
	static int A=50;  // Static global variable
	static int B=60; // Static Global Variable
	public static void main(String[] args) {
		System.out.println(A);   // variable Name
		System.out.println(B);  // variable Name
		G1();
		Static_Global1 S1=new Static_Global1();
		S1.G2();
	
	}
	public static void G1() 
	{
		System.out.println(A); // variable name
		System.out.println(B); // variable name
		
	}
    public  void G2() 
    	{
	System.out.println(A);  // variable Name
	System.out.println(B);
	
}
}
