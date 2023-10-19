package JavaConcepts;


class Parent{
	int val1=12,val2=23, result=0;
	void multiply()
	{
		result=val1*val2;
	}
	void display()
	{
		System.out.println("Result is  "+result);
	}
}

class Child extends Parent
{
	int v1=6,v2=9,r=0;
	void multiply()
	{
		r=v1*v2;
	}
	void add()
	{
		r=v1+v2;		
	}
		
}


public class inheritOverrid {
	
	public static void main(String ar[]) {
		Child ob=new Child();
		ob.multiply();
		ob.add();
		ob.display();
		Parent ob1=new Parent();
		ob1.multiply();
		ob1.display();
				
		
	}
	
	

}
