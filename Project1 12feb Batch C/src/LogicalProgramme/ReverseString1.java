package LogicalProgramme;

public class ReverseString1 {
	
	public static void main(String[] args) {
		
		
		String A="GaneshChaudhari";
		String Rev="";
		
		for(int i=A.length()-1;i>=0;i--) {
			
			Rev=Rev+A.charAt(i);
	}

System.out.println(Rev);
}
}