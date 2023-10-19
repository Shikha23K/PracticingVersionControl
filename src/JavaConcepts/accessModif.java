package JavaConcepts;
/*
2 packages with 2 classes each. One class in pkg 1 to hold all types of access modifiers..
2 pkgs- one with 3 classes and one iwth 2 class
Gunjan Kaushik4:47 PM
out of 3 classes, one to have access mod with calling in the same class. one class to inherit the acc mod class and use the elemnts. 3rd class not to inherit but use the elements.

Out of 2 classes of other pkg, one has to inherit acc spc class and use elements and other class not to inherit and use elements
Gunjan Kaushik5:00 PM
Create a class with static and non static members and access them with and without creating object of the class
*/
class myClass
{
	
}

public class accessModif {

	String s="default";
	public String p="Public";
	private String q="Private";
	protected String r="protected";
	
	public void print() {
		System.out.println(p);
	}
	
	private void print1() {

		
		System.out.println(q);
	}
	protected void print2() {
		print1();
		System.out.println(r);
	}
	
	static String st="Static variable";
	static void print3()
	{
		System.out.println(st);
		
	}
	public static void main(String[] args) {
		accessModif ob=new accessModif();

		System.out.println(ob.s);
		System.out.println(ob.p);
		//System.out.println(ob.q);
		System.out.println(ob.r);
		ob.print3();
		accessModif.print3();
		ob.print();
		ob.print2();
		

	}

}
