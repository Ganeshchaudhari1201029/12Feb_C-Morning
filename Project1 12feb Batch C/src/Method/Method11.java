package Method;

public class Method11 {
	public static void main(String[] args) {
		
		StudentInfo("Ganesh Sarjerao Chaudhari",120,'A',90.18f);
		System.out.println("-----------------------------");
		StudentInfo("Rahul Shivaji Ghodake",111,'B',93.91f);
		System.out.println("------------------------------");
		StudentInfo("Shubham Vijay Turalkar",222,'A',96.45f);
		System.out.println("----------------------------");
		EmployeeInfo("Atul Dilip gawali",46,'A',80.50f);
		System.out.println("------------------------------");
		EmployeeInfo("Sumesh Bhalchandra Madane",43,'A',98.91f);
		System.out.println("------------------------------");
		Method11 S1=new Method11();
		S1.CompanyInfo("TCS",1,'A',99.99f);
		System.out.println("------------------------------");
		S1.CompanyInfo("Capgemini",2,'A',96.91f);
		System.out.println("------------------------------");
		S1.CompanyInfo("WIPRO",3,'B',91.92f);	
		System.out.println("------------------------------");
	}
	//Static Regular Method ....< With Parameter Method....> String,int, char,float
public static void StudentInfo(String Sname,int SrollNo,char SGrade,float Spercentage) {
	
	System.out.println("Student Name="+Sname);
	System.out.println("RollNo="+SrollNo);
	System.out.println("Grade="+SGrade);
	System.out.println("Percentage="+Spercentage);
	
}
public static void EmployeeInfo(String Name,int SNO,char Grade,float Percentage) {
	System.out.println("EmployeeName="+Name);
	System.out.println("SirialNO="+SNO);
	System.out.println("Grade="+Grade);
	System.out.println("Percentage="+Percentage);
	
}
	public void CompanyInfo(String Name,int No,char Grade,float Percentage) {
		System.out.println("CompanyName="+Name);
		System.out.println("Rank="+No);
		System.out.println("Grade="+Grade);
		System.out.println("Percentage="+Percentage);
		
	}
}

