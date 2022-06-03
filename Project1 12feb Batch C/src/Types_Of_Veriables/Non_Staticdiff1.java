package Types_Of_Veriables;

public class Non_Staticdiff1 {

	// Non static/ instant Global variable Call from diffrent class
	public static void main(String[] args) {
		 // Creat object from Diffrent Class
		Non_StaticDiff2 H1=new Non_StaticDiff2();
		// Call variable
		System.out.println(H1.B);  //objectname.variablename;
		
	}
}
