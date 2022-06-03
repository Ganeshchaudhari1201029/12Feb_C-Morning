package Polymorphism;

public class Test2 {
	
	//Method Overloading
	
	public void addition(int a,int b) 
		//method declartion
	{      
		int c=a+b;  //method defination
		System.out.println(c);	
	}
	public void addition(float g ,float h) 
	{//method declartion

	float sum=g+h;
		System.out.println(sum);
	}
	public void addition(int a,int b,int c,int d) {
		//method declartion
		int sum=a+b+c+d;
		System.out.println(sum);//method defination
	}
	//method declartion
	public void addition(int a,int b,int c,int d,int e) {
		
		int sum=a+b+c+d+e;
		System.out.println(sum);//method defination
	}
	public void addition(char K ,String V) {
		
	System.out.println(K);System.out.println(V);
	
	}

}
