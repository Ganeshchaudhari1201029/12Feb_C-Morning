package this_and_super_Keyword;

public class Sample2 extends Sample3{
	
	String b=("Ganesh chaudhari");
	char c=('B');
	int d=49;
	float e=(20.25f);
	
public void A1() {
	
	String b=("Rahul Ghodake");   //Local variable
	char c=('D');
	int d=38;
	float e=(57.12f);
	System.out.println(b);  //Rahul ghodake
	System.out.println(this.b);  //Ganesh chaudhari
	System.out.println(super.b);  //shubham turalkar
	System.out.println(c);     //D
	System.out.println(this.c);  //B
	System.out.println(super.c); //A
	System.out.println(d);      //38
	System.out.println(this.d);  //49
	System.out.println(super.d); //30
	System.out.println(e);       //57.12
	System.out.println(this.e);  //20.25
	System.out.println(super.e);   //30.49

	
	
	
	
	
}
public static void main(String[] args) {
	
	Sample2 G1=new Sample2();
	        G1.A1();
	
	
}
}
