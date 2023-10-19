package JavaConcepts;
import java.util.Collections;
import java.util.LinkedList;
public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> animal=new LinkedList<String>();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Tiger");
		animal.add("Lion");
		
		
		System.out.println("Animal List contains : "+animal);
		System.out.println("Size of animal List  : "+animal.size());
		Collections.sort(animal);
		System.out.println("Sorted animal  : "+animal);
		
		animal.add(2, "Elephant");
		System.out.println("After add at 3rd  "+animal);
		
		animal.addFirst("Rat");
		System.out.println("After add at 1st  "+animal);
		
		animal.addLast("Cat");
		System.out.println("After add at Last  "+animal);
		
		System.out.println("At 4th Node"+animal.get(4));
		
		Object an= animal.clone();
		System.out.println("Clone Copy of Animal List : "+an);
		System.out.println("Converted to String []   : "+an.toString());
		
		System.out.println("Get Last  : "+animal.getLast());
		System.out.println("Peek Last  : "+animal.peekLast());
		
		System.out.println("Removed First  : "+animal.removeFirst());
	
		animal.clear();
		System.out.println("List of Animal"+animal);
	}

}/*
You have to create array list of integers and linked list of strings
perform add, remove, set, etc operations wherever applicable
print before and after of each
check size, is emptyand to array methods as well and capture/print the response
*/