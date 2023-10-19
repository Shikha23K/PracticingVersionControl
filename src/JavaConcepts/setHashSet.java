package JavaConcepts;
import java.util.Set;
import java.util.HashSet;
public class setHashSet {

	public static void main(String[] args) {
		//unordered insertion so index operation not allowed
		Set <String> fruit=new HashSet<>();
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Apple");
		
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
