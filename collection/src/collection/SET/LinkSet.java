package collection.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkSet {
	public static void main(String [] args) {
		
	
        HashSet<String> set=new LinkedHashSet<String>();  
        LinkedHashSet<String> set1=new LinkedHashSet<String>(); 
        
        set.add("ABHISHEK");
        set.add("A");
        set.add("D");
        //System.out.println(set);
        
        set1.add("ABHISHEK");
        set1.add("A");
        set1.add("D");
        //System.out.println(set1);
        Iterator<String> i=set1.iterator();  
        while (i.hasNext()){
        	 System.out.println(i.next());
        }
	}
}
