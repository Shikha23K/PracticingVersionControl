package JavaConcepts;

import java.util.List;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(4);
		num.add(1);
		num.add(8);
		
		System.out.println(num);
		
		num.add(0, 8);
		num.add(2, 15);
		System.out.println(num);
		
		num.remove(0);
		System.out.println(num);
		
		System.out.println(num.get(1)+" "+num.get(3));
		
		System.out.println("Size "+num.size());
		
		if(num.contains(15)==true)
			System.out.println(" 15 Exists");
		else
			System.out.println(" 15 not Exists");
		
		System.out.println(num.indexOf(15));
		System.out.println(num.indexOf(7));
		
		
		
	}

}
