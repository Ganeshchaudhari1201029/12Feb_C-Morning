package Loop;

public class While_Loop2 { 
	public static void main(String[] args) {
		G2();
		M1();

		
		int i=100;
		while(i>=2) {
			System.out.println(i);
			System.out.println("----");
			i=i-10;
		}
		
	} 
	public static void M1(){
	int i=20;
	while(i<=80) {
		System.out.println(i);
		System.out.println("----");
		i=i+4;}
	}
	public static void G2() {
		int i=200;
		while(i>=50) {
			System.out.println(i);
			System.out.println("---");
			i=i-4;
			
		}
	}
}

