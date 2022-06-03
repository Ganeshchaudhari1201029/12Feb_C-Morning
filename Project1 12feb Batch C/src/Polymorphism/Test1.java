package Polymorphism;

public class Test1 {
	
	
		public static void main(String[] args)   //Stack area
		{
			m1();
			Test1 S1=new Test1();
			      S1.m2();
		}
		
		public static void m1()   //Static pool area             //method declaration
		{
			System.out.println("Hi");    //Method Area           //Method defination
		}
		
		    public void m2()               //Heap Area             //method declaration
		{
			System.out.println("Hello");     //Method Area       //Method defination
		}

	}
	
             // (Execution Flow)

 // method declaration method defination......>Binding/Clubing..>Polymorphism
