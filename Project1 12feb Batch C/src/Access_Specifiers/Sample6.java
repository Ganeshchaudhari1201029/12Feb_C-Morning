package Access_Specifiers;

public class Sample6 extends Sample5{
	
	protected int c=3;
	
public static void main(String[] args) {

    
	Sample6 S1=new Sample6();
	      S1.H1();
	      S1.M1();
	System.out.println(S1.c);
	System.out.println(S1.l);
}

protected void H1() {
	
	System.out.println("Rahul Ghodake");
}
}
