
/////////////////ARRAY OUT OF BOUND EXCEPTION///////////////////////
public class DEMO1{
	public static void main(String [] args) {
		int [] arr= {1,2,3,4};
		try {
			System.out.println(arr[5]);////error
		}
		catch (Exception e) {
			System.out.println("ARRAY OUT OF BOUND");
		}
	}
}