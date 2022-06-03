package Constructor;

public class Sample7 extends Sample6 {
	
	
	public static void main(String[] args) {
		
		
		// creat object of diffrent class
		Sample6 S1=new Sample6();
		S1.addition();
		S1.multiplication();
		S1.Divide();
		S1.Substract();
		S1.Studentinfo();
		System.out.println("------------------------------");
		// creat object of diffrent class
		Sample6 S2=new Sample6(300,30);
		S2.addition();
		S2.multiplication();
		S2.Divide();
		S2.Substract();
		S2.Studentinfo();
		
		System.out.println("------------------------------");
		// creat object of diffrent class
		Sample6 S3=new Sample6(200,50);
		S3.addition();
		S3.multiplication();
		S3.Divide();
		S3.Substract();
		System.out.println("------------------------------");
		// creat object of diffrent class
		Sample6 S4=new Sample6("Ganesh");
		S4.Studentinfo();
		
	
		
		       
		       
		
		
	}

}
