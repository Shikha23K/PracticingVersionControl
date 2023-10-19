package JavaConcepts;
import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
	    a.add("Suzo");
	    a.add("Sunu");
	    a.add("Supu");
	    a.add("Sumu");
	    a.add("Suru");
	    a.add("Suku");
	    System.out.println("Size of Array List :"+a.size());
	    a.forEach(System.out::println);
	    ArrayList<String> data1=new ArrayList<String>();
	        
	    data1.add("Welcome");
	    data1.add("120");
	    data1.add("home");
	    data1.add("123.891");
	    System.out.println("Successfully entered different type of data and size is :"+data1.size());

	    data1.forEach(System.out::println);
	    //Inserting data in between the list
	    data1.add(1,"home");
	    data1.add(4,"888");
	    data1.forEach(System.out::println);
        System.out.println(data1);
        
        //removing by index
        data1.remove(4);
        System.out.println(data1);

        data1.remove("home");
        System.out.println(data1);

        //get() to fetch element
        System.out.println(data1.get(3));
        System.out.println(data1);
        //set(): to replace  element
        data1.set(0,"Shikha");
        System.out.println(data1);
        data1.addAll(4, a);
        System.out.println(data1);
        System.out.println(data1.contains("Shikha"));
    	
		
	}

}
