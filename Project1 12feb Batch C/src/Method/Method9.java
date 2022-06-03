package Method;

public class Method9 {
	
	public static void main(String[] args) {
		addition();
		addition( 60,30);
		addition (20,2);
		addition (2,3,6);
		addition(100,29,40);
		addition(10,20,10);
		Ganesh (2010,10);
		Ganesh (400,20);	
		Method9 Ra=new Method9();
		 Ra.Rahul(20,15);
		Ra.Rahul(100, 10);
		
	}
	//satic regular method    //Without patameter/Zero parameter method
		public static void addition() {
			//veriable declaration & Initilization
			int a=10;
			int b=20;
			int C=a+b;
			System.out.println(C);
			int A=30;
			int B=25;
			int D=A*B;
			System.out.println(D);
			int S=200;
			int J=10;
			int F=S/J;
			System.out.println(F);
			float G=20.5f;
			float H=70.6f;
			float P=G+H;
			System.out.println(P);
			char X=('A');
			System.out.println(X);
			int Q=30;
			int V=20;
			int N=79;
			int L=Q+V+N;
			System.out.println(L);
			String StudentName;
			StudentName=("Ganesh Chaudhari");
			System.out.println(StudentName);
			
		}
        //Static regular Method With Parameter/2 parameter method
		public static void addition(int a,int b) {
			
			int C=a+b;
			System.out.println(C);
		}                // sratic regular method with parameter/3 parameter method
		public static void addition (int P,int Q,int R) {
			int A=P*Q*R;
			System.out.println(A);
		}
		
		public static void Ganesh(int D,int C) {
			int Ganu=D*C;
			System.out.println(Ganu);
		}
		
		public void Rahul(int Q,int R) {
			int Shubham=Q*R;
			System.out.println(Shubham);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}