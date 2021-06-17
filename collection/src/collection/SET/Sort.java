



package collection.SET;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sort {
	public static void main(String[] args) {
		SortedSet<Integer> s1= new TreeSet<Integer>();
		Scanner sc= new Scanner(System.in);
	
		for (int i=0;i<=10;i++) {
		try {
			  s1.add(sc.nextInt());
			
			System.out.println(s1);
		}
		
		catch(Exception e) {
			System.out.println("ONLY INTEGER ALLOWED");
			break;
		}
		}
		
		}
	
//		String m=s1.first();
//		String check="D";
//		System.out.print(s1+"\n"+s1.contains(check)+"\n"+s1.first()+""+m+"\n");
//		for (String value : s1) 
//            System.out.print(value 
//                             + ", "); 
//        System.out.println(); 
	}



