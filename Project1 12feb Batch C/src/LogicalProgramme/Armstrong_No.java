package LogicalProgramme;

public class Armstrong_No {
	public static void main(String[] args) {
		
		int A=153;
		int Sum=0;
		
		
		for(int i=A;i>0;i=i/10) {
			
		int	rem=i%10;
		
		Sum=Sum+(rem*rem*rem);
			
		}
		{	System.out.println(Sum);
	}
	
    if(A==Sum) {
    	System.out.println("Given Number Is Armstrong No");
    	
    	
    }
    else {
    	System.out.println("Given Number is Not Armstrong No");
    }
}
}