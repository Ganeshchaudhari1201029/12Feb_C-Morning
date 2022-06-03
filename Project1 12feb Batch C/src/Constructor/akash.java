package Constructor;

public class akash {
	
	public static void main(String[] args) {
		
		akash S1=new akash();
		
		akash S2=new akash(10,20);
		
		akash S3=new akash(15,25);
	}
	
	akash(){
		
		System.out.println("Ganesh");
	}

	akash(int a,int b){
		
		 
		
		 int c=a+b;
		 System.out.println(c);
	}

}
