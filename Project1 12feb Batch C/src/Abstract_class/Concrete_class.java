package Abstract_class;

public class Concrete_class  extends Incomplete_or_Abstract_class {  
	
	//Complete Method
	public void D1() //method declartion
	{
		System.out.println("Method D1 is completed in concrete class");//method defination
		
		
	}
	public void H1()//method declartion
	{
		System.out.println("method H1 is completed in concrete class");//method defination
		
		
	}
	public void H2() { //method declration
		
		System.out.println("Method H2 is completed in concrete class");//method defination
	}

	public static void main(String[] args) {
		
		Concrete_class  J1=new Concrete_class ();
		               J1.F1();
		               J1.D1();
		               J1.H1();
		               J1.H2();
		               
		 
	}
}
