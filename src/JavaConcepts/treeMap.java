package JavaConcepts;
//TreeMap
import java.util.TreeMap;
import java.util.Map;

public class treeMap {

	public static void main(String[] args) {
		Map<Integer,String> cntry=new TreeMap<>();
		cntry.put(1,"India");
		cntry.put(2, "Bangladesh");
		cntry.put(3,"Shrilanka");
		cntry.put(2,"Pakistan");
		cntry.put(4,"Nepal");
		cntry.put(5,"Bhutan");
		System.out.println(cntry);
		
		System.out.println(cntry.get(2));
		System.out.println(cntry.remove(2));
		System.out.println(cntry);
		System.out.println("Is there "+cntry.get(3)+" Present "+cntry.containsKey(3));
		
		System.out.println(cntry.size());
		
		System.out.println(cntry.isEmpty());
		System.out.println(cntry.keySet());//key 
		
		System.out.println(cntry.values());//value
		System.out.println(cntry.entrySet());
		
	}

}
