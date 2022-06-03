package Access_Specifiers;

public class Sample5 {
	
	protected int l=60;
	public static void main(String[] args) {
		
		Sample5 J1=new Sample5();
		       J1.M1();
		System.out.println(J1.l);
	}
	
    void M1() {
		System.out.println("Ganesh Sarjerao Chaudhari");
		
	}

}
