package LogicalProgramme;

public class SwappingNumbers {
public static void main(String[] args) {
	
	int a=10;  int b=20;
	System.out.println("Before Swapping values are.."+a+"  "+b);

	//Logic1- Third variable
	
	int t=a;
	a=b;
	b=t;
	//Logic2 -use + & withought using Third variable
	a=a+b;//10+20=30
	b=a-b; //30-20=10
	a=a-b; //30-10=20
	
	//Logic3- us*and/without using third variable
	//here a&b value shouid not be Zero
	a=a*b; //10*20=200
	b=a/b;  //200/20=10
	a=a/b;  //200/10=20
	
	//Logic-4 bitwise XOR(^) 
	a=a^b;
	b=a^b;
	a=a^b;  
	//Logic-5 Single Statement
	//a=10 b=20
	b=a+b-(a=b);
	
	
	
	
	
	
	System.out.println("After  Swapping values are.."+a+"  "+b);

}
}
