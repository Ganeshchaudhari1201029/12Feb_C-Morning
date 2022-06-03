package this_and_super_Keyword;

public class Sample1 extends Sample3 {
	
	
	int a=50;
	int b=40;
public void G1() {
	
	int a=30;      // local variable
	int b=80;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(b);
	System.out.println(this.b);
	System.out.println(super.b);
}


public static void main(String[] args) {
	
	//creat object of same class
	Sample1 S1=new Sample1(); 
		S1.G1();
	
	
}

}
