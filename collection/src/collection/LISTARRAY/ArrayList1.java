package collection.LISTARRAY;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 class ArrayList1 {
	public static void main(String[] args) {
		List al= new ArrayList();
		List la =new LinkedList();
		la.add("abhi");
		la.add("Dharamkar");
		la.add(4);
		la.add(null);
		la.remove(3);
		System.out.print(la);
		
		
		al.add("abhi");
		al.add("Dharamkar");
		al.add(4);
		al.add(null);
		al.remove(3);
		System.out.print(al);
		//al.remove(1);
		//System.out.print(al);
		
	}


}
