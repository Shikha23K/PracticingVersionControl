package JavaConcepts;

import java.util.TreeSet;
import java.util.Set;

public class treeSet {

	public static void main(String[] args) {
		Set <String> fruit=new TreeSet<>();
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Orange");
		
		System.out.println(fruit);
		
		fruit.remove("Orange");
		System.out.println(fruit);
		System.out.println(fruit.contains("Orange"));
		System.out.println(fruit.size());
		System.out.println(fruit.isEmpty());
		fruit.clear();
		System.out.println(fruit);
		

	}

}
