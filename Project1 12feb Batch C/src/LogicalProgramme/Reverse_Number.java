package LogicalProgramme;

public class Reverse_Number {

	
	public static void main(String[] args) {
		
		int org=1234;
		int Rev=0;
		for (int i=org;i>0;i=i/10) {
			int Rem=i % 10;
			Rev=Rev*10+Rem;
		}
		
		System.out.println(Rev);
		
		
		
		
		
	}
}
