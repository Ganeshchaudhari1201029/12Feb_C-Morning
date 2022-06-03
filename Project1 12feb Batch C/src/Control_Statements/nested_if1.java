package Control_Statements;

public class nested_if1 {
	public static void main(String[] args) {
		String Username="GaneshChaudhari";
		String Passward="Ganesh@123";
		
		if ("GaneshChaudhari"==Username) {
			System.out.println("Correct Username");
			
			
		if ("Ganesh@123"==Passward)
		{
			System.out.println("Correct Passward login sucessfull");
				
		}
		else {
			System.out.println("Wrong Passward login failed");
		}
		}
		else {
			System.out.println("Invalid Username---< login failed");
		}
	}

}
