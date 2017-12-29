package test.com;
import java.util.*;


public class Storespricecomparetest {

	public static void main(String[] args) {
		ArrayList<Stores> list = new ArrayList<Stores>();
		list.add(new Stores("TV",550));
		list.add(new Stores("Hometheater",1250));
		list.add(new Stores("Computer",950));
		list.add(new Stores("Microwave",50));

		
		Collections.sort(list);		
		
		System.out.println("Products price after sorting");
		System.out.println(list);
	}

}
