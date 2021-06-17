
public class Checkaage {

	
	static void checka(int age) {
		
				if(age<18) {
		
				throw new ArithmeticException("ACCESS DENIED");
			}
		
		else { 
		System.out.println("WELCOME");
		}	      	
			
		
	}
	public static void main(String args[]) {
		checka(12);
	}
}
