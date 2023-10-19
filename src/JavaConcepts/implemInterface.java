package JavaConcepts;

public class implemInterface implements InterfaceAbst,Interface2{
	@Override
	public void draw() {
		System.out.println("Interface 1 is implemented");
	}
	public int calculate()
	{
		int a=15,b=20;
		return(a*b);
	}
	public void draw1() {
		System.out.println("Interface 2 is implemented");
	}
	public int calculate1()
	{
		int a=15,b=20;
		return(a+b);
	}
	public static void main(String[] args) {
		implemInterface ob=new implemInterface();
		ob.draw();
		int r=ob.calculate();
		System.out.println("Result of Interface1 is : "+r);

		ob.draw1();
		int rs=ob.calculate1();
		System.out.println("Result of interface2 is : "+rs);

	}

}
