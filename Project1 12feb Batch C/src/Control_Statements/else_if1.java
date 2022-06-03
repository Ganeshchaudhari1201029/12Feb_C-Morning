package Control_Statements;

public class else_if1 {
	// else if ....> Multiple condition
	public static void main(String[] args) {
		
		int marks=61; //Starting condition
		
		// 33>=65
		if (marks>=65)      // end condition
		{System.out.println("Distintion");
			
		}
		// 33>=60
		else if (marks>=60)  //end condition
		{System.out.println("First class");
	}
         // 33>=55
		else if (marks>=55)  //end condition
		{System.out.println(" Higher Second Class");
}              //33>=50
		else if (marks>=50)  //End condition
			{System.out.println("Second Class");	
		}
		//33>=35
		else if (marks>=35)   //End Condition
		{System.out.println("Pass");
}
		else {System.out.println("Fail");
}
	}
}