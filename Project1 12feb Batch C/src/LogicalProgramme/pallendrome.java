package LogicalProgramme;

public class pallendrome {
	public static void main(String[] args) {
		
		String A="Noon";
		String Rev="";
		
		for(int i=A.length()-1;i>=0;i--) {
			
			Rev=Rev+A.charAt(i);
			
	}
		System.out.println(Rev);
    if(A.equals(Rev)) 
         {
	
	System.out.println("Given String Is Pallendrome");
}
else {
	
	System.out.println("Given string is not pallendrome");
	
	
}
}
}
