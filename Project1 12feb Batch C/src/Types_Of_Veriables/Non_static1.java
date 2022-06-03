package Types_Of_Veriables;

public class Non_static1 
{   // Non static/ instant Global variable Call from same class

	int S=80;  // Non static/ instant Global variable
	
	public static void main(String[] args) 
	{
		
		// creat object from same class
		
		Non_static1 A1=new Non_static1();
		//Call Variable
		System.out.println(A1.S);  // objectname.variablename;
		
	}
	
	

}
