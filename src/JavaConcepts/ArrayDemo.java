package JavaConcepts;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]= {8,9,5,6,4,6,8};
		int b[];
		b=new int[] {2,4,6,8};
		int c[]=new int[5];
		
		c[0]=4;
		c[1]=2;
		c[2]=3;
		c[3]=5;
		c[4]=6;
		
//		System.out.println(a[3]);
//		System.out.println(b[2]);
//		System.out.println(c[0]);
		System.out.println("The Lenght : "+a.length);
		System.out.println("\n\nArray Values Before Modification: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n\nArray Values After Modification(Using For Loop): ");
	
		a[2]=9;
		a[5]=11;
		a[0]=10;
		
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n\nArray Values After Modification(Using While Loop): ");
		
		int i=0;
		while(i<a.length)
		{
			System.out.print(a[i++]+" ");
		}
		System.out.println("\n");
	
		for( int j:a)
		{
			
			System.out.println(j);
		}
		
		Arrays.sort(a);
		for(int t:a)
			System.out.println(t);
		
	}

}
