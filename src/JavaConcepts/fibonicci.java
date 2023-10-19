package JavaConcepts;

import java.util.Scanner;

public class fibonicci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int limit;
		System.out.println("Enter the limit of series");
		limit=sc.nextInt();
		int a=0,b=1,c;
		c=a+b;
		System.out.print(a+" "+b);
		for(int i=2;i<15;i++)
		{
			c=b+a;
			a=b;
			b=c;
			System.out.print(" "+c);
			
		}
		
	}

}
