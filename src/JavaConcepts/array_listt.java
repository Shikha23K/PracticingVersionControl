package JavaConcepts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array_listt {

	public static void main(String[] args) {
		
		ArrayList<Integer> odd=new ArrayList<Integer>();
		for(int i=12;i<33;i++)
			if(i%2!=0)
				odd.add(i);		
		System.out.println("Before adding new elements   : "+odd);
		
		int od[]=new int[] {89,75,111,123};
				// odd.addAll(odd.size()-1,(od));
		/*It doesnt work because A cast
		*does not help with the problems of Collections.addAll. We cannot cast an 
		*array of ints to Integers. Here is the compilation problem
		*incompatible arrays (where int does not match Integer) are not supported. 
		*Often to add arrays to ArrayLists, a for-loop is needed.
		*/
		
		for(int i=0;i<od.length;i++){
			odd.add(od[i]);
		}
		System.out.println("The odd number List :  "+odd);
		
		odd.remove(5);
		
		System.out.println("The odd number List after removing :  "+odd);
		
		System.out.println("At the index 5 : "+odd.get(5));
		
		odd.add(6,93);
		System.out.println("The odd List after add in between :  "+odd);
		
		odd.set(3,3);
		System.out.println("The odd List after replacing 4th  :  "+odd);
		
						
		ArrayList<String> fruit=new ArrayList<String>();
		fruit.add("Mango");
		fruit.add("Banana");
		fruit.add("Peach");
		
		System.out.println(fruit.size());
		System.out.println("Before adding new Items. :"+fruit);
		fruit.add("Apple");
		fruit.add("Lichi");
		fruit.add("Orange");
		System.out.println("After adding new Items. :"+fruit);
		System.out.println("Size of Fruit list  :"+fruit.size());
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener index : ");
		int i=sc.nextInt();
		fruit.add(i,"Pinapple");
		System.out.println("After adding new Items. :"+fruit);
		
		String fr[]= {"Grapes","Watermelon"};
		fruit.addAll(Arrays.asList(fr));
		System.out.println("After adding new Items. :"+fruit);		
		
		fruit.remove(7);
		System.out.println("After modifying :"+fruit);
		
		fruit.remove("Lichi");
		System.out.println("After modifying :"+fruit);
		
		String f= fruit.get(3);
		System.out.println("What we get :"+f);
		
		fruit.set(2, "Lichi");
		System.out.println("After modifying :"+fruit);
		
		fruit.forEach(System.out::println);
		
		if(fruit.contains("Peach"))
				{
			System.out.println("Peach is not there");
				}
		else
			fruit.add("Peach");
		fruit.forEach(System.out::println);
		Collections.sort(fruit);
		System.out.println("Sorted List :");
		fruit.forEach(System.out::println);
		
		
		

	}

}
