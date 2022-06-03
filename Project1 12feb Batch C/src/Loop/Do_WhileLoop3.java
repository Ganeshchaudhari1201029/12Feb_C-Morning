package Loop;

public class Do_WhileLoop3 {
	public static void main(String[] args) {
		
		int i=3000;
		do {
			i=i-300;
			System.out.println(i);
			System.out.println("-------");
		}while(i>=1);
		Ganesh1();
		Rahul1();
	}
	public static void Ganesh1() {
		int i=1;
		do {
			i++;
		
			System.out.println("Hi");
			System.out.println("-------");
		}while (i<=5);
	}
	public static void Rahul1() {
		int i=1;
		do {
			i++;
			System.out.println("Hello Ganesh");
			System.out.println("------------");
		}while (i<=10);
	}
}
