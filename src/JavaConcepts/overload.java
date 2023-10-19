package JavaConcepts;

public class overload {
	private int v1,v2,r;
	overload()
	{
		v1=10;
		v2=20;		
		r=0;
		
	}
	overload(int n,int m)
	{
		v1=n;
		v2=m;
	}
	public void add()
	{
		r=v1+v2;
		
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public void display()
	{
		System.out.println("Sum is "+r);
	}
	public static void main(String a[])
	{
		overload ob=new overload();
		ob.add();
		ob.display();
		overload ob1 =new overload(30,40);
		ob1.add();
		ob1.display();
		int result=ob.add(12,8);
		System.out.println("Result is "+result);
	}
}
